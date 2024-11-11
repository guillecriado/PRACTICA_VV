package space_invaders.sprites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShotTest {

    Shot shot;

    @BeforeEach
    void setUp() {
        shot= new Shot();
    }

    @Test
    void initShotCP1() {
        shot.initShot(4,-1);
        assertAll(
                ()-> assertEquals(5,shot.getX()),
                ()-> assertEquals(0,shot.getY())
        );
    }

    @Test
    void initShotCP2() {
        shot.initShot(4,0);
        assertAll(
                ()-> assertEquals(5,shot.getX()),
                ()-> assertEquals(0,shot.getY())
        );
    }

    @Test
    void initShotCP3() {
        shot.initShot(4,1);
        assertAll(
                ()-> assertEquals(5,shot.getX()),
                ()-> assertEquals(1,shot.getY())
        );
    }

    @Test
    void initShotCP4() {
        shot.initShot(4,175);
        assertAll(
                ()-> assertEquals(5,shot.getX()),
                ()-> assertEquals(175,shot.getY())
        );
    }

    @Test
    void initShotCP5() {
        shot.initShot(4,349);
        assertAll(
                ()-> assertEquals(5,shot.getX()),
                ()-> assertEquals(349,shot.getY())
        );
    }

    @Test
    void initShotCP6() {
        shot.initShot(4,350);
        assertAll(
                ()-> assertEquals(5,shot.getX()),
                ()-> assertEquals(350,shot.getY())
        );
    }

    @Test
    void initShotCP7() {
        shot.initShot(4,351);
        assertAll(
                ()-> assertEquals(5,shot.getX()),
                ()-> assertEquals(350,shot.getY())
        );
    }
}