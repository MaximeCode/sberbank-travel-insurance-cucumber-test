package steps;

import io.qameta.allure.Step;
import pages.TravelInsuranceSecondFormPage;

public class TravelInsuranceSecondFormPageSteps {

    TravelInsuranceSecondFormPage travelInsuranceSecondFormPage = new TravelInsuranceSecondFormPage();

    public void fillField(String name, String value) {
        travelInsuranceSecondFormPage.fillField(name, value);
    }

    public void checkField(String name, String value) {
        travelInsuranceSecondFormPage.checkField(name, value);
    }

    public void proceed() {
        travelInsuranceSecondFormPage.proceed();
    }

    public void checkWarning(String text) {
        travelInsuranceSecondFormPage.checkWarning(text);
    }
}
