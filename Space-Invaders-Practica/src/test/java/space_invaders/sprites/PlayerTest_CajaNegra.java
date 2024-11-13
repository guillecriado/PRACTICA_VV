package space_invaders.sprites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.event.KeyEvent;


import static org.junit.jupiter.api.Assertions.*;

class PlayerTest_CajaNegra {

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
    void init_player(){
        assertAll(
                ()->assertEquals(posicionInicialXEsperada,player.getX()),
                ()->assertEquals(posicionInicialYEsperada,player.getY())
        );
    }

    @Test
    void actCP1() {
        player.setX(4);
        player.act();
        assertEquals(5,player.getX());
    }

    @Test
    void actCP2(){
       player.setX(5);
       player.act();
       assertEquals(5,player.getX());
    }

    @Test
    void actCP3(){
        player.setX(6);
        player.act();
        assertEquals(6,player.getX());
    }

    @Test
    void actCP4(){
        player.setX(159);
        player.act();
        assertEquals(159,player.getX());
    }

    @Test
    void actCP5(){
        player.setX(312);
        player.act();
        assertEquals(312,player.getX());
    }

    @Test
    void actCP6(){
        player.setX(313);
        player.act();
        assertEquals(313,player.getX());
    }

    @Test
    void actCP7(){
        player.setX(314);
        player.act();
        assertEquals(314,player.getX());
    }

    @Test
    void keyPressedCP1() {
        player.dx=0; // Lo ponemos a 0 para evitar posibles interferencias al haber realizado otros test
        player.keyPressed(eventoIzquierda);
        assertEquals(-2,player.dx);
    }

    @Test
    void keyPressedCP2() {
        player.dx=0; // Lo ponemos a 0 para evitar posibles interferencias al haber realizado otros test
        player.keyPressed(eventoDerecha);
        assertEquals(2,player.dx);
    }

    @Test
    void keyPressedCP3(){
        player.dx=0; // Lo ponemos a 0 para evitar posibles interferencias al haber realizado otros test
        player.keyPressed(eventoAleatorio);
        assertEquals(0,player.dx);
    }

    @Test
    void keyReleasedCP1() {
        player.keyReleased(eventoIzquierda);
        assertEquals(0,player.dx);
    }

    @Test
    void keyReleasedCP2() {
        player.keyReleased(eventoDerecha);
        assertEquals(0,player.dx);
    }

    @Test
    void keyReleasedCP3() {
        player.keyReleased(eventoAleatorio);
        assertEquals(0,player.dx);
    }
}