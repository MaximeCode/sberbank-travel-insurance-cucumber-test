import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.BaseSteps;

public class BaseTest {

    @Before
    public static void setUp() {
        BaseSteps.setUp();
    }

    @After
    public static void tearDown() {
        BaseSteps.tearDown();
    }
}
