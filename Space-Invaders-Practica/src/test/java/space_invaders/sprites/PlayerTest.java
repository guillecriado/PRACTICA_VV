package space_invaders.sprites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player;
    /**
     * Esta es la posición en eje X central en la que tendría que estar el player
     */
    int posicionInicialXEsperada;

    /**
     * Esta es la posición en eje Y central en la que tendría que estar el player
     */
    int posicionInicialYEsperada;


    @BeforeEach
    void setUp() {
        player= new Player();
        posicionInicialXEsperada = 161;
        posicionInicialYEsperada = 179;
    }

    @Test
    void init_player(){
        assertAll(
                ()->assertEquals(posicionInicialXEsperada,player.getX()),
                ()->assertEquals(posicionInicialYEsperada,player.getY())
        );
    }

    @Test
    void act() {
        player.setX(19);
        player.act();
        assertEquals(20,player.getX());
    }

    @Test
    void keyPressed() {
    }

    @Test
    void keyReleased() {
    }
}