package terning;

import static org.junit.Assert.*;

public class UseDiceTest {

    Dice DiceTest = new Dice();

    @org.junit.Test
    public void roll() {

        int OneCounter = 0;

        for (int i=0; i < 60000; i++) {
        int tal = DiceTest.roll();
        if(tal==1)
            OneCounter++;
        assertTrue(tal>0  && tal<7);
    }

        System.out.println(OneCounter);

    }
}
