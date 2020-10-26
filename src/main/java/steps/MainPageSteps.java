package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @Step("В меню выбираем пункт \"{0}\"")
    public void selectMenuItem(String item) {
        mainPage.selectMenuItem(item);
    }

    @Step("В подменю выбираем подпункт \"{0}\"")
    public void selectSubMenuItem(String item) {
        mainPage.selectSubMenuItem(item);
    }
}
