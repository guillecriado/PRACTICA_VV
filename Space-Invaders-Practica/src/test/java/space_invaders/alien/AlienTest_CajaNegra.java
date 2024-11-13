package space_invaders.alien;

import org.junit.jupiter.api.*;
import space_invaders.sprites.Alien;

import static org.junit.jupiter.api.Assertions.*;

public class AlienTest_CajaNegra {
    Alien alien;
    Alien.Bomb bomb;
    @Nested
    class alienConstructorTest{
        @Test
        void alienCP1(){
            alien = new Alien(4, -1);
            int posicionXEsperada = 5;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP1: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP2(){
            alien = new Alien(4, 0);
            int posicionXEsperada = 5;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP2: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP3(){
            alien = new Alien(4, 1);
            int posicionXEsperada = 5;
            int posicionYEsperada = 1;

            assertAll("Caso de Prueba CP3: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienCP4(){
            alien = new Alien(4, 179);
            int posicionXEsperada = 5;
            int posicionYEsperada = 179;

            assertAll("Caso de Prueba CP4: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienCP5(){
            alien = new Alien(4, 349);
            int posicionXEsperada = 5;
            int posicionYEsperada = 349;

            assertAll("Caso de Prueba CP5: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienCP6(){
            alien = new Alien(4, 350);
            int posicionXEsperada = 5;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP6: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP7(){
            alien = new Alien(4, 351);
            int posicionXEsperada = 5;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP7: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP8(){
            alien = new Alien(5, -1);
            int posicionXEsperada = 5;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP8: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP9(){
            alien = new Alien(5, 0);
            int posicionXEsperada = 5;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP9: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP10(){
            alien = new Alien(5, 1);
            int posicionXEsperada = 5;
            int posicionYEsperada = 1;

            assertAll("Caso de Prueba CP10: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienCP11(){
            alien = new Alien(5, 179);
            int posicionXEsperada = 5;
            int posicionYEsperada = 179;

            assertAll("Caso de Prueba CP11: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienCP12(){
            alien = new Alien(5, 349);
            int posicionXEsperada = 5;
            int posicionYEsperada = 349;

            assertAll("Caso de Prueba CP12: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienCP13(){
            alien = new Alien(5, 350);
            int posicionXEsperada = 5;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP13: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP14(){
            alien = new Alien(5, 351);
            int posicionXEsperada = 5;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP14: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP15(){
            alien = new Alien(6, -1);
            int posicionXEsperada = 6;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP15: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP16(){
            alien = new Alien(6, 0);
            int posicionXEsperada = 6;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP16: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP17(){
            alien = new Alien(6, 1);
            int posicionXEsperada = 6;
            int posicionYEsperada = 1;

            assertAll("Caso de Prueba CP17: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienCP18(){
            alien = new Alien(6, 179);
            int posicionXEsperada = 6;
            int posicionYEsperada = 179;

            assertAll("Caso de Prueba CP18: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienCP19(){
            alien = new Alien(6, 349);
            int posicionXEsperada = 6;
            int posicionYEsperada = 349;

            assertAll("Caso de Prueba CP19: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienCP20(){
            alien = new Alien(6, 350);
            int posicionXEsperada = 6;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP20: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP21(){
            alien = new Alien(6, 351);
            int posicionXEsperada = 6;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP21: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP22(){
            alien = new Alien(164, -1);
            int posicionXEsperada = 164;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP22: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP23(){
            alien = new Alien(164, 0);
            int posicionXEsperada = 164;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP23: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP24(){
            alien = new Alien(164, 1);
            int posicionXEsperada = 164;
            int posicionYEsperada = 1;

            assertAll("Caso de Prueba CP24: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienCP25(){
            alien = new Alien(164, 179);
            int posicionXEsperada = 164;
            int posicionYEsperada = 179;

            assertAll("Caso de Prueba CP25: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienCP26(){
            alien = new Alien(164, 349);
            int posicionXEsperada = 164;
            int posicionYEsperada = 349;

            assertAll("Caso de Prueba CP26: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienCP27(){
            alien = new Alien(164, 350);
            int posicionXEsperada = 164;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP27: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP28(){
            alien = new Alien(164, 351);
            int posicionXEsperada = 164;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP288: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP29(){
            alien = new Alien(327, -1);
            int posicionXEsperada = 327;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP29: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP30(){
            alien = new Alien(327, 0);
            int posicionXEsperada = 327;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP30: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP31(){
            alien = new Alien(327, 1);
            int posicionXEsperada = 327;
            int posicionYEsperada = 1;

            assertAll("Caso de Prueba CP31: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienCP32(){
            alien = new Alien(327, 179);
            int posicionXEsperada = 327;
            int posicionYEsperada = 179;

            assertAll("Caso de Prueba CP32: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienCP33(){
            alien = new Alien(327, 349);
            int posicionXEsperada = 327;
            int posicionYEsperada = 349;

            assertAll("Caso de Prueba CP33: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienCP34(){
            alien = new Alien(327, 350);
            int posicionXEsperada = 327;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP34: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP35(){
            alien = new Alien(327, 351);
            int posicionXEsperada = 327;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP35: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP36(){
            alien = new Alien(328, -1);
            int posicionXEsperada = 328;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP36: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP37(){
            alien = new Alien(328, 0);
            int posicionXEsperada = 328;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP37: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP38(){
            alien = new Alien(328, 1);
            int posicionXEsperada = 328;
            int posicionYEsperada = 1;

            assertAll("Caso de Prueba CP38: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienCP39(){
            alien = new Alien(328, 179);
            int posicionXEsperada = 328;
            int posicionYEsperada = 179;

            assertAll("Caso de Prueba CP39: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienCP40(){
            alien = new Alien(328, 349);
            int posicionXEsperada = 328;
            int posicionYEsperada = 349;

            assertAll("Caso de Prueba CP40: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienCP41(){
            alien = new Alien(328, 350);
            int posicionXEsperada = 328;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP41: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP42(){
            alien = new Alien(328, 351);
            int posicionXEsperada = 328;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP42: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP43(){
            alien = new Alien(329, -1);
            int posicionXEsperada = 328;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP43: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP44(){
            alien = new Alien(329, 0);
            int posicionXEsperada = 328;
            int posicionYEsperada = 0;

            assertAll("Caso de Prueba CP44: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienCP45(){
            alien = new Alien(329, 1);
            int posicionXEsperada = 328;
            int posicionYEsperada = 1;

            assertAll("Caso de Prueba CP45: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienCP46(){
            alien = new Alien(329, 179);
            int posicionXEsperada = 328;
            int posicionYEsperada = 179;

            assertAll("Caso de Prueba CP46: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienCP47(){
            alien = new Alien(329, 349);
            int posicionXEsperada = 328;
            int posicionYEsperada = 349;

            assertAll("Caso de Prueba CP47: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienCP48(){
            alien = new Alien(329, 350);
            int posicionXEsperada = 328;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP48: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienCP49(){
            alien = new Alien(329, 351);
            int posicionXEsperada = 328;
            int posicionYEsperada = 350;

            assertAll("Caso de Prueba CP49: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 350"));
        }
    }

    @Nested
    class actTest{
        @BeforeEach
        void setUp(){
            alien = new Alien(164, 179);
        }
        @Test
        void actCP1() {
            alien.act(5);
            int valorXEsperado = 17;
            assertEquals(valorXEsperado,alien.getX(), "El valor X debería ser 17");
        }
        @Test
        void actCP2() {
            alien.act(6);
            int valorXEsperado = 18;
            assertEquals(valorXEsperado,alien.getX(), "El valor X debería ser 18");
        }
        @Test
        void actCP3() {
            alien.act(150);
            int valorXEsperado = 162;
            assertEquals(valorXEsperado,alien.getX(), "El valor X debería ser 162");
        }
        @Test
        void actCP4() {
            alien.act(303);
            int valorXEsperado = 315;
            assertEquals(valorXEsperado,alien.getX(), "El valor X debería ser 315");
        }
        @Test
        void actCP5() {
            alien.act(304);
            int valorXEsperado = 315;
            assertEquals(valorXEsperado,alien.getX(), "El valor X debería ser 315");
        }
        @Test
        void actCP6() {
            alien.act(315);
            int valorXEsperado = 315;
            assertEquals(valorXEsperado,alien.getX(), "El valor X debería ser 315");
        }
        @Test
        void actCP7() {
            alien.act(316);
            int valorXEsperado = 316;
            assertEquals(valorXEsperado,alien.getX(), "El valor X debería ser 316");
        }
    }

    @Nested
    class alienBombTest{

        @Test
        void alienBombCP1(){
            alien = new Alien(4, -1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP1: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }

        @Test
        void alienBombCP2(){
            alien = new Alien(4, 0);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP2: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }

        @Test
        void alienBombCP3(){
            alien = new Alien(4, 1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 1;

            assertAll("Caso de Prueba CP3: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienBombCP4(){
            alien = new Alien(4, 179);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 179;

            assertAll("Caso de Prueba CP4: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienBombCP5(){
            alien = new Alien(4, 349);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 349;

            assertAll("Caso de Prueba CP5: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienBombCP6(){
            alien = new Alien(4, 350);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP6: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP7(){
            alien = new Alien(4, 351);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 351;

            assertAll("Caso de Prueba CP7: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 351"));
        }
        @Test
        void alienBombCP8(){
            alien = new Alien(5, -1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP8: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP9(){
            alien = new Alien(5, 0);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP7: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP10(){
            alien = new Alien(5, 1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 1;

            assertAll("Caso de Prueba CP10: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienBombCP11(){
            alien = new Alien(5, 179);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 179;

            assertAll("Caso de Prueba CP11: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienBombCP12(){
            alien = new Alien(5, 349);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 349;

            assertAll("Caso de Prueba CP11: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienBombCP13(){
            alien = new Alien(5, 350);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP13: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP14(){
            alien = new Alien(5, 351);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 5;
            int posicionBombYEsperada = 351;

            assertAll("Caso de Prueba CP14: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 351"));
        }
        @Test
        void alienBombCP15(){
            alien = new Alien(6, -1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 6;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP15: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP16(){
            alien = new Alien(6, 0);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 6;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP16: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP17(){
            alien = new Alien(6, 1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 6;
            int posicionBombYEsperada = 1;

            assertAll("Caso de Prueba CP17: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienBombCP18(){
            alien = new Alien(6, 179);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 6;
            int posicionBombYEsperada = 179;

            assertAll("Caso de Prueba CP18: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienBombCP19(){
            alien = new Alien(6, 349);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 6;
            int posicionBombYEsperada = 349;

            assertAll("Caso de Prueba CP19: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienBombCP20(){
            alien = new Alien(6, 350);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 6;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP20: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP21(){
            alien = new Alien(6, 351);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 6;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP21: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP22(){
            alien = new Alien(164, -1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 164;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP22: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP23(){
            alien = new Alien(164, 0);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 164;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP23: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP24(){
            alien = new Alien(164, 1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 164;
            int posicionBombYEsperada = 1;

            assertAll("Caso de Prueba CP24: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienBombCP25(){
            alien = new Alien(164, 179);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 164;
            int posicionBombYEsperada = 179;

            assertAll("Caso de Prueba CP25: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienBombCP26(){
            alien = new Alien(164, 349);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 164;
            int posicionBombYEsperada = 349;

            assertAll("Caso de Prueba CP26: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienBombCP27(){
            alien = new Alien(164, 350);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 164;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP27: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP28(){
            alien = new Alien(164, 351);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 164;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP28: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP29(){
            alien = new Alien(327, -1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 327;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP29: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP30(){
            alien = new Alien(327, 0);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 327;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP30: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP31(){
            alien = new Alien(327, 1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 327;
            int posicionBombYEsperada = 1;

            assertAll("Caso de Prueba CP31: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienBombCP32(){
            alien = new Alien(327, 179);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 327;
            int posicionBombYEsperada = 179;

            assertAll("Caso de Prueba CP32: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienBombCP33(){
            alien = new Alien(327, 349);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 327;
            int posicionBombYEsperada = 349;

            assertAll("Caso de Prueba CP33: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienBombCP34(){
            alien = new Alien(327, 350);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 327;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP34: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP35(){
            alien = new Alien(327, 351);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 327;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP35: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP36(){
            alien = new Alien(328, -1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP36: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP37(){
            alien = new Alien(328, 0);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP37: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP38(){
            alien = new Alien(328, 1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 1;

            assertAll("Caso de Prueba CP38: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienBombCP39(){
            alien = new Alien(328, 179);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 179;

            assertAll("Caso de Prueba CP39: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienBombCP40(){
            alien = new Alien(328, 349);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 349;

            assertAll("Caso de Prueba CP40: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienBombCP41(){
            alien = new Alien(328, 350);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP41: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP42(){
            alien = new Alien(328, 351);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP42: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP43(){
            alien = new Alien(329, -1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP43: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP44(){
            alien = new Alien(329, 0);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 0;

            assertAll("Caso de Prueba CP44: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 0"));
        }
        @Test
        void alienBombCP45(){
            alien = new Alien(329, 1);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 1;

            assertAll("Caso de Prueba CP45: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 1"));
        }
        @Test
        void alienBombCP46(){
            alien = new Alien(329, 179);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 179;

            assertAll("Caso de Prueba CP46: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 179"));
        }
        @Test
        void alienBombCP47(){
            alien = new Alien(329, 349);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 349;

            assertAll("Caso de Prueba CP47: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 349"));
        }
        @Test
        void alienBombCP48(){
            alien = new Alien(329, 350);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP48: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
        @Test
        void alienBombCP49(){
            alien = new Alien(329, 351);
            bomb = alien.getBomb();
            int posicionBombXEsperada = 328;
            int posicionBombYEsperada = 350;

            assertAll("Caso de Prueba CP49: Posición de creación de Bomb",
                    () -> assertEquals(posicionBombXEsperada, bomb.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionBombYEsperada, bomb.getY(), "La coordenada Y debería ser 350"));
        }
    }
    @Nested
    class bombDestroyedTest{
        @BeforeEach
        void setUp(){
            alien = new Alien(164, 179);
            bomb = alien.getBomb();
        }
        @Test
        void bombDestroyedCP1(){
            bomb.setDestroyed(true);
            System.out.println("isDestroyed: " + bomb.isDestroyed());
            assertTrue(bomb.isDestroyed(), "isDestroyed debe retornar true");
        }
        @Test
        void bombDestroyedCP2(){
            bomb.setDestroyed(false);
            System.out.println("isDestroyed: " + bomb.isDestroyed());
            assertFalse(bomb.isDestroyed(), "isDestroyed debe retornar false");
        }
    }
}