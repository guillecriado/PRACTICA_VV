package space_invaders.sprites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShotTest_CajaNegra {

    Shot shot;
    int limiteInferiorXFuera,limiteInferiorX,limiteInferiorXDentro, valorXNominal, limiteSuperiorXDentro, limiteSuperiorX, limiteSuperiorXFuera;
    int limiteInferiorYFuera,limiteInferiorY,limiteInferiorYDentro, valorYNominal, limiteSuperiorYDentro, limiteSuperiorY, limiteSuperiorYFuera;


    @BeforeEach
    void setUp() {
        shot= new Shot();
        limiteInferiorXFuera=4;
        limiteInferiorX=5;
        limiteInferiorXDentro=6;
        valorXNominal=167;
        limiteSuperiorXDentro=327;
        limiteSuperiorX=328;
        limiteSuperiorXFuera=329;
        limiteInferiorYFuera=-1;
        limiteInferiorY=0;
        limiteInferiorYDentro=1;
        valorYNominal=175;
        limiteSuperiorYDentro=349;
        limiteSuperiorY=350;
        limiteSuperiorYFuera=351;
    }

    @Test
    void initShotCP1() {
        shot.initShot(limiteInferiorXFuera,limiteInferiorYFuera);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP2() {
        shot.initShot(limiteInferiorXFuera,limiteInferiorY);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP3() {
        shot.initShot(limiteInferiorXFuera,limiteInferiorYDentro);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP4() {
        shot.initShot(limiteInferiorXFuera,valorYNominal);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(valorYNominal,shot.getY())
        );
    }

    @Test
    void initShotCP5() {
        shot.initShot(limiteInferiorXFuera,limiteSuperiorYDentro);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP6() {
        shot.initShot(limiteInferiorXFuera,limiteSuperiorY);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP7() {
        shot.initShot(limiteInferiorXFuera,limiteSuperiorYFuera);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }


    @Test
    void initShotCP8() {
        shot.initShot(limiteInferiorX,limiteInferiorYFuera);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP9() {
        shot.initShot(limiteInferiorX,limiteInferiorY);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP10() {
        shot.initShot(limiteInferiorX,limiteInferiorYDentro);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP11() {
        shot.initShot(limiteInferiorX,valorYNominal);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(valorYNominal,shot.getY())
        );
    }

    @Test
    void initShotCP12() {
        shot.initShot(limiteInferiorX,limiteSuperiorYDentro);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP13() {
        shot.initShot(limiteInferiorX,limiteSuperiorY);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP14() {
        shot.initShot(limiteInferiorX,limiteSuperiorYFuera);
        assertAll(
                ()-> assertEquals(limiteInferiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP15() {
        shot.initShot(limiteInferiorXDentro,limiteInferiorYFuera);
        assertAll(
                ()-> assertEquals(limiteInferiorXDentro,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP16() {
        shot.initShot(limiteInferiorXDentro,limiteInferiorY);
        assertAll(
                ()-> assertEquals(limiteInferiorXDentro,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP17() {
        shot.initShot(limiteInferiorXDentro,limiteInferiorYDentro);
        assertAll(
                ()-> assertEquals(limiteInferiorXDentro,shot.getX()),
                ()-> assertEquals(limiteInferiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP18() {
        shot.initShot(limiteInferiorXDentro,valorYNominal);
        assertAll(
                ()-> assertEquals(limiteInferiorXDentro,shot.getX()),
                ()-> assertEquals(valorYNominal,shot.getY())
        );
    }

    @Test
    void initShotCP19() {
        shot.initShot(limiteInferiorXDentro,limiteSuperiorYDentro);
        assertAll(
                ()-> assertEquals(limiteInferiorXDentro,shot.getX()),
                ()-> assertEquals(limiteSuperiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP20() {
        shot.initShot(limiteInferiorXDentro,limiteSuperiorY);
        assertAll(
                ()-> assertEquals(limiteInferiorXDentro,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP21() {
        shot.initShot(limiteInferiorXDentro,limiteSuperiorYFuera);
        assertAll(
                ()-> assertEquals(limiteInferiorXDentro,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP22() {
        shot.initShot(valorXNominal,limiteInferiorYFuera);
        assertAll(
                ()-> assertEquals(valorXNominal,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP23() {
        shot.initShot(valorXNominal,limiteInferiorY);
        assertAll(
                ()-> assertEquals(valorXNominal,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP24() {
        shot.initShot(valorXNominal,limiteInferiorYDentro);
        assertAll(
                ()-> assertEquals(valorXNominal,shot.getX()),
                ()-> assertEquals(limiteInferiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP25() {
        shot.initShot(valorXNominal,valorYNominal);
        assertAll(
                ()-> assertEquals(valorXNominal,shot.getX()),
                ()-> assertEquals(valorYNominal,shot.getY())
        );
    }

    @Test
    void initShotCP26() {
        shot.initShot(valorXNominal,limiteSuperiorYDentro);
        assertAll(
                ()-> assertEquals(valorXNominal,shot.getX()),
                ()-> assertEquals(limiteSuperiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP27() {
        shot.initShot(valorXNominal,limiteSuperiorY);
        assertAll(
                ()-> assertEquals(valorXNominal,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP28() {
        shot.initShot(valorXNominal,limiteSuperiorYFuera);
        assertAll(
                ()-> assertEquals(valorXNominal,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP29() {
        shot.initShot(limiteSuperiorXDentro,limiteInferiorYFuera);
        assertAll(
                ()-> assertEquals(limiteSuperiorXDentro,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP30() {
        shot.initShot(limiteSuperiorXDentro,limiteInferiorY);
        assertAll(
                ()-> assertEquals(limiteSuperiorXDentro,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP31() {
        shot.initShot(limiteSuperiorXDentro,limiteInferiorYDentro);
        assertAll(
                ()-> assertEquals(limiteSuperiorXDentro,shot.getX()),
                ()-> assertEquals(limiteInferiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP32() {
        shot.initShot(limiteSuperiorXDentro,valorYNominal);
        assertAll(
                ()-> assertEquals(limiteSuperiorXDentro,shot.getX()),
                ()-> assertEquals(valorYNominal,shot.getY())
        );
    }

    @Test
    void initShotCP33() {
        shot.initShot(limiteSuperiorXDentro,limiteSuperiorYDentro);
        assertAll(
                ()-> assertEquals(limiteSuperiorXDentro,shot.getX()),
                ()-> assertEquals(limiteSuperiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP34() {
        shot.initShot(limiteSuperiorXDentro,limiteSuperiorY);
        assertAll(
                ()-> assertEquals(limiteSuperiorXDentro,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP35() {
        shot.initShot(limiteSuperiorXDentro,limiteSuperiorYFuera);
        assertAll(
                ()-> assertEquals(limiteSuperiorXDentro,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP36() {
        shot.initShot(limiteSuperiorX,limiteInferiorYFuera);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP37() {
        shot.initShot(limiteSuperiorX,limiteInferiorY);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP38() {
        shot.initShot(limiteSuperiorX,limiteInferiorYDentro);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP39() {
        shot.initShot(limiteSuperiorX,valorYNominal);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(valorYNominal,shot.getY())
        );
    }

    @Test
    void initShotCP40() {
        shot.initShot(limiteSuperiorX,limiteSuperiorYDentro);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP41() {
        shot.initShot(limiteSuperiorX,limiteSuperiorY);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP42() {
        shot.initShot(limiteSuperiorX,limiteSuperiorYFuera);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP43() {
        shot.initShot(limiteSuperiorXFuera,limiteInferiorYFuera);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP44() {
        shot.initShot(limiteSuperiorXFuera,limiteInferiorY);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorY,shot.getY())
        );
    }

    @Test
    void initShotCP45() {
        shot.initShot(limiteSuperiorXFuera,limiteInferiorYDentro);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteInferiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP46() {
        shot.initShot(limiteSuperiorXFuera,valorYNominal);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(valorYNominal,shot.getY())
        );
    }

    @Test
    void initShotCP47() {
        shot.initShot(limiteSuperiorXFuera,limiteSuperiorYDentro);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorYDentro,shot.getY())
        );
    }

    @Test
    void initShotCP48() {
        shot.initShot(limiteSuperiorXFuera,limiteSuperiorY);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }

    @Test
    void initShotCP49() {
        shot.initShot(limiteSuperiorXFuera,limiteSuperiorYFuera);
        assertAll(
                ()-> assertEquals(limiteSuperiorX,shot.getX()),
                ()-> assertEquals(limiteSuperiorY,shot.getY())
        );
    }
}