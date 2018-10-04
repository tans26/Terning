package terning;

import org.junit.Test;

import static org.junit.Assert.*;

public class UseDiceTest{

    Dice diceTest = new Dice();

    @Test
    public void roll() {

        int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, fejl = 0;

        for (int i=0; i < 60000; i++) {

        int tal = diceTest.roll();
        assertTrue(tal > 0 && tal < 7);

        switch (tal) {

            case 1: a1++;
                break;
            case 2: a2++;
                break;
            case 3: a3++;
                break;
            case 4: a4++;
                break;
            case 5: a5++;
                break;
            case 6: a6++;
                break;
            default: fejl++;

        }
    }

        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6 + " " + fejl);

    }

    @Test
    public void rollMultiple(){

    }
}
