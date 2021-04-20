package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Test1")
    void test() {

        step("open yandex.ru", () -> {
            // todo
        });

        step("select “недвижимость»", () -> {
            // todo
        });

        step("type Лухари Хата", () -> {
            // todo
        });

        step("assert results contain Лухари Хата", () -> {
            // todo
        });

    }
}