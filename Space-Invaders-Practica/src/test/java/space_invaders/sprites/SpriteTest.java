package space_invaders.sprites;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class SpriteTest {


    Sprite sprite ;

    @BeforeEach
    void setUp() {
        sprite = new Sprite();
    }

    @Test
    void die() {
        sprite.die();
        assertFalse(sprite.isVisible());
    }

    @Test
    void isVisibleReturnTrue() {
        sprite.setVisible(true);
        assertTrue(sprite.isVisible());
    }

    @Test
    void isVisibleReturnFalse() {
        sprite.setVisible(false);
        assertFalse(sprite.isVisible());
    }

}