import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class qa_guru_37_2 {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1280";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void qa_guru_37_2() {
        open("/automation-practice-form");
        $x("//input[@id='firstName']").setValue("Sergey"); // XPath
        $x("//input[@id='lastName']").setValue("Rzhevsky");
        $x("//input[@id='userEmail']").setValue("jca@mail.ru");
        $x("//label[@for='gender-radio-1']").click();
        $x("//input[@id='userNumber']").setValue("12345678901");
        $x("//input[@id='dateOfBirthInput']").click();
        $x("//select[@class='react-datepicker__month-select']").selectOption("January");
        $x("//select[@class='react-datepicker__year-select']").selectOption("1984");
        $x("//div[contains(@class, 'react-datepicker__day') and text()='8' and not(contains(@class, 'outside-month'))]").click();
        $x("//input[@id='dateOfBirthInput']").setValue("08 Jan 1984").pressEnter();
        $x("//input[@id='subjectsInput']").setValue("Тема");
        $x("//textarea[@id='currentAddress']").setValue("Адрес");
    }
}






