package tests.checkLines;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;
import java.time.Duration;

public class TestCheckSecondLine extends BaseTest {

    @Test
    public void checkIsSecondLineTextEqualsTrue() {

        driver.get("https://qa-scooter.praktikum-services.ru");

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Button_Button__ra12g")));

        HomePage homepage = new HomePage(driver);
        homepage.scrollDown(); //делаем скролл в самый них страницы до текста "Вопросы о важном"

        homepage.clickLine2(); //нажимаем на вторую строку в выпадающем списке

        homepage.twoLineText(); //сравниваем полученный текст

    }
}
