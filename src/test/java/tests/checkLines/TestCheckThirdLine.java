package tests.checkLines;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

import java.time.Duration;

public class TestCheckThirdLine extends BaseTest {

    @Test
    public void checkIsThirdLineTextEqualsTrue() {

        driver.get("https://qa-scooter.praktikum-services.ru");

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Button_Button__ra12g")));

        HomePage homepage = new HomePage(driver);
        homepage.scrollDown(); //делаем скролл в самый них страницы до текста "Вопросы о важном"

        homepage.clickLine3(); //нажимаем на третью строку в выпадающем списке

        homepage.threeLineText(); //сравниваем полученный текст

    }
}
