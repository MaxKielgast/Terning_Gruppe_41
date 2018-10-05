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

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        Dice testDice = new Dice();

        //a til f indeholder kvantiteten af rolls(kast) der har givet dens værdi.
        for(int i=1; i <= 60000; i++)
        {

            switch(testDice.roll()) {
                case 1:
                    a++;
                    break;
                case 2:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    d++;
                    break;
                case 5:
                    e++;
                    break;
                case 6:
                    f++;
                    break;
            }
        }
        //der tjekkes med en delta af 400 om alle terningsværdier er opstået 10000 gange, (det som statestik siger at det skal).
        assertEquals(10000, a, 400);
        assertEquals(10000, b, 400);
        assertEquals(10000, c, 400);
        assertEquals(10000, d, 400);
        assertEquals(10000, e, 400);
        assertEquals(10000, f, 400);
    }
}
