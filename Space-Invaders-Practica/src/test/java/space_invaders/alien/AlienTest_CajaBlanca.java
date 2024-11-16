package space_invaders.alien;

import main.Commons;
import org.junit.jupiter.api.*;
import space_invaders.sprites.Alien;

import static org.junit.jupiter.api.Assertions.*;

class AlienTestCajaBlanca {
    Alien alien;
    Alien.Bomb bomb;

    @Nested
    public class alienConstructorTestCajaBlanca {
        @Test
        void alienCajaBlancaCP1(){
            alien = new Alien(164,175);
            int posicionXEsperada = (Commons.BOARD_WIDTH - Commons.BORDER_RIGHT) / 2 ;
            int posicionYEsperada = Commons.BOARD_HEIGHT / 2;

            assertAll("Caso de Prueba CP25: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 175"));
        }

        @Test
        void alienCajaBlancaCP2(){
            alien = new Alien(359, 175);
            int posicionXEsperada = Commons.BOARD_WIDTH - Commons.BORDER_RIGHT ;
            int posicionYEsperada = Commons.BOARD_HEIGHT / 2;

            assertAll("Caso de Prueba CP46: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 175"));
        }

        @Test
        void alienCajaBlancaCP3(){
            alien = new Alien(-1, 175);
            int posicionXEsperada = Commons.BORDER_LEFT;
            int posicionYEsperada = Commons.BOARD_HEIGHT / 2;

            assertAll("Caso de Prueba CP4: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 175"));
        }

        @Test
        void alienCajaBlancaCP4(){
            alien = new Alien(164, 351);
            int posicionXEsperada = (Commons.BOARD_WIDTH - Commons.BORDER_RIGHT) / 2 ;
            int posicionYEsperada = Commons.BOARD_HEIGHT ;

            assertAll("Caso de Prueba CP288: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }

        @Test
        void alienCajaBlancaCP5(){
            alien = new Alien(164, -1);
            int posicionXEsperada = 179 ;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP22: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
    }

    @Nested
    class alienBombTestCajaBlanca {

        @Test
        void alienBombCajaBalncaCP1() {
            alien = new Alien(164, 175);
            bomb = alien.getBomb();
            int posicionBombXEsperada = (Commons.BOARD_WIDTH - Commons.BORDER_RIGHT) / 2 ;
            int posicionBombYEsperada = Commons.BOARD_HEIGHT / 2;

            assertAll("Caso de Prueba CP25: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 175"));
        }

        @Test
        void alienBombCajaBlancaCP2(){
            alien = new Alien(359, 351);
            bomb = alien.getBomb();
            int posicionBombXEsperada = Commons.BOARD_WIDTH - Commons.BORDER_RIGHT ;
            int posicionBombYEsperada = Commons.BOARD_HEIGHT ;

            assertAll("Caso de Prueba CP2: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
    }
}