package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    /**
     *<p> Denne Funktion tester om terningen viser fra 1 til 6, 100 gange.</p>
     *
     *@author Hans.
     *@version 1.
     *@return void, laver fejl hvis tallet er uden for m&aelig;ngden 1 til 6.
     */
    @org.junit.jupiter.api.Test
    void roll() {
        Dice TestDice = new Dice();
        // hvor mange gange funktionen bliver gentaget.
        for (int i = 0; i < 100 ; i++) {


            // her. hvis terningen viser mindre end aligmet 6 og mere end aligmet 1, så y = sand,
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
