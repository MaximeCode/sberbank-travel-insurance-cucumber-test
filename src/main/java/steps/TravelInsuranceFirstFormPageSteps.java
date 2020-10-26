package steps;

import io.qameta.allure.Step;
import pages.TravelInsuranceFirstFormPage;

public class TravelInsuranceFirstFormPageSteps {

    TravelInsuranceFirstFormPage travelInsurancePageFirstForm = new TravelInsuranceFirstFormPage();

    @Step("На вкладке \"Выбор полиса\" выбираем сумму страховой защиты \"{0}\"")
    public void selectSum(String item) {
        travelInsurancePageFirstForm.selectSum(item);
    }

    @Step("Нажимаем на кнопку \"Оформить\"")
    public void proceed() {
        travelInsurancePageFirstForm.proceed();
    }
}
