package ch.samt.models;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class SharkTest {


    @Test
    public void hunt() {
        //given
        Shark shark = new Shark(0, 0, 20, "Flipper", 0);

        //when
        Boolean hunt = shark.hunt();

        //then
        assertFalse(hunt);
    }



}
