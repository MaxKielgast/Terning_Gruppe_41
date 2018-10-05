package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {


    @org.junit.jupiter.api.Test
    void roll() {
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
