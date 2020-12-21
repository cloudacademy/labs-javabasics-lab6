import org.junit.Test;
import static org.junit.Assert.*;

public class ChallengeOneTest {

    protected void setUp() {
    }

    private String arrayToString(int[] arr) {
        String str = Integer.toString(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            str += ", " + Integer.toString(arr[i]);
        }
        return str;
    }

    @Test
    public void test() {
        var result = ChallengeOne.odds(3);
        assertTrue(arrayToString(result).equals("1, 3, 5"));

        result = ChallengeOne.odds(5);
        assertTrue(arrayToString(result).equals("1, 3, 5, 7, 9"));

        result = ChallengeOne.odds(1);
        assertTrue(arrayToString(result).equals("1"));
    }
}