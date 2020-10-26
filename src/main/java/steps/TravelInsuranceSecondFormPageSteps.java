package steps;

import io.qameta.allure.Step;
import pages.TravelInsuranceSecondFormPage;

public class TravelInsuranceSecondFormPageSteps {

    TravelInsuranceSecondFormPage travelInsuranceSecondFormPage = new TravelInsuranceSecondFormPage();

    @Step("На вкладке \"Оформить\" заполняем фамилию застрахованного \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillSurname(String surname) {
        travelInsuranceSecondFormPage.fillSurname(surname);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем имя застрахованного \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillName(String name) {
        travelInsuranceSecondFormPage.fillName(name);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем дату рождения застрахованного \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillBirthDate(String birthDate) {
        travelInsuranceSecondFormPage.fillBirthDate(birthDate);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем фамилию страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillPersonLastName(String personLastName) {
        travelInsuranceSecondFormPage.fillPersonLastName(personLastName);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем имя страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillPersonFirstName(String personFirstName) {
        travelInsuranceSecondFormPage.fillPersonFirstName(personFirstName);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем отчество страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillPersonMiddleName(String personMiddleName) {
        travelInsuranceSecondFormPage.fillPersonMiddleName(personMiddleName);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем дату рождения страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillPersonBirthDate(String personBirthDate) {
        travelInsuranceSecondFormPage.fillPersonBirthDate(personBirthDate);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем серию паспорта страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillPassportSeries(String passportSeries) {
        travelInsuranceSecondFormPage.fillPassportSeries(passportSeries);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем номер паспорта страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillPassportNumber(String passportNumber) {
        travelInsuranceSecondFormPage.fillPassportNumber(passportNumber);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем дату выдачу паспорта страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillDocumentDate(String documentDate) {
        travelInsuranceSecondFormPage.fillDocumentDate(documentDate);
        return this;
    }

    @Step("На вкладке \"Оформить\" заполняем кем выдан паспорт страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps fillDocumentIssue(String documentIssue) {
        travelInsuranceSecondFormPage.fillDocumentIssue(documentIssue);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем фамилию застрахованного \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkSurname(String surname) {
        travelInsuranceSecondFormPage.checkSurname(surname);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем имя застрахованного \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkName(String name) {
        travelInsuranceSecondFormPage.checkName(name);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем дату рождения застрахованного \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkBirthDate(String birthDate) {
        travelInsuranceSecondFormPage.checkBirthDate(birthDate);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем фамилию страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkPersonLastName(String personLastName) {
        travelInsuranceSecondFormPage.checkPersonLastName(personLastName);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем имя страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkPersonFirstName(String personFirstName) {
        travelInsuranceSecondFormPage.checkPersonFirstName(personFirstName);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем отчество страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkPersonMiddleName(String personMiddleName) {
        travelInsuranceSecondFormPage.checkPersonMiddleName(personMiddleName);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем дату рождения страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkPersonBirthDate(String personBirthDate) {
        travelInsuranceSecondFormPage.checkPersonBirthDate(personBirthDate);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем серию паспорта страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkPassportSeries(String passportSeries) {
        travelInsuranceSecondFormPage.checkPassportSeries(passportSeries);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем номер паспорта страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkPassportNumber(String passportNumber) {
        travelInsuranceSecondFormPage.checkPassportNumber(passportNumber);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем дату выдачу паспорта страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkDocumentDate(String documentDate) {
        travelInsuranceSecondFormPage.checkDocumentDate(documentDate);
        return this;
    }

    @Step("На вкладке \"Оформить\" проверяем кем выдан паспорт страхователя \"{0}\"")
    public TravelInsuranceSecondFormPageSteps checkDocumentIssue(String documentIssue) {
        travelInsuranceSecondFormPage.checkDocumentIssue(documentIssue);
        return this;
    }

    @Step("Нажимаем кнопку \"Продолжить\"")
    public TravelInsuranceSecondFormPageSteps proceed() {
        travelInsuranceSecondFormPage.proceed();
        return this;
    }

    @Step("Проверяем, что появилось сообщение \"При заполнении данных произошла ошибка\".")
    public TravelInsuranceSecondFormPageSteps checkWarning() {
        travelInsuranceSecondFormPage.checkWarning();
        return this;
    }
}
