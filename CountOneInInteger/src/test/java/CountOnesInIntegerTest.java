import org.example.CountOnesInInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOnesInIntegerTest {

    private final CountOnesInInteger countOnesInInteger = new CountOnesInInteger();
    @Test
    public void counterTest() {
        assertEquals(0, countOnesInInteger.countOnes(0));
        assertEquals(1, countOnesInInteger.countOnes(1));
        assertEquals(3, countOnesInInteger.countOnes(100));
        assertEquals(31, countOnesInInteger.countOnes(Integer.MAX_VALUE));
    }

    @Test
    public void showOnes() {
        System.out.println((Integer.toBinaryString(100)));
        System.out.println((Integer.toBinaryString(Integer.MAX_VALUE)));
    }
}
