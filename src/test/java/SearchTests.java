import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulAntibotTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("html").shouldHave(text("Об этой странице"));
    }

    @Test
    void successYandexTest() {
        open("https://ya.ru");
        $("[name=text]").setValue("Школа Автоматизации QA GURU").pressEnter();
        $("html").shouldHave(text("QA GURU"));
    }
}
