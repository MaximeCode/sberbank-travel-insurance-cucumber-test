package steps;

import io.qameta.allure.Step;
import pages.InsurancePage;

public class InsurancePageSteps {

    InsurancePage insurancePage = new InsurancePage();

    public void selectMenuItem(String item) {
        insurancePage.selectMenuItem(item);
    }
}
