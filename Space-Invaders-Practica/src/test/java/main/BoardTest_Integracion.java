package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import space_invaders.sprites.Alien;
import space_invaders.sprites.Player;
import space_invaders.sprites.Shot;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class BoardTest_Integracion {

    private Board board;
    private Shot mockShot;
    private Alien mockAlien;

    @BeforeEach
    public void setUp() {
        board = new Board();
        if (board.getTimer().isRunning()) {
            board.getTimer().stop();
        }

        mockShot = Mockito.mock(Shot.class);
        mockAlien = Mockito.mock(Alien.class);

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

//-----------------update aliens------------------------------------

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

    //-----------------update bomb------------------------------------

    @Test
    public void testUpdateBomb_GeneracionYReinicio() {
        Alien.Bomb mockBomb = Mockito.mock(Alien.Bomb.class);

        when(mockAlien.isVisible()).thenReturn(true);
        when(mockAlien.getBomb()).thenReturn(mockBomb);
        when(mockBomb.isDestroyed()).thenReturn(true);

        // Asignamos posición del alien
        when(mockAlien.getX()).thenReturn(150);
        when(mockAlien.getY()).thenReturn(50);

        board.update_bomb();

        // Verificar que la bomba se reinicia
        verify(mockBomb).setX(150);
        verify(mockBomb).setY(50);
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

}
