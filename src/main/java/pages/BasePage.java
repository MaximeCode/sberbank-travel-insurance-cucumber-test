package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    BasePage() {
        this.driver = BaseSteps.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
    }

    void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
