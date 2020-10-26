package steps;


import io.cucumber.java.ru.Когда;

public class ScenarioSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();
    InsurancePageSteps insurancePageSteps = new InsurancePageSteps();
    TravelInsurancePageSteps travelInsurancePageSteps = new TravelInsurancePageSteps();
    TravelInsuranceFirstFormPageSteps travelInsuranceFirstFormPageSteps = new TravelInsuranceFirstFormPageSteps();

    @Когда("^на главной странице в меню выбираем раздел {string}$")
    public void на_главной_странице_в_меню_выбираем_раздел(String string) {
        mainPageSteps.selectMenuItem(string);
    }

    @Когда("^на открывшемся на главной странице меню выбираем {string}$")
    public void на_открывшемся_на_главной_странице_меню_выбираем(String string) {
        mainPageSteps.selectSubMenuItem(string);
    }

    @Когда("^на странице {string} в блоке {string} нажимаем {string}$")
    public void на_странице_в_блоке_нажимаем(String string) {
        insurancePageSteps.selectMenuItem(string);
    }

    @Когда("^на странице {string} проверяем наличие заголовка {string}$")
    public void на_странице_проверяем_наличие_заголовка(String string) {
        travelInsurancePageSteps.checkTitle(string);
    }

    @Когда("^на странице {string} нажимаем \"Оформить Онлайн\"$")
    public void на_странице_нажимаем_Оформить_Онлайн(String string) {
        travelInsurancePageSteps.proceed();
    }

    @Когда("^на вкладке \"Выбор полиса\" выбираем сумму страховой защиты {string}$")
    public void на_вкладке_Выбор_полиса_выбираем_сумму_страховой_защиты(String string) {
        travelInsuranceFirstFormPageSteps.selectSum(string);
    }

    @Когда("^на вкладке \"Выбор полиса\" выбираем сумму страховой защиты {string}$")
    public void на_вкладке_Выбор_полиса_выбираем_сумму_страховой_защиты(String string) {
        travelInsuranceFirstFormPageSteps.selectSum(string);
    }

    @Когда("^на вкладке \"Выбор полиса\" выбираем сумму страховой защиты {string}$")
    public void на_вкладке_Выбор_полиса_выбираем_сумму_страховой_защиты(String string) {
        travelInsuranceFirstFormPageSteps.selectSum(string);
    }
}