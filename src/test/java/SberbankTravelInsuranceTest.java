/*
1.  Перейти на страницу http://www.sberbank.ru/ru/person.
2.  Нажать на "Страхование".
3.  Выбрать "СберСтрахование", в блоке "Страхование путешественников" нажать "Подробнее"
    (шаг изменён по текущему дизайну сайта).
4.  Проверить наличие на странице заголовка "Страхование путешественников".
5.  Нажать на "Оформить Онлайн".
6.  На вкладке "Выбор полиса" выбрать сумму страховой защиты "Минимальная".
7.  Нажать "Оформить".
8.  На вкладке "Оформить" заполнить фамилию, имя, дату рождения застрахованных,
    фамилию, имя, отчество, дату рождения, пол страхователя, паспортные данные.
    Контактные данные не заполнять.
9.  Проверить, что все поля заполнены правильно.
10. Нажать "Продолжить".
11. Проверить, что появилось сообщение "При заполнении данных произошла ошибка"
    (шаг изменён по текущему дизайну сайта).

    ЗАПУСК mvn clean test
*/

import org.junit.Test;
import steps.*;

public class SberbankTravelInsuranceTest extends BaseTest {

    @Test
    public void sberbankTravelInsuranceTest() {

        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.selectMenuItem("Страхование");
        mainPageSteps.selectSubMenuItem("СберСтрахование");
        InsurancePageSteps insurancePageSteps = new InsurancePageSteps();
        insurancePageSteps.selectMenuItem("Страхование путешественников");
        TravelInsurancePageSteps travelInsurancePageSteps = new TravelInsurancePageSteps();
        travelInsurancePageSteps.checkTitle("Страхование путешественников");
        travelInsurancePageSteps.proceed();
        TravelInsuranceFirstFormPageSteps travelInsuranceFirstFormPageSteps = new TravelInsuranceFirstFormPageSteps();
        travelInsuranceFirstFormPageSteps.selectSum("Минимальная");
        travelInsuranceFirstFormPageSteps.proceed();
        TravelInsuranceSecondFormPageSteps travelInsuranceSecondFormPageSteps = new TravelInsuranceSecondFormPageSteps();
        travelInsuranceSecondFormPageSteps
                .fillSurname("Иванов")
                .fillName("Иван")
                .fillBirthDate("01.01.1960")
                .fillPersonLastName("Петров")
                .fillPersonFirstName("Пётр")
                .fillPersonMiddleName("Петрович")
                .fillPersonBirthDate("01.01.2000")
                .fillPassportSeries("1010")
                .fillPassportNumber("101010")
                .fillDocumentDate("01.01.2020")
                .fillDocumentIssue("МВД России");
        travelInsuranceSecondFormPageSteps
                .checkSurname("Иванов")
                .checkName("Иван")
                .checkBirthDate("01.01.1960")
                .checkPersonLastName("Петров")
                .checkPersonFirstName("Пётр")
                .checkPersonMiddleName("Петрович")
                .checkPersonBirthDate("01.01.2000")
                .checkPassportSeries("1010")
                .checkPassportNumber("101010")
                .checkDocumentDate("01.01.2020")
                .checkDocumentIssue("МВД России");
        travelInsuranceSecondFormPageSteps.proceed();
        travelInsuranceSecondFormPageSteps.checkWarning();
    }
}
