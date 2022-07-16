import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void testTossAndSum() {
        //Given
        int n = 2;
        int actualCount = 0;
        int expectedCount = 0;

        //When
        for (int i = 0; i < 10000; i++){

            Dice dice = new Dice(n);
            //dice.tossAndSum();
            if (dice.tossAndSum() < (n)){
                actualCount++;
            }
            n++;
        }

        //Then
        assertEquals(actualCount, expectedCount);
    }

    @Test
    public  void testTossAndSum2(){
        //Given
        int n = 2;
        int actualCount = 0;
        int expectedCount = 0;

        //When
        for (int i = 0; i < 10000; i++){

            Dice dice = new Dice(n);
            //dice.tossAndSum();
            if (dice.tossAndSum() > (6*n)){
                actualCount++;
            }
            n++;
        }
        //Then
        assertEquals(actualCount, expectedCount);
    }
}