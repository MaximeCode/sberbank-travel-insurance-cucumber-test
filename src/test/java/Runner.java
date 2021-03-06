import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "steps",
        plugin = "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        tags = "@All")
public class Runner {
}
