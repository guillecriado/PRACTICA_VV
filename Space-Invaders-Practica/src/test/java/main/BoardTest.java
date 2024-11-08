package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import space_invaders.sprites.Alien;
import space_invaders.sprites.Player;
import space_invaders.sprites.Shot;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
        board.getTimer().stop();
    }
    //---------------------------------------------Prueba 1 gameInit()-----------------------------------------------------------------
    @Test
    void testgameInitR1() {
        board.getAliens().clear();// Incorrecto (No Aliens 24)
        assert (board.getAliens().size() != Commons.NUMBER_OF_ALIENS_TO_DESTROY); //Iniciar Aliens con 24 ->NO
    }

    @Test
    void testgameInitR2() {
        board.getAliens().get(0).setX(3); //Posición X Inicial y Desplazamiento pone a X < 5
        assert (board.getAliens().size() == Commons.NUMBER_OF_ALIENS_TO_DESTROY); //Iniciar Aliens con 24 ->SI
        assertFalse(board.getAliens().get(0).getX() >= (Commons.BORDER_LEFT)); //Iniciar Alienígen dentro de Board -> NO
    }

    @Test
    void testgameInitR3() {
        board.getAliens().get(0).setX(330); //Posición X Inicial y Desplazamiento X > 328
        assert (board.getAliens().size() == Commons.NUMBER_OF_ALIENS_TO_DESTROY); //Iniciar Aliens con 24 ->SI
        assertFalse(board.getAliens().get(0).getX() <= (Commons.BOARD_WIDTH - Commons.BORDER_RIGHT - Commons.ALIEN_WIDTH)); //Iniciar Alienígen dentro de Board -> NO
    }


    @Test
    void testGameInitR4() {
        board.getAliens().get(0).setY(-1); //Posición X Inicial y Desplazamiento y < 0
        assert (board.getAliens().size() == Commons.NUMBER_OF_ALIENS_TO_DESTROY); //Iniciar Aliens con 24 ->SI
        assertFalse(board.getAliens().get(0).getY() >= (0)); //Iniciar Alienígen dentro de Board -> NO
    }

    @Test
    void testGameInitR5() {
        board.getAliens().get(0).setY(400); //Posición X Inicial y Desplazamiento y > 350
        assert (board.getAliens().size() == Commons.NUMBER_OF_ALIENS_TO_DESTROY); //Iniciar Aliens con 24 ->SI
        assertFalse(board.getAliens().get(0).getY() <= (Commons.BOARD_HEIGHT)); //Iniciar Alienígen dentro de Board -> NO
    }

    @Test
    void testGameInitR6() {
        assert (board.getAliens().size() == Commons.NUMBER_OF_ALIENS_TO_DESTROY); //Iniciar Aliens con 24 ->SI
        board.getAliens().get(0).setX(0); //El primer Alien Inicia en posición ALIEN_INIT_Y (5)
        assertFalse(board.getAliens().get(0).getX() == (Commons.ALIEN_INIT_X)); //Colocar Alienígenas en Formación de Cuadrícula  -> NO
    }

    @Test
    void testGameInitR7() {
        assert (board.getAliens().size() == Commons.NUMBER_OF_ALIENS_TO_DESTROY); //Iniciar Aliens con 24 ->SI
        board.getAliens().get(0).setY(0); //El primer Alien Inicia en posición ALIEN_INIT_Y (350)
        assertFalse(board.getAliens().get(0).getY() == (Commons.ALIEN_INIT_Y)); //Colocar Alienígenas en Formación de Cuadrícula -> NO
    }


    // Este test va a fallar , es normal ya que en el codigo esta mal la posicion de los aliens
    @Test
    void testGameInitR8() {
        assert (board.getAliens().size() == Commons.NUMBER_OF_ALIENS_TO_DESTROY); //Iniciar Aliens con 24 ->SI
        checkAlienPosition(board.getAliens());
        assert (board.getPlayer() != null); // Inicializar Player -> SI
        assert (board.getShot() != null); // Inicializar Shot -> SI
    }

    //Iniciar Alienígen dentro de Board
    //Colocar Alienígenas en Formación de Cuadrícula
    private void checkAlienPosition(List<Alien> alienList) {

        int xLeftLimit = Commons.BORDER_LEFT;
        int xRightLimit = Commons.BOARD_WIDTH - Commons.BORDER_RIGHT - Commons.ALIEN_WIDTH;
        int yBottomLimit = 0;
        int yTopLimit = Commons.BOARD_HEIGHT;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                int index = i * 6 + j;
                int expectedX = Commons.ALIEN_INIT_X + 18 * j;
                int expectedY = Commons.ALIEN_INIT_Y + 18 * i;

                assertEquals(expectedX, alienList.get(index).getX(),
                        "Alien X position is incorrect. Index: " + index);
                assertEquals(expectedY, alienList.get(index).getY(),
                        "Alien Y position is incorrect. Index: " + index);

                int x = alienList.get(index).getX();
                assertTrue(x >= xLeftLimit && x <= xRightLimit,
                        "Alien X position is out of bounds. Index: " + index + ", X: " + x);

                int y = alienList.get(index).getY();
                assertTrue(y >= yBottomLimit && y <= yTopLimit,
                        "Alien Y position is out of bounds. Index: " + index + ", Y: " + y);
            }
        }
    }

    //---------------------------------------------Prueba 2 isInGame()-----------------------------------------------------------------


    @Test
    void testIsInGameCV1() {
        board.setInGame(true); // Llamar a isInGame() cuando el juego esté activo
        assertTrue(board.isInGame()); // InGame = true
    }

    @Test
    void testIsInGameCV2() {
        board.setInGame(false); // Llamar a isInGame() cuando el juego esté finalizado
        assertFalse(board.isInGame()); // InGame = false
    }

    //---------------------------------------------Prueba 3 update()-----------------------------------------------------------------


    //Es normal que falle , ya que en el codigo numero de contador coge el valor Commons.CHANCE
    @Test
    void testUpdateR1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        board.setDeaths(Commons.NUMBER_OF_ALIENS_TO_DESTROY); //Número de contador de muertes
        reflectMethod("update");
        assertFalse(board.isInGame()); // Si el jugador ha perdido todas las vidas, el juego termina
    }


    @Test
    void testUpdateR2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        board.setDeaths(0); //Número de contador de muertes
        int positionXBeforeUpdate = board.getAliens().get(0).getX();
        reflectMethod("update");
        int positionXAfterUpdate = board.getAliens().get(0).getX();
        assertNotEquals(positionXBeforeUpdate, positionXAfterUpdate); // Mover
        assertFalse(board.isInGame()); // Si el jugador ha perdido todas las vidas, el juego termina
    }

    //---------------------------------------------Prueba 4 update_aliens() -----------------------------------------------------------------

    // Es normal que falle , para comprobar borde de derecha el codigo esta haciendo
    // if (x <= Commons.BOARD_WIDTH - Commons.BORDER_RIGHT && direction != -1)
    @Test
    void testUpdateAliensR1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int positionYBeforeUpdate = board.getAliens().getFirst().getY();
        board.getAliens().getFirst().setX(Commons.BOARD_WIDTH - Commons.BORDER_RIGHT);//Llega a borde derecho
        board.setDirection(1); //Mueve el alienígena hacia la derecha
        reflectMethod("update_aliens");
        int positionYAfterUpdate = board.getAliens().getFirst().getY();
        int diff = (positionYAfterUpdate - positionYBeforeUpdate);
        assertEquals(Commons.GO_DOWN, diff); // Cambiar dirección y mover hacia abajo
    }


    //Es normal que falle , ya que en el codigo cuando llega borde izquierdo hace  a.setX(a.getY() + Commons.GO_DOWN);
    // no cambia posicion en Y
    @Test
    void testUpdateAliensR2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int positionYBeforeUpdate = board.getAliens().getFirst().getY();
        board.getAliens().getFirst().setX(Commons.BORDER_LEFT);//Llega a borde izquierdo
        board.setDirection(-1); //Mueve el alienígena hacia la izquierda
        reflectMethod("update_aliens");
        int positionYAfterUpdate = board.getAliens().getFirst().getY();
        int diff = (positionYAfterUpdate - positionYBeforeUpdate) / Commons.NUMBER_OF_ALIENS_TO_DESTROY;
        System.out.println(positionYAfterUpdate);
        System.out.println(positionYBeforeUpdate);
        assertEquals(Commons.GO_DOWN, diff); // Cambiar dirección y mover hacia abajo
    }

    //Es normal que falle ,  para comprobar borde de derecha el codigo esta haciendo
    //    // if (x <= Commons.BOARD_WIDTH - Commons.BORDER_RIGHT && direction != -1)
    @Test
    void testUpdateAliensR3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int positionXBeforeUpdate = board.getAliens().get(2).getX();
        board.setDirection(2); //Mueve el alienígena hacia la izquierda
        reflectMethod("update_aliens");
        int positionXAfterUpdate = board.getAliens().get(2).getX();
        int expectedPositionMoved = -1 + Commons.ALIEN_WIDTH;
        int diff = (positionXAfterUpdate - positionXBeforeUpdate);
        assertEquals(expectedPositionMoved, diff); // Mover
    }

    //Es normal que falle ,  para comprobar borde de derecha el codigo esta haciendo
    @Test
    void testUpdateAliensR4() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int positionXBeforeUpdate = board.getAliens().get(2).getX();
        board.setDirection(1); //Mueve el alienígena hacia la derecha
        reflectMethod("update_aliens");
        int positionXAfterUpdate = board.getAliens().get(2).getX();
        int expectedPositionMoved = 1 + Commons.ALIEN_WIDTH;
        int diff = (positionXAfterUpdate - positionXBeforeUpdate);
        assertEquals(expectedPositionMoved, diff); // Mover
    }


    @Test
    void testUpdateAliensR5() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        board.getAliens().getFirst().setY(Commons.GROUND + Commons.ALIEN_HEIGHT * 2);//Llega a borde inferior
        reflectMethod("update_aliens");
        assertFalse(board.isInGame()); //Termina Juego
        assertEquals("Invasion!", board.getMessage()); //Mensaje Invasión
    }


    //---------------------------------------------Prueba 5 update_bomb() -----------------------------------------------------------------


    //Normal que falle , inicializar bomb con destoryed = true
    // private void initBomb(int x, int y) {
    //            setDestroyed(true);
    @Test
    void testUpdateBombR1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        reflectMethod("update_bomb");
        assertFalse(board.getAliens().getFirst().getBomb().isDestroyed()); //Cambiar estado de Bombas (destroyed)
        assertNotNull(board.getAliens().getFirst().getBomb()); //Crear bomba
    }

    @Test
    void testUpdateBombR2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        board.getAliens().getFirst().getBomb().setDestroyed(false); //Ha sido destruido/no ha sido creado -> NO
        int positionYBeforeUpdate = board.getAliens().getFirst().getBomb().getY();
        reflectMethod("update_bomb");
        int positionYAfterUpdate = board.getAliens().getFirst().getBomb().getY();
        assertNotEquals(positionYBeforeUpdate, positionYAfterUpdate); //Bajará verticalmente
    }

    //Es normal que falle , ya que en el codigo cuando llega a suelo cambia a destroyed = false
    // if (bomb.getY() >= Commons.GROUND - Commons.BOMB_HEIGHT) {
    //
    //                    bomb.setDestroyed(false);
    //                }
    @Test
    void testUpdateBombR3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        board.getAliens().getFirst().getBomb().setDestroyed(false); //Ha sido destruido/no ha sido creado -> NO
        board.getAliens().getFirst().getBomb().setY(Commons.GROUND - Commons.BOMB_HEIGHT); //Bomba ha llegado al suelo
        reflectMethod("update_bomb");
        assertTrue(board.getAliens().getFirst().getBomb().isDestroyed()); //Cambiar estado de Bombas (destroyed)
        assertNotNull(board.getAliens().getFirst().getBomb()); //Crear bomba
    }


    //Normal que falle , ya que en el codigo cuando llega a suelo cambia a setDying = false
    // var ii = new ImageIcon(explImg);
    //                    this.player.setImage(ii.getImage());
    //                    this.player.setDying(false);
    @Test
    void testUpdateBombR4() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        board.getAliens().getFirst().getBomb().setDestroyed(false); //Ha sido destruido/no ha sido creado -> NO
        //Simultar Si jugador alcanza bomba
        Player player = board.getPlayer();
        player.setX(100);
        player.setY(200);
        Alien.Bomb bomb = board.getAliens().getFirst().getBomb();
        bomb.setDestroyed(false);
        bomb.setX(110);
        bomb.setY(210);
        reflectMethod("update_bomb");
        assertTrue(board.getAliens().getFirst().getBomb().isDestroyed()); //Cambiar estado de Bombas (destroyed)
        assertTrue(player.isDying()); //Estado de jugador (setDying)
        assertNotNull(board.getAliens().getFirst().getBomb().getImage()); //: Cambia imagen por la animación de explosición
    }

    //---------------------------------------------Prueba 6 update_shots() -----------------------------------------------------------------

    @Test
    void testUpdateShotsR1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int samePositionY=100;

        Shot shot = board.getShot();
        int positionYBeforeUpdate = shot.getY();

        shot.setX(100); // : Posicion X disparo -> No es igual a la posición X del Alien
        board.getAliens().getFirst().setX(200); //Posición X Alien -> No es igual a la posición X del disparo

        board.getAliens().getFirst().setY(samePositionY); //Posición Y disparo -> Es igual a la posición Y del Alien
        shot.setY(samePositionY); // //Posición Y disparo -> Es igual a la posición Y del Alien

        reflectMethod("update_shots");
        int positionYAfterUpdate = board.getShot().getY();
        assertFalse(board.getAliens().getFirst().isDying());  //Alien Dying -> FALSE
        assertNotEquals(positionYAfterUpdate, positionYBeforeUpdate); // Desplazamiento del disparo hacia arriba
    }

    @Test
    void testUpdateShotsR2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int samePositionX=100;

        Shot shot = board.getShot();
        int positionYBeforeUpdate = shot.getY();

        shot.setX(samePositionX); // : Posicion X disparo -> Es igual a la posición X del Alien
        board.getAliens().getFirst().setX(samePositionX); //Posición X Alien -> Es igual a la posición X del disparo

        board.getAliens().getFirst().setY(100); //Posición Y disparo -> NO Es igual a la posición Y del Alien
        shot.setY(200); // //Posición Y disparo -> NO Es igual a la posición Y del Alien

        reflectMethod("update_shots");
        int positionYAfterUpdate = board.getShot().getY();
        assertFalse(board.getAliens().getFirst().isDying());  //Alien Dying -> FALSE
        assertNotEquals(positionYAfterUpdate, positionYBeforeUpdate); // Desplazamiento del disparo hacia arriba
    }


    //Normal falla en         assertEquals(numberDeathsBeforeShot+1,numberDeathsAfterShot); // Contador de muertes suma 1
    // en codigo hace     deaths--;

    @Test
    void testUpdateShotsR3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int samePositionX=100;
        int samePositionY=100;

        int numberDeathsBeforeShot = board.getDeaths();
        Shot shot = board.getShot();
        int positionYBeforeUpdate = shot.getY();

        shot.setX(samePositionX); // : Posicion X disparo -> Es igual a la posición X del Alien
        board.getAliens().getFirst().setX(samePositionX); //Posición X Alien -> Es igual a la posición X del disparo

        board.getAliens().getFirst().setY(samePositionY); //Posición Y disparo -> Es igual a la posición Y del Alien
        shot.setY(samePositionY); // //Posición Y disparo -> Es igual a la posición Y del Alien

        reflectMethod("update_shots");

        int numberDeathsAfterShot = board.getDeaths();
        int positionYAfterUpdate = board.getShot().getY();
        assertTrue(board.getAliens().getFirst().isDying());  //Alien Dying -> TRUE
        assertEquals(numberDeathsBeforeShot+1,numberDeathsAfterShot); // Contador de muertes suma 1
    }


    //reflexión
    private void reflectMethod(String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method privateMethod = Board.class.getDeclaredMethod(methodName);
        privateMethod.setAccessible(true);
        privateMethod.invoke(board);
    }

}
