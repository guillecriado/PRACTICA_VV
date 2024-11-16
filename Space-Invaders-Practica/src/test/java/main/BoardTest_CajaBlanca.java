package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import space_invaders.sprites.Alien;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BoardTest_CajaBlanca {
    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    //-------------------------------------------gameInit()-------------------------------------------------------

    @Test
    void gameInitCamino1() {
        board.gameInit();
        assertEquals(Commons.NUMBER_OF_ALIENS_TO_DESTROY, board.getAliens().size());
    }

    //-------------------------------------------update()-------------------------------------------------------

    @Test
    void updateCamino1() {
        board.setDeaths(Commons.CHANCE);
        board.update();
        assertFalse(board.isInGame());
        assertEquals("Game won!", board.getMessage());
    }

    @Test
    void updateCamino2() {
        board.setDeaths(Commons.CHANCE - 2);
        board.update();
        assertTrue(board.isInGame());
    }

    //-------------------------------------------update_shot()-------------------------------------------------------

    @Test
    void update_shotCamino1() {
        board.getShot().die();
        board.update_shots();
        assertFalse(board.getShot().isVisible());
    }

    @Test
    void update_shotCamino2() {
        board.getAliens().clear();
        board.getShot().setY(0);
        board.update_shots();
        assertFalse(board.getShot().isVisible());
    }


    @Test
    void update_shotCamino3() {
        board.getAliens().clear();
        board.getShot().setY(8);
        int yBeforeUpdate = board.getShot().getY();
        board.update_shots();
        int yAfterUpdate = board.getShot().getY();
        assertTrue(board.getShot().isVisible());
        assertEquals(yBeforeUpdate - 4, yAfterUpdate);
    }


    @Test
    void update_shotCamino4() {
        board.getAliens().getFirst().die();
        board.getShot().setY(8);
        int yBeforeUpdate = board.getShot().getY();
        board.update_shots();
        int yAfterUpdate = board.getShot().getY();
        assertTrue(board.getShot().isVisible());
        assertEquals(yBeforeUpdate - 4, yAfterUpdate);
    }


    @Test
    void update_shotCamino5() {
        board.getAliens().getFirst().setX(50);
        board.getShot().setX(200);
        board.getShot().setY(8);
        int yBeforeUpdate = board.getShot().getY();
        board.update_shots();
        int yAfterUpdate = board.getShot().getY();
        assertTrue(board.getShot().isVisible());
        assertEquals(yBeforeUpdate - 4, yAfterUpdate);
    }


    @Test
    void update_shotCamino6() {
        board.getAliens().getFirst().setX(100);
        board.getAliens().getFirst().setY(100);
        board.getShot().setX(100);
        board.getShot().setY(100);
        int numberDeBefore = board.getDeaths();
        board.update_shots();
        int numberDeAfter = board.getDeaths();
        assertFalse(board.getShot().isVisible());
        assertEquals(numberDeBefore - 1, numberDeAfter);
        assertTrue(board.getAliens().getFirst().isDying());
    }


    //-------------------------------------------update_alien()-------------------------------------------------------

    @Test
    void update_alienCamino1() {
        board.getAliens().clear();
        board.update_aliens();
        assertEquals(0, board.getAliens().size());
        assertTrue(board.isInGame());
    }

    @Test
    void update_alienCamino2() {

        ArrayList<Integer> positionXAliensBefore = new ArrayList<>();
        ArrayList<Integer> positionYAliensBefore = new ArrayList<>();

        for (Alien alien : board.getAliens()) {
            alien.die();
            positionXAliensBefore.add(alien.getX());
            positionYAliensBefore.add(alien.getY());
        }

        board.update_aliens();

        ArrayList<Integer> positionXAliensAfter = new ArrayList<>();
        ArrayList<Integer> positionYAliensAfter = new ArrayList<>();
        for (Alien alien : board.getAliens()) {
            positionXAliensAfter.add(alien.getX());
            positionYAliensAfter.add(alien.getY());
        }
        assertTrue(board.isInGame());
        assertFalse(board.getAliens().isEmpty());

        for (int i = 0; i < positionXAliensBefore.size(); i++) {
            assertEquals(positionYAliensBefore.get(i), positionYAliensAfter.get(i));
            assertEquals(positionXAliensBefore.get(i), positionXAliensAfter.get(i));
        }
    }


    @Test
    void update_alienCamino3_y_4() {
        ArrayList<Integer> positionYAliensBefore = new ArrayList<>();
        board.setDirection(1);
        for (int i = 0; i < board.getAliens().size(); i++) {
            board.getAliens().get(i).die();
            positionYAliensBefore.add(board.getAliens().get(i).getY());
            if (i == 0) {
                board.getAliens().get(i).setX(Commons.BOARD_WIDTH-Commons.ALIEN_WIDTH);
            }
        }

        board.update_aliens();
        ArrayList<Integer> positionYAliensAfter = new ArrayList<>();
        for (Alien alien : board.getAliens()) {
            positionYAliensAfter.add(alien.getY());
        }
        for (int i = 0; i < positionYAliensBefore.size(); i++) {
            assertEquals(positionYAliensBefore.get(i) + Commons.GO_DOWN, positionYAliensAfter.get(i));
        }
    }



    @Test
    void update_alienCamino5_y_6() {
        ArrayList<Integer> positionYAliensBefore = new ArrayList<>();
        board.setDirection(-1);
        for (int i = 0; i < board.getAliens().size(); i++) {
            board.getAliens().get(i).die();
            positionYAliensBefore.add(board.getAliens().get(i).getY());
            if (i == 0) {
                board.getAliens().get(i).setX(Commons.BORDER_LEFT-1);
            }
        }

        board.update_aliens();
        ArrayList<Integer> positionYAliensAfter = new ArrayList<>();
        for (Alien alien : board.getAliens()) {
            positionYAliensAfter.add(alien.getY());
        }
        for (int i = 0; i < positionYAliensBefore.size(); i++) {
            assertEquals(positionYAliensBefore.get(i) + Commons.GO_DOWN, positionYAliensAfter.get(i));
        }
    }


    @Test
    void update_alienCamino8() {
        int direction = 1;
        ArrayList<Integer> positionXAliensBefore = new ArrayList<>();
        board.setDirection(direction);
        for (int i = 0; i < board.getAliens().size(); i++) {
            positionXAliensBefore.add(board.getAliens().get(i).getX());
        }

        board.update_aliens();
        ArrayList<Integer> positionXAliensAfter = new ArrayList<>();
        for (Alien alien : board.getAliens()) {
            positionXAliensAfter.add(alien.getX());
        }


        for (int i = 0; i < positionXAliensBefore.size(); i++) {
            assertEquals(positionXAliensBefore.get(i) + direction+Commons.ALIEN_WIDTH, positionXAliensAfter.get(i));
        }
        assertTrue(board.isInGame());
    }


    @Test
    void update_alienCamino9() {
        board.getAliens().getFirst().setY(Commons.GROUND);
        board.update_aliens();
        assertFalse(board.isInGame());
        assertEquals("Invasion!", board.getMessage());
    }


    //-------------------------------------------update_bomb()-------------------------------------------------------

    @Test
    void update_bombCamino1() {
        board.getAliens().clear();
        board.update_bomb();
        assertEquals(0, board.getAliens().size());
    }

    @Test
    void update_bombCamino2() {

        ArrayList<Integer> positionXBombBefore = new ArrayList<>();
        ArrayList<Integer> positionYBombBefore = new ArrayList<>();

        for (Alien alien : board.getAliens()) {
            alien.die();
            positionXBombBefore.add(alien.getBomb().getX());
            positionYBombBefore.add(alien.getBomb().getY());
        }

        board.update_bomb();

        ArrayList<Integer> positionXBombAfter = new ArrayList<>();
        ArrayList<Integer> positionYBombAfter = new ArrayList<>();

        for (Alien alien : board.getAliens()) {
            positionXBombAfter.add(alien.getBomb().getX());
            positionYBombAfter.add(alien.getBomb().getY());
        }


        for (int i = 0; i < positionXBombBefore.size(); i++) {
            assertEquals(positionYBombBefore.get(i) , positionYBombAfter.get(i));
            assertEquals(positionXBombBefore.get(i), positionXBombAfter.get(i));
            assertTrue( board.getAliens().get(i).getBomb().isDestroyed());
        }
    }

    @Test
    void update_bombCamino3() {
        board.update_bomb();
        assertFalse(board.getAliens().getFirst().getBomb().isDestroyed());
    }

    @Test
    void update_bombCamino4() {
        int yBeforeUpdate = board.getAliens().getFirst().getBomb().getY();
        board.getAliens().getFirst().getBomb().setDestroyed(false);
        board.update_bomb();
        int yAfterUpdate = board.getAliens().getFirst().getBomb().getY();
        assertEquals(yBeforeUpdate + 1, yAfterUpdate);
    }

    @Test
    void update_bombCamino5() {

        for(int i = 0; i < board.getAliens().size(); i++){
            board.getAliens().get(i).die();
            if (i == 0) {
                board.getAliens().get(i).getBomb().setDestroyed(false);
                board.getAliens().get(i).getBomb().setY(Commons.GROUND);
            }
        }

        board.update_bomb();
        assertFalse(board.getAliens().getFirst().getBomb().isDestroyed());
    }

    @Test
    void update_bombCamino7() {

        for (Alien alien : board.getAliens()) {
            alien.die();
        }
        board.getAliens().getFirst().getBomb().setDestroyed(false);
        board.getPlayer().setX(100);
        board.getPlayer().setY(100);
        board.getAliens().getFirst().getBomb().setX(100);
        board.getAliens().getFirst().getBomb().setY(100);
        board.update_bomb();
        assertTrue(board.getAliens().getFirst().getBomb().isDestroyed());
        assertFalse(board.getPlayer().isDying());
    }
}
