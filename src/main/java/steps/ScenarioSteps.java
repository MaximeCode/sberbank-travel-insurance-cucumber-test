package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.Когда;

import java.util.Map;

public class ScenarioSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();
    InsurancePageSteps insurancePageSteps = new InsurancePageSteps();
    TravelInsurancePageSteps travelInsurancePageSteps = new TravelInsurancePageSteps();
    TravelInsuranceFirstFormPageSteps travelInsuranceFirstFormPageSteps = new TravelInsuranceFirstFormPageSteps();
    TravelInsuranceSecondFormPageSteps travelInsuranceSecondFormPageSteps = new TravelInsuranceSecondFormPageSteps();

    @Когда("на главной странице в меню выбираем раздел {string}")
    public void на_главной_странице_в_меню_выбираем_раздел(String string) {
        mainPageSteps.selectMenuItem(string);
    }

    @Когда("на открывшемся на главной странице меню выбираем {string}")
    public void на_открывшемся_на_главной_странице_меню_выбираем(String string) {
        mainPageSteps.selectSubMenuItem(string);
    }

    @Когда("на странице \"СберСтрахование\" в блоке {string} нажимаем \"Подробнее\"")
    public void на_странице_в_блоке_нажимаем(String string) {
        insurancePageSteps.selectMenuItem(string);
    }

    @Когда("на странице \"Страхование путешественников\" проверяем наличие заголовка {string}")
    public void на_странице_проверяем_наличие_заголовка(String string) {
        travelInsurancePageSteps.checkTitle(string);
    }

    @Когда("на странице \"Страхование путешественников\" нажимаем \"Оформить Онлайн\"")
    public void на_странице_нажимаем_Оформить_Онлайн() {
        travelInsurancePageSteps.proceed();
    }

    @Когда("на вкладке \"Выбор полиса\" выбираем сумму страховой защиты {string}")
    public void на_вкладке_Выбор_полиса_выбираем_сумму_страховой_защиты(String string) {
        travelInsuranceFirstFormPageSteps.selectSum(string);
    }

    @Когда("на вкладке \"Выбор полиса\" нажимаем \"Оформить\"")
    public void на_вкладке_Выбор_полиса_нажимаем_Оформить() {
        travelInsuranceFirstFormPageSteps.proceed();
    }

    @Когда("на вкладке \"Оформление\" заполняем поля данными:")
    public void на_вкладке_Оформление_заполняем_поля_данными(Map<String, String> data) {
        data.forEach((k, v) -> travelInsuranceSecondFormPageSteps.fillField(k, v));
    }

    @Когда("на вкладке \"Оформление\" проверяем правильность заполнения полей:")
    public void на_вкладке_Оформление_проверяем_правильность_заполнения_полей(Map<String, String> data) {
        data.forEach((k, v) -> travelInsuranceSecondFormPageSteps.checkField(k, v));
    }

    @Когда("на вкладке \"Оформление\" нажимаем \"Продолжить\"")
    public void на_вкладке_Оформление_нажимаем_Продолжить() {
        travelInsuranceSecondFormPageSteps.proceed();
    }

    @Когда("на вкладке \"Оформление\" проверяем, что появилось сообщение {string}")
    public void на_вкладке_Оформление_проверяем_что_появилось_сообщение(String string) {
        travelInsuranceSecondFormPageSteps.checkWarning(string);
    }
}
