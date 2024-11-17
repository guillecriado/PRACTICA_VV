package space_invaders.sprites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Caja blanca de la clase Player")
class PlayerTest_CajaBlanca {

    Player player;
    /**
     * Esta es la posición en eje X central en la que tendría que estar el player
     */
    int posicionInicialXEsperada;

    /**
     * Esta es la posición en eje Y central en la que tendría que estar el player
     */
    int posicionInicialYEsperada;

    /**
     * Es la variable de la tecla de la flecha izquierda
     */
    KeyEvent eventoIzquierda;
    /**
     * Es la variable de la tecla de la flecha derecha
     */
    KeyEvent eventoDerecha;
    /**
     * Es la variable de cualquier tecla que no sea flecha derecha o izquierda
     */
    KeyEvent eventoAleatorio;
    @BeforeEach
    void setUp() {
        player= new Player();
        posicionInicialXEsperada = 161;
        posicionInicialYEsperada = 179;
        eventoIzquierda = new KeyEvent(new java.awt.Component(){}, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);
        eventoDerecha= new KeyEvent(new java.awt.Component(){}, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);
        eventoAleatorio=new KeyEvent(new java.awt.Component(){}, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_0, KeyEvent.CHAR_UNDEFINED);
    }

    @Test
    @DisplayName("act(): Camino 1")
    void actCP1() {
        player.setX(0);
        player.act();
        assertEquals(5, player.getX());
    }

    @Test
    @DisplayName("act(): Camino 2")
    void actCP2() {
        player.setX(5);
        player.act();
        assertEquals(5, player.getX());
    }

    @Test
    @DisplayName("keyPressed(): Camino 1")
    void keyPressedCP1() {
        player.dx=0; // Lo ponemos a 0 para evitar posibles interferencias al haber realizado otros test
        player.keyPressed(eventoAleatorio);
        assertEquals(0,player.dx);
    }

    @Test
    @DisplayName("keyPressed(): Camino 2")
    void keyPressedCP2() {
        player.dx=0; // Lo ponemos a 0 para evitar posibles interferencias al haber realizado otros test
        player.keyPressed(eventoIzquierda);
        assertEquals(-2,player.dx);
    }

    @Test
    @DisplayName("keyPressed(): Camino 3")
    void keyPressedCP3() {
        player.dx=0; // Lo ponemos a 0 para evitar posibles interferencias al haber realizado otros test
        player.keyPressed(eventoDerecha);
        assertEquals(2,player.dx);
    }


    @Test
    @DisplayName("keyReleased(): Camino 1")
    void keyReleasedCP1() {
        player.keyReleased(eventoIzquierda);
        assertEquals(0,player.dx);
    }

    @Test
    @DisplayName("keyReleased(): Camino 2")
    void keyReleasedCP2() {
        player.keyReleased(eventoDerecha);
        assertEquals(0,player.dx);
    }

    @Test
    @DisplayName("keyReleased(): Camino 3")
    void keyReleasedCP3() {
        player.keyReleased(eventoAleatorio);
        assertEquals(0,player.dx);
    }
}