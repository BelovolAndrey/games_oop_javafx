package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;


public class BishopBlackTest {
    @Test
    public void positionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expect = Cell.C1;
        bishopBlack.position();
        assertThat(bishopBlack.position(), is(expect));
    }

    @Test
    public void copyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expect = Cell.A7;
        assertThat(bishopBlack.copy(Cell.A7).position(), is(expect));
    }

    @Test
    public void wayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.C1, Cell.G5), is(expect));
    }
}