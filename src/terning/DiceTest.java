package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {


    @org.junit.jupiter.api.Test
    void roll() {
        Dice TestDice = new Dice();
        // gentagelse et par gang
        for (int i = 0; i < 100 ; i++) {

            int x = TestDice.roll();
            boolean y = false;

            if(x <= 6 && x >= 1){
                y = true;
            }

            // hvis y er sand, så er der ingen fejl.
            assertTrue(y);
        }
    }
    @org.junit.jupiter.api.Test
    void rollMultiple() {
        
    }
}
