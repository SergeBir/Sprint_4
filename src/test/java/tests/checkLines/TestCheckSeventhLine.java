package tests.checkLines;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;
import java.time.Duration;

public class TestCheckSeventhLine extends BaseTest {

    @Test
    public void checkIsSeventhLineTextEqualsTrue() {

        driver.get("https://qa-scooter.praktikum-services.ru");

        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Button_Button__ra12g")));

        HomePage homepage = new HomePage(driver);
        homepage.scrollDown(); //делаем скролл в самый них страницы до текста "Вопросы о важном"

        homepage.clickLine7(); //нажимаем на седьмую строку в выпадающем списке

        homepage.sevenLineText(); //сравниваем полученный текст

    }
}
