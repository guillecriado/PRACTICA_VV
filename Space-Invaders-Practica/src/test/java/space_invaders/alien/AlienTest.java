package space_invaders.alien;

import org.junit.jupiter.api.*;
import space_invaders.sprites.Alien;

import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {
    Alien alien;
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
            alien = new Alien(4, 357);
            int posicionXEsperada = 5;
            int posicionYEsperada = 357;

            assertAll("Caso de Prueba CP5: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 357"));
        }
        @Test
        void alienCP6(){
            alien = new Alien(4, 358);
            int posicionXEsperada = 5;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP6: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
        }
        @Test
        void alienCP7(){
            alien = new Alien(4, 359);
            int posicionXEsperada = 5;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP7: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
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
            alien = new Alien(5, 357);
            int posicionXEsperada = 5;
            int posicionYEsperada = 357;

            assertAll("Caso de Prueba CP12: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 357"));
        }
        @Test
        void alienCP13(){
            alien = new Alien(5, 358);
            int posicionXEsperada = 5;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP13: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
        }
        @Test
        void alienCP14(){
            alien = new Alien(5, 359);
            int posicionXEsperada = 5;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP14: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 5"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
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
            alien = new Alien(6, 357);
            int posicionXEsperada = 6;
            int posicionYEsperada = 357;

            assertAll("Caso de Prueba CP19: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 357"));
        }
        @Test
        void alienCP20(){
            alien = new Alien(6, 358);
            int posicionXEsperada = 6;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP20: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
        }
        @Test
        void alienCP21(){
            alien = new Alien(6, 359);
            int posicionXEsperada = 6;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP21: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 6"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
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
            alien = new Alien(164, 357);
            int posicionXEsperada = 164;
            int posicionYEsperada = 357;

            assertAll("Caso de Prueba CP26: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 357"));
        }
        @Test
        void alienCP27(){
            alien = new Alien(164, 358);
            int posicionXEsperada = 164;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP27: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
        }
        @Test
        void alienCP28(){
            alien = new Alien(164, 359);
            int posicionXEsperada = 164;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP288: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 164"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
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
            alien = new Alien(327, 357);
            int posicionXEsperada = 327;
            int posicionYEsperada = 357;

            assertAll("Caso de Prueba CP33: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 357"));
        }
        @Test
        void alienCP34(){
            alien = new Alien(327, 358);
            int posicionXEsperada = 327;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP34: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
        }
        @Test
        void alienCP35(){
            alien = new Alien(327, 359);
            int posicionXEsperada = 327;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP35: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 327"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
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
            alien = new Alien(328, 357);
            int posicionXEsperada = 328;
            int posicionYEsperada = 357;

            assertAll("Caso de Prueba CP40: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 357"));
        }
        @Test
        void alienCP41(){
            alien = new Alien(328, 358);
            int posicionXEsperada = 328;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP41: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
        }
        @Test
        void alienCP42(){
            alien = new Alien(328, 359);
            int posicionXEsperada = 328;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP42: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
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
            alien = new Alien(329, 357);
            int posicionXEsperada = 328;
            int posicionYEsperada = 357;

            assertAll("Caso de Prueba CP47: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 357"));
        }
        @Test
        void alienCP48(){
            alien = new Alien(329, 358);
            int posicionXEsperada = 328;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP48: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
        }
        @Test
        void alienCP49(){
            alien = new Alien(329, 359);
            int posicionXEsperada = 328;
            int posicionYEsperada = 358;

            assertAll("Caso de Prueba CP49: Posición de creación del alien",
                    () -> assertEquals(posicionXEsperada, alien.getX(), "La coordenada X debería ser 328"),
                    () -> assertEquals(posicionYEsperada, alien.getY(), "La coordenada Y debería ser 358"));
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
}