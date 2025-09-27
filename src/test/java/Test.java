import org.junit.jupiter.api.Test;
import characters.Elf;
import characters.Hobbit;
import characters.Knight;
import characters.King;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void ElfTest() {
        Elf elf = new Elf();

        assertEquals(10, elf.getHp());
        assertEquals(10, elf.getPower());

        Hobbit hobbit = new Hobbit();
        assertTrue(hobbit.isAlive());

        elf.kick(hobbit);
        assertFalse(hobbit.isAlive());
        assertEquals(0, hobbit.getHp());

        Knight knight = new Knight();
        knight.setPower(12);

        elf.kick(knight);
        assertEquals(11, knight.getPower());

        knight.setPower(8);
        elf.kick(knight);
        assertEquals(0, knight.getHp());
        assertFalse(knight.isAlive());
    }

    @Test
    void HobbitTest() {
        Hobbit hobbit = new Hobbit();

        assertEquals(0, hobbit.getPower());
        assertEquals(3, hobbit.getHp());
        assertTrue(hobbit.isAlive());

        Elf elf = new Elf();
        hobbit.kick(elf);
        assertEquals(10, elf.getHp());
        assertEquals(10, elf.getPower());
    }

    @Test
    void KnightTest() {
        Knight knight = new Knight();
        assertTrue(knight.getHp() >= 2 && knight.getHp() <= 12);
        assertTrue(knight.getPower() >= 2 && knight.getPower() <= 12);

        Hobbit hobbit = new Hobbit();
        int initialHp = hobbit.getHp();
        knight.kick(hobbit);

        assertTrue(hobbit.getHp() <= initialHp);
        assertTrue(hobbit.getHp() >= 0);
    }

    @Test
    void KingTest() {
        King king = new King();
        assertTrue(king.getHp() >= 5 && king.getHp() <= 15);
        assertTrue(king.getPower() >= 5 && king.getPower() <= 15);

        Hobbit hobbit = new Hobbit();
        int initialHp = hobbit.getHp();
        king.kick(hobbit);

        assertTrue(hobbit.getHp() <= initialHp);
        assertTrue(hobbit.getHp() >= 0);
    }
}