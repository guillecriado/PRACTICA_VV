package space_invaders.sprites;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SpriteTest_CajaNegra {


    Sprite sprite;

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

    @Test
    void isDyingReturnTrue() {
        sprite.setDying(true);
        assertTrue(sprite.isDying());
    }

    @Test
    void isDyingReturnFalse() {
        sprite.setDying(false);
        assertFalse(sprite.isDying());
    }


}