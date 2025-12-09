package ch.samt.models;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DolphinTest {

    public Dolphin dolphin;

    @BeforeEach
    public void setup() {
        dolphin = new Dolphin(40, 30, 20, "Flipper", 50, 80);
    }

    @Test
    public void testEat() {
        //given
        int initialEnergy = dolphin.getEnergy();

        //when
        dolphin.eat();

        //then
        assertEquals(initialEnergy + 5, dolphin.getEnergy());
    }

    @Test
    public void testMove() {
        //given
        int initialEnergy = dolphin.getEnergy();

        //when
        dolphin.move();

        //then
        assertEquals(initialEnergy - 2, dolphin.getEnergy());
    }

    @Test
    public void hunt() {
        //given
        dolphin = new Dolphin(0, 0, 20, "Flipper", 0, 0);

        //when
        Boolean hunt = dolphin.hunt();

        //then
        assertFalse(hunt);
    }

}
