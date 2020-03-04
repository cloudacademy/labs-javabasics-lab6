import org.junit.Test;
import static org.junit.Assert.*;

public class ChallengeThreeTest {

    protected void setUp() {
    }

    @Test
    public void test() {
        var result = ChallengeThree.dayOfWeek("2000-01-01");
        assertTrue(result.equals("SATURDAY"));

        result = ChallengeThree.dayOfWeek("2019-11-15");
        assertTrue(result.equals("FRIDAY"));
    }
}