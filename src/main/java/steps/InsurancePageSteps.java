package steps;

import io.qameta.allure.Step;
import pages.InsurancePage;

public class InsurancePageSteps {

    InsurancePage insurancePage = new InsurancePage();

    @Step("В меню выбираем пункт \"{0}\"")
    public void selectMenuItem(String item) {
        insurancePage.selectMenuItem(item);
    }
}
