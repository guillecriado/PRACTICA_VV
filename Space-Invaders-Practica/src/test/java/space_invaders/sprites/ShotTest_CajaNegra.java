package space_invaders.sprites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Caja negra de la clase Shot")
class ShotTest_CajaNegra {

    Shot shot;
    int limiteInferiorX,limiteInferiorXDentro, valorXNominal, limiteSuperiorXDentro, limiteSuperiorX;
    int limiteInferiorXEsperado,limiteInferiorXDentroEsperado, valorXNominalEsperado, limiteSuperiorXDentroEsperado, limiteSuperiorXEsperado;
    int valorYEntrada, valorYEsperado;


    @BeforeEach
    void setUp() {
        shot= new Shot();
        limiteInferiorX=5;
        limiteInferiorXDentro=6;
        valorXNominal=167;
        limiteSuperiorXDentro=312;
        limiteSuperiorX=313;
        valorYEntrada=280;
        valorYEsperado=279;
        limiteInferiorXEsperado=11;
        limiteInferiorXDentroEsperado=12;
        valorXNominalEsperado=173;
        limiteSuperiorXDentroEsperado=318;
        limiteSuperiorXEsperado=319;
    }

    @DisplayName("Caso de prueba 1: (5,280)")
    @Test
    void initShotCP1() {
        shot.initShot(limiteInferiorX,valorYEntrada);
        assertAll(
                ()-> assertEquals(limiteInferiorXEsperado,shot.getX()),
                ()-> assertEquals(valorYEsperado,shot.getY())
        );
    }

    @DisplayName("Caso de prueba 2: (6,280)")
    @Test
    void initShotCP2() {
        shot.initShot(limiteInferiorXDentro,valorYEntrada);
        assertAll(
                ()-> assertEquals(limiteInferiorXDentroEsperado,shot.getX()),
                ()-> assertEquals(valorYEsperado,shot.getY())
        );
    }

    @DisplayName("Caso de prueba 3: (167,280)")
    @Test
    void initShotCP3() {
        shot.initShot(valorXNominal,valorYEntrada);
        assertAll(
                ()-> assertEquals(valorXNominalEsperado,shot.getX()),
                ()-> assertEquals(valorYEsperado,shot.getY())
        );
    }

    @DisplayName("Caso de prueba 4: (312,280)")
    @Test
    void initShotCP4() {
        shot.initShot(limiteSuperiorXDentro,valorYEntrada);
        assertAll(
                ()-> assertEquals(limiteSuperiorXDentroEsperado,shot.getX()),
                ()-> assertEquals(valorYEsperado,shot.getY())
        );
    }

    @DisplayName("Caso de prueba 5: (313,280)")
    @Test
    void initShotCP5() {
        shot.initShot(limiteSuperiorX,valorYEntrada);
        assertAll(
                ()-> assertEquals(limiteSuperiorXEsperado,shot.getX()),
                ()-> assertEquals(valorYEsperado,shot.getY())
        );
    }
}