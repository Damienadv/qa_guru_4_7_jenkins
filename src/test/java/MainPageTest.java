import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    @Test
    @DisplayName("Page should have title \"Больше рекламного  холдинга — быстрее маленького агентства\"")
    void titlePageTest() {
        open("https://www.9pandas.ru/");

        $("div .main-text h1").
                shouldHave(attribute("ariaLabel","Больше рекламного  холдинга — быстрее маленького агентства"));
    }

    @Test
    @DisplayName("Top menu items")
    void topMenuTest() {
        open("https://www.9pandas.ru/");

        $(".language-choose ul").shouldHave(text("Eng\n" +
                "Рус"));
        $(".header-links ul").shouldHave(text("Проекты\n" +
                "Услуги\n" +
                "О нас\n" +
                "Контакты"));

    }



}


