package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import space_invaders.sprites.Alien;
import space_invaders.sprites.Player;
import space_invaders.sprites.Shot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class BoardTest_Integracion {

    private Board board;
    private Shot mockShot;
    private Alien mockAlien;
    private Player playerReal;
    private ArrayList<Alien> realAliens;
    private Shot realShot;

    @BeforeEach
    public void setUp() {
        board = new Board();
        if (board.getTimer().isRunning()) {
            board.getTimer().stop();
        }
        mockShot = Mockito.mock(Shot.class);
        mockAlien = Mockito.mock(Alien.class);
        playerReal=new Player();
        realShot=new Shot();
        realAliens= new ArrayList<Alien>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                var alien = new Alien(Commons.ALIEN_INIT_X + 18 * j, // en linea 93 antes ponia Commons.ALIEN_INIT_Y
                        Commons.ALIEN_INIT_Y + 18 * i);
                this.realAliens.add(alien);
            }
        }
        board.setShot(mockShot);
        board.setAliens(new ArrayList<>(List.of(mockAlien)));
    }



    @Test
    public void testGameInit() {
        Board board = new Board();
        board.gameInit();

        // Verificar la inicialización de los alienígenas
        assertEquals(Commons.NUMBER_OF_ALIENS_TO_DESTROY, board.getAliens().size());

        // Verificar la inicialización del jugador
        assertNotNull(board.getPlayer());

        // Verificar la inicialización del disparo
        assertNotNull(board.getShot());
    }


    @DisplayName("Test integración método update con todo mocks")
    @Test
    public void testUpdate() {
        Board board = Mockito.spy(new Board());

        Player mockPlayer = mock(Player.class);
        board.setPlayer(mockPlayer);

        board.update();

        verify(mockPlayer, Mockito.times(1)).act();
        verify(board, Mockito.times(1)).update_shots();
        verify(board, Mockito.times(1)).update_aliens();
        verify(board, Mockito.times(1)).update_bomb();
    }

    @DisplayName("Test integración método update con Player real ")
    @Test
    public void testUpdate2() {
        board = Mockito.spy(new Board());
        board.setPlayer(playerReal);
        board.update();

        verify(board, Mockito.times(1)).update_shots();
        verify(board, Mockito.times(1)).update_aliens();
        verify(board, Mockito.times(1)).update_bomb();
        assertAll(
                ()->assertEquals(161, board.getPlayer().getX()),
                ()->assertEquals(280, board.getPlayer().getY())
        );
    }

    @DisplayName("Test integración método update con Player y Shot real ")
    @Test
    public void testUpdate3() {
        board = Mockito.spy(new Board());
        board.setPlayer(playerReal);
        board.setShot(realShot);
        board.update();

        verify(board, Mockito.times(1)).update_aliens();
        verify(board, Mockito.times(1)).update_bomb();
        assertAll(
                ()->assertEquals(161, board.getPlayer().getX(), "Mal la X de Player"),
                ()->assertEquals(280, board.getPlayer().getY(),"Mal la Y de Player"),
                ()->assertFalse(board.getShot().isVisible(), "Mal Shot")
        );
    }

    @DisplayName("Test integración método update con Player, Shot y Aliens real ")
    @Test
    public void testUpdate4() {
        board = Mockito.spy(new Board());
        board.setPlayer(playerReal);
        board.setShot(realShot);
        board.setAliens(realAliens);
        board.update();


        verify(board, Mockito.times(1)).update_bomb();
        assertAll(
                ()->assertEquals(161, board.getPlayer().getX(), "Mal la X de Player"),
                ()->assertEquals(280, board.getPlayer().getY(),"Mal la Y de Player"),
                ()->assertFalse(board.getShot().isVisible(), "Mal Shot"),
                ()->assertEquals(24, board.getAliens().size(), "Mal Aliens")
        );
    }

    @DisplayName("Test integración método update con todo real ")
    @Test
    public void testUpdate5() {
        board = Mockito.spy(new Board());
        board.setPlayer(playerReal);
        board.setShot(realShot);
        board.setAliens(realAliens);
        board.update();
        int bombas=this.contarBombas(board.getAliens());

        assertAll(
                ()->assertEquals(161, board.getPlayer().getX(), "Mal la X de Player"),
                ()->assertEquals(280, board.getPlayer().getY(),"Mal la Y de Player"),
                ()->assertFalse(board.getShot().isVisible(), "Mal Shot"),
                ()->assertEquals(24, board.getAliens().size(), "Mal Aliens"),
                ()->assertEquals(24,bombas, "Mal bombas")
        );
    }

    private int contarBombas(List<Alien> aliens){
        int bombas=0;
        for (Alien alien:aliens){
            if(alien.getBomb()!=null){
                bombas++;
            }
        }
        return bombas;
    }


//--------------------------------------------testUpdate Shots------------------------------------------------

    //Probar liena 286

    @Test
    public void testUpdateShots_VisibilidadYPosicion1() {
        // Disparo en posición intermedia y visible
        when(mockShot.isVisible()).thenReturn(true);
        when(mockShot.getX()).thenReturn(100);
        when(mockShot.getY()).thenReturn(100);
        when(mockAlien.isVisible()).thenReturn(true);
        when(mockAlien.getX()).thenReturn(200);
        when(mockAlien.getY()).thenReturn(200);
        board.update_shots();
        // Debe mover el disparo hacia arriba en 4 pixeles: de Y=100 a Y=96
        verify(mockShot).setY(96);
    }


    @Test
    public void testUpdateShots_VisibilidadYPosicion1_real() {
        // Disparo en posición intermedia y visible

        board.setAliens(realAliens);
        board.setShot(realShot);
        realShot.setVisible(true);
        realShot.setX(100);
        realShot.setY(100);
        for(Alien alien:realAliens){
            alien.setVisible(true);
            alien.setX(200);
            alien.setY(200);
        }
        board.update_shots();
        // Debe mover el disparo hacia arriba en 4 pixeles: de Y=100 a Y=96
        assertEquals(96, realShot.getY());
    }


    //Probar liena 284
    @Test
    public void testUpdateShots_VisibilidadYPosicion2() {
        // Ahora simulamos que el disparo está en el borde superior
        reset(mockShot);
        when(mockShot.isVisible()).thenReturn(true);
        when(mockShot.getX()).thenReturn(100);
        when(mockShot.getY()).thenReturn(-1);
        when(mockAlien.isVisible()).thenReturn(false);

        board.update_shots();
        // Al pasar de Y=-1 a Y<0, el disparo debe morir
        verify(mockShot, times(1)).die();
    }

    //Probar liena 284
    @Test
    public void testUpdateShots_VisibilidadYPosicion2_real() {
        // Ahora simulamos que el disparo está en el borde superio
        board.setAliens(realAliens);
        board.setShot(realShot);
        realShot.setVisible(true);
        realShot.setX(100);
        realShot.setY(-1);
        for(Alien alien:realAliens){
            alien.setVisible(false);
        }
        board.update_shots();
        // Al pasar de Y=-1 a Y<0, el disparo debe morir
        assertFalse(realShot.isDying());
    }


    //Probar 237 hasta 276

    @Test
    public void testUpdateShots_InteraccionDisparoAlien() {
        // Configurar colisión: disparo y alien en la misma posición
        when(mockShot.isVisible()).thenReturn(true);
        when(mockShot.getX()).thenReturn(150);
        when(mockShot.getY()).thenReturn(150);

        when(mockAlien.isVisible()).thenReturn(true);
        when(mockAlien.getX()).thenReturn(150);
        when(mockAlien.getY()).thenReturn(150);

        board.update_shots();

        verify(mockAlien, times(1)).setDying(true);
        verify(mockShot, times(1)).die();
        assertEquals(1, board.getDeaths());
    }

    @Test
    public void testUpdateShots_InteraccionDisparoAlien_real() {
        // Configurar colisión: disparo y alien en la misma posición

        board.setShot(realShot);
        realShot.setVisible(true);
        realShot.setX(150);
        realShot.setY(150);
        for(Alien alien:realAliens){
            alien.setVisible(true);
            alien.setX(150);
            alien.setY(150);
        }
        board.setAliens(realAliens);
        board.update_shots();

        assertTrue(realAliens.getFirst().isDying());
        assertFalse(realShot.isDying());
        assertEquals(1, board.getDeaths());
    }


    @Test
    public void testUpdateShots_MuerteDisparoFueraPantalla() {
        // Disparo justo arriba, sin alien visible
        when(mockShot.isVisible()).thenReturn(true);
        when(mockShot.getX()).thenReturn(100);
        when(mockShot.getY()).thenReturn(0);
        when(mockAlien.isVisible()).thenReturn(false);

        board.update_shots();

        // Debe morir al cruzar el límite superior
        verify(mockShot, times(1)).die();
        assertEquals(0, board.getDeaths());
    }

    @Test
    public void testUpdateShots_MuerteDisparoFueraPantalla_real() {
        // Disparo justo arriba, sin alien visible
        board.setShot(realShot);
        realShot.setVisible(true);
        realShot.setX(100);
        realShot.setY(0);
        for(Alien alien:realAliens){
            alien.setVisible(false);
        }
        board.setAliens(realAliens);
        board.update_shots();

        // Debe morir al cruzar el límite superior
        assertFalse(realShot.isDying());
        assertEquals(0, board.getDeaths());
    }

//-----------------update aliens------------------------------------

    @Nested
    class testUpdateAliens_Mocks{
        @Test
        public void testUpdateAliens_ChangeDirectionAtRightEdge() {
            when(mockAlien.isVisible()).thenReturn(true);
            when(mockAlien.getX()).thenReturn(Commons.BOARD_WIDTH - Commons.BORDER_RIGHT);
            when(mockAlien.getY()).thenReturn(50);

            // Dirección inicial hacia la derecha para forzar el cambio
            board.setDirection(1);

            board.update_aliens();

            // Debe cambiar la dirección a -1 al alcanzar el borde
            assertEquals(-1, board.getDirection(), "La dirección debería cambiar a 0 tras alcanzar el borde derecho.");
            // Alien debe bajar Commons.GO_DOWN
            verify(mockAlien, atLeastOnce()).setY(50 + Commons.GO_DOWN);
        }

        @Test
        public void testUpdateAliens_ChangeDirectionAtLeftEdge() {
            when(mockAlien.isVisible()).thenReturn(true);
            // Aseguramos que el alien esté en el borde izquierdo exacto
            when(mockAlien.getX()).thenReturn(Commons.BORDER_LEFT);
            when(mockAlien.getY()).thenReturn(60);

            // Dirección hacia la izquierda
            board.setDirection(-1);

            board.update_aliens();

            // Ahora el alien alcanza el borde izquierdo, direction debería cambiar a 1
            assertEquals(1, board.getDirection(), "La dirección debería cambiar a 1 tras alcanzar el borde izquierdo.");

            // Verifica que el alien se haya movido hacia abajo
            verify(mockAlien, atLeastOnce()).setY(60 + Commons.GO_DOWN);
        }

        @Test
        public void testUpdateAliens_InvasionCondition() {
            when(mockAlien.isVisible()).thenReturn(true);
            when(mockAlien.getX()).thenReturn(100);
            when(mockAlien.getY()).thenReturn(Commons.GROUND - Commons.ALIEN_HEIGHT + 1);

            board.update_aliens();

            assertFalse(board.isInGame(), "El juego debe terminar si el alien cruza el umbral vertical.");
            assertEquals("Invasion!", board.getMessage(), "El mensaje debe ser 'Invasion!' cuando los aliens invaden.");
        }

        @Test
        public void testUpdateAliens_AlienMovementIntegration() {
            when(mockAlien.isVisible()).thenReturn(true);
            when(mockAlien.getX()).thenReturn(100);
            when(mockAlien.getY()).thenReturn(100);

            board.setDirection(-1);
            board.update_aliens();

            // Verificar que se llamó act(-1)
            verify(mockAlien, atLeastOnce()).act(-1);
        }
    }

    @Nested
    class testUpdateAliens_Real{
        @Test
        public void testUpdateAliens_ChangeDirectionAtRightEdge_Real() {
            board.setAliens(realAliens);
            for(Alien alien:realAliens){
                alien.setVisible(true);
                alien.setX(Commons.BOARD_WIDTH - Commons.BORDER_RIGHT);
                alien.setY(50);
            }

            // Dirección inicial hacia la derecha para forzar el cambio
            board.setDirection(1);

            board.update_aliens();

            // Debe cambiar la dirección a -1 al alcanzar el borde
            assertEquals(-1, board.getDirection(), "La dirección debería cambiar a 0 tras alcanzar el borde derecho.");
            // Alien debe bajar Commons.GO_DOWN
            assertEquals((50 + Commons.GO_DOWN), realAliens.getFirst().getY() );
        }

        @Test
        public void testUpdateAliens_ChangeDirectionAtLeftEdge_Real() {
            board.setAliens(realAliens);
            for(Alien alien:realAliens){
                alien.setVisible(true);
                alien.setX(Commons.BORDER_LEFT);
                alien.setY(60);
            }

            // Dirección hacia la izquierda
            board.setDirection(-1);

            board.update_aliens();

            // Ahora el alien alcanza el borde izquierdo, direction debería cambiar a 1
            assertEquals(1, board.getDirection(), "La dirección debería cambiar a 1 tras alcanzar el borde izquierdo.");

            // Verifica que el alien se haya movido hacia abajo
            assertEquals((60 + Commons.GO_DOWN), realAliens.getFirst().getY());
        }

        @Test
        public void testUpdateAliens_InvasionCondition_Real() {
            board.setAliens(realAliens);
            for(Alien alien:realAliens){
                alien.setVisible(true);
                alien.setX(100);
                alien.setY(Commons.GROUND - Commons.ALIEN_HEIGHT + 1);
            }

            board.update_aliens();

            assertFalse(board.isInGame(), "El juego debe terminar si el alien cruza el umbral vertical.");
            assertEquals("Invasion!", board.getMessage(), "El mensaje debe ser 'Invasion!' cuando los aliens invaden.");
        }

        @Test
        public void testUpdateAliens_AlienMovementIntegration_Real() {
            board.setAliens(realAliens);
            for(Alien alien:realAliens){
                alien.setVisible(true);
                alien.setX(100);
                alien.setY(100);
            }

            board.setDirection(-1);
            board.update_aliens();

            // Verificar que se llamó act(-1)
            assertEquals(-1, board.getDirection());
        }
    }

    //-----------------update bomb------------------------------------

    @Test
    public void testUpdateBomb_GeneracionYReinicio() {
        Alien.Bomb mockBomb = Mockito.mock(Alien.Bomb.class);
        when(mockAlien.getBomb()).thenReturn(mockBomb);
        when(mockAlien.isVisible()).thenReturn(true);
        when(mockBomb.isDestroyed()).thenReturn(true);

        // Asignamos posición del alien
        when(mockAlien.getX()).thenReturn(150);
        when(mockAlien.getY()).thenReturn(50);

        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(15)).thenReturn(Commons.CHANCE);
        board.setGenerator(mockRandom);

        board.update_bomb();

        // Verificar que la bomba se reinicia
        verify(mockBomb).setDestroyed(false);
        verify(mockBomb).setX(150);
        verify(mockBomb).setY(50);
    }

    @Test
    public void testUpdateBomb_GeneracionYReinicio_Real() {

        board.setAliens(realAliens);

        Alien firstAlien=realAliens.getFirst();
        Alien.Bomb realBom =firstAlien.getBomb();

        firstAlien.setVisible(true);
        realBom.setDestroyed(true);

        firstAlien.setX(150);
        firstAlien.setY(50);

        class FixedRandom extends Random {
            private final int fixedValue;
            public FixedRandom(int fixedValue) {
                this.fixedValue = fixedValue;
            }
            @Override
            public int nextInt(int bound) {
                return fixedValue % bound;
            }
        }

        board.setGenerator(new FixedRandom(Commons.CHANCE));

        board.update_bomb();

        // Verificar que la bomba se reinicia
        assertFalse(realBom.isDestroyed());
    }



    @Test
    public void testUpdateBomb_InteraccionBombaJugador() {
        Alien.Bomb mockBomb = Mockito.mock(Alien.Bomb.class);
        when(mockAlien.getBomb()).thenReturn(mockBomb);

        // Suponemos que la bomba no está destruida y el alien es visible
        when(mockAlien.isVisible()).thenReturn(true);
        when(mockBomb.isDestroyed()).thenReturn(false);

        // Posición del alien (y por ende la bomba)
        when(mockBomb.getX()).thenReturn(100);
        when(mockBomb.getY()).thenReturn(200);

        // Posición del jugador
        Player player = board.getPlayer();
        player.setX(100);
        player.setY(200);


        board.update_bomb();

        // Verificar que el jugador se marque como dying
        assertTrue(player.isDying(), "El jugador debería estar moribundo tras el impacto de la bomba.");
        verify(mockBomb).setDestroyed(true);
    }

    @Test
    public void testUpdateBomb_InteraccionBombaJugador_Real() {
//        Alien.Bomb mockBomb = Mockito.mock(Alien.Bomb.class);
//        when(mockAlien.getBomb()).thenReturn(mockBomb);
//
//        // Suponemos que la bomba no está destruida y el alien es visible
//        when(mockAlien.isVisible()).thenReturn(true);
//        when(mockBomb.isDestroyed()).thenReturn(false);
//
//        // Posición del alien (y por ende la bomba)
//        when(mockBomb.getX()).thenReturn(100);
//        when(mockBomb.getY()).thenReturn(200);

        board.setAliens(realAliens);
        for(Alien alien:realAliens){
            alien.setX(100);
            alien.setY(200);
            alien.setVisible(true);
            alien.getBomb().setDestroyed(false);
            alien.getBomb().setX(100);
            alien.getBomb().setY(200);
        }

        // Posición del jugador
        Player player = board.getPlayer();
        player.setX(100);
        player.setY(200);

        board.setPlayer(player);

        board.update_bomb();

        // Verificar que el jugador se marque como dying
        assertTrue(player.isDying(), "El jugador debería estar moribundo tras el impacto de la bomba.");
        assertTrue(realAliens.getFirst().getBomb().isDestroyed());
        //verify(mockBomb).setDestroyed(true);
    }


    @Test
    public void testUpdateBomb_MovimientoYDestruccion() {
        Alien.Bomb mockBomb = Mockito.mock(Alien.Bomb.class);
        when(mockAlien.getBomb()).thenReturn(mockBomb);
        when(mockAlien.isVisible()).thenReturn(true);

        // Bomba no destruida inicialmente
        when(mockBomb.isDestroyed()).thenReturn(false);

        // Caso 3a: Mover la bomba hacia abajo
        when(mockBomb.getX()).thenReturn(120);
        when(mockBomb.getY()).thenReturn(100);

        Player player = board.getPlayer();
        player.setX(200); // Posición lejana al bomb
        player.setY(200);

        board.update_bomb();
        // Verificamos que la bomba se mueve hacia abajo en +1 píxel
        verify(mockBomb).setY(101);

        reset(mockBomb);
        when(mockBomb.isDestroyed()).thenReturn(false);
        when(mockBomb.getX()).thenReturn(120);
        when(mockBomb.getY()).thenReturn(Commons.GROUND - Commons.BOMB_HEIGHT);

        board.update_bomb();
        verify(mockBomb).setY(Commons.GROUND - Commons.BOMB_HEIGHT + 1);
        verify(mockBomb).setDestroyed(true);
    }


    @Test
    public void testUpdateBomb_MovimientoYDestruccion_Real() {
        board.setAliens(realAliens);
        Alien firstAlien=realAliens.getFirst();
        Alien.Bomb realBom =firstAlien.getBomb();
        firstAlien.setVisible(true);
        realBom.setDestroyed(false);
        realBom.setX(120);
        realBom.setY(100);
        board.update_bomb();

        // Verificamos que la bomba se mueve hacia abajo en +1 píxel
        assertEquals(101, realBom.getY());
        assertFalse(realBom.isDestroyed());
        assertEquals(120, realBom.getX());
    }
}
