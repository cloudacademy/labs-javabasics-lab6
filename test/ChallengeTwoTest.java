import org.junit.Test;
import static org.junit.Assert.*;

public class ChallengeTwoTest {

    protected void setUp() {
    }

    @Test
    public void test() {
        double result = ChallengeTwo.stringToDouble("3.14159");
        double expected = 3.14159;
        assertTrue(result == expected);

        result = ChallengeTwo.stringToDouble("-0.3249");
        expected = -0.3249;
        assertTrue(result == expected);
    }
}