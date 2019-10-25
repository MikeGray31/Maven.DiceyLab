import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

    @Test
    public void TestDiceRollSingle(){
        Dice newdice = new Dice(1);
        int max =6;
        int min = 1;

        for (int i = 0; i< 50; i++) {
            int sum = newdice.Sum();
            Assert.assertTrue(sum <= max);
            Assert.assertTrue(sum >= min);
        }

    }

    @Test
    public void TestDiceRollDouble(){
        Dice newdice = new Dice(2);
        int max =12;
        int min = 2;

        for (int i = 0; i< 50; i++) {
            int sum = newdice.Sum();
            Assert.assertTrue(sum <= max);
            Assert.assertTrue(sum >= min);
        }

    }

    @Test
    public void TestDiceRollTriple(){
        Dice newdice = new Dice(3);
        int max =18;
        int min = 3;

        for (int i = 0; i< 50; i++) {
            int sum = newdice.Sum();
            Assert.assertTrue(sum <= max);
            Assert.assertTrue(sum >= min);
        }

    }

}
