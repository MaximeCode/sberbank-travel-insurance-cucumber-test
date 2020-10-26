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

    public TravelInsuranceSecondFormPage fillSurname(String surname) {
        fillField(surnameInput, surname);
        return this;
    }

    public TravelInsuranceSecondFormPage fillName(String name) {
        fillField(nameInput, name);
        return this;
    }

    public TravelInsuranceSecondFormPage fillBirthDate(String birthDate) {
        fillField(birthDateInput, birthDate);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPersonLastName(String personLastName) {
        fillField(personLastNameInput, personLastName);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPersonFirstName(String personFirstName) {
        fillField(personFirstNameInput, personFirstName);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPersonMiddleName(String personMiddleName) {
        fillField(personMiddleNameInput, personMiddleName);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPersonBirthDate(String personBirthDate) {
        fillField(personBirthDateInput, personBirthDate);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPassportSeries(String passportSeries) {
        fillField(passportSeriesInput, passportSeries);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPassportNumber(String passportNumber) {
        fillField(passportNumberInput, passportNumber);
        return this;
    }

    public TravelInsuranceSecondFormPage fillDocumentDate(String documentDate) {
        fillField(documentDateInput, documentDate);
        return this;
    }

    public TravelInsuranceSecondFormPage fillDocumentIssue(String documentIssue) {
        fillField(documentIssueInput, documentIssue);
        return this;
    }

    public TravelInsuranceSecondFormPage checkSurname(String surname) {
        checkField(surnameInput, surname);
        return this;
    }

    public TravelInsuranceSecondFormPage checkName(String name) {
        checkField(nameInput, name);
        return this;
    }

    public TravelInsuranceSecondFormPage checkBirthDate(String birthDate) {
        checkField(birthDateInput, birthDate);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPersonLastName(String personLastName) {
        checkField(personLastNameInput, personLastName);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPersonFirstName(String personFirstName) {
        checkField(personFirstNameInput, personFirstName);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPersonMiddleName(String personMiddleName) {
        checkField(personMiddleNameInput, personMiddleName);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPersonBirthDate(String personBirthDate) {
        checkField(personBirthDateInput, personBirthDate);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPassportSeries(String passportSeries) {
        checkField(passportSeriesInput, passportSeries);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPassportNumber(String passportNumber) {
        checkField(passportNumberInput, passportNumber);
        return this;
    }

    public TravelInsuranceSecondFormPage checkDocumentDate(String documentDate) {
        checkField(documentDateInput, documentDate);
        return this;
    }

    public TravelInsuranceSecondFormPage checkDocumentIssue(String documentIssue) {
        checkField(documentIssueInput, documentIssue);
        return this;
    }

    public void proceed() {
        click(continueButton);
    }

    public void checkWarning() {
        Assert.assertEquals("При заполнении данных произошла ошибка", warningElement.getText());
    }

    void fillField(WebElement field, String value) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(field));
        element.click();
        element.clear();
        element.sendKeys(value);
    }

    void checkField(WebElement field, String value) {
        Assert.assertEquals(value, field.getAttribute("value"));
    }
}
