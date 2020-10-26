package steps;

import io.qameta.allure.Step;
import pages.TravelInsurancePage;

public class TravelInsurancePageSteps {

    TravelInsurancePage travelInsurancePage = new TravelInsurancePage();

    @Step("Проверяем наличие на странице заголовка \"{0}\"")
    public void checkTitle(String expected) {
        travelInsurancePage.checkTitle(expected);
    }

    @Step("Нажимаем на кнопку \"Оформить Онлайн\"")
    public void proceed() {
        travelInsurancePage.proceed();
    }
}
