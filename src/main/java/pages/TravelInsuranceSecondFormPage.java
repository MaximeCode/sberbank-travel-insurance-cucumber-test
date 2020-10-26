package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TravelInsuranceSecondFormPage extends BasePage {

    @FindBy(id = "surname_vzr_ins_0")
    private WebElement surnameInput;

    @FindBy(id = "name_vzr_ins_0")
    private WebElement nameInput;

    @FindBy(id = "birthDate_vzr_ins_0")
    private WebElement birthDateInput;

    @FindBy(id = "person_lastName")
    private WebElement personLastNameInput;

    @FindBy(id = "person_firstName")
    private WebElement personFirstNameInput;

    @FindBy(id = "person_middleName")
    private WebElement personMiddleNameInput;

    @FindBy(id = "person_birthDate")
    private WebElement personBirthDateInput;

    @FindBy(id = "passportSeries")
    private WebElement passportSeriesInput;

    @FindBy(id = "passportNumber")
    private WebElement passportNumberInput;

    @FindBy(id = "documentDate")
    private WebElement documentDateInput;

    @FindBy(id = "documentIssue")
    private WebElement documentIssueInput;

    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement continueButton;

    @FindBy(xpath = "//div[contains(@class, 'alert-form')]")
    private WebElement warningElement;

    public void proceed() {
        click(continueButton);
    }

    public void checkWarning(String text) {
        Assert.assertEquals("Текст сообщения не соотвествует ожидаемому.", text, warningElement.getText());
    }

    public void fillField(String name, String value) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getInput(name)));
        element.click();
        element.clear();
        element.sendKeys(value);
    }

    public void checkField(String name, String value) {
        Assert.assertEquals(value, getInput(name).getAttribute("value"));
    }

    private WebElement getInput(String name) {
        switch (name) {
            case "фамилия застрахованного":
                return surnameInput;
            case "имя застрахованного":
                return nameInput;
            case "дата рождения застрахованного":
                return birthDateInput;
            case "фамилия страхователя":
                return personLastNameInput;
            case "имя страхователя":
                return personFirstNameInput;
            case "отчество страхователя":
                return personMiddleNameInput;
            case "дата рождения страхователя":
                return personBirthDateInput;
            case "серия паспорта страхователя":
                return passportSeriesInput;
            case "номер паспорта страхователя":
                return passportNumberInput;
            case "дата выдачи паспорта страхователя":
                return documentDateInput;
            case "кем выдан паспорт страхователя":
                return documentIssueInput;
            default: throw new Error("Элемент \"" + name + "\" не найден.");
        }
    }
}
