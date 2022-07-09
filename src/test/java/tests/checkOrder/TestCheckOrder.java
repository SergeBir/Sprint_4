package tests.checkOrder;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;
import java.time.Duration;
import pages.FirstOrderPage;
import pages.SecondOrderPage;

public class TestCheckOrder extends BaseTest {

    @Test
    public void checkDataOrderPagesAreCorrect() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru");

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Button_Button__ra12g")));

        HomePage homepage = new HomePage(driver);
        homepage.clickButtonNextUpper();

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='* Имя']")));

        FirstOrderPage firstOrderPage = new FirstOrderPage(driver);

        firstOrderPage.clickLineName();//Нажимаем на строку "Имя"
        firstOrderPage.putLineName("Сергей");//Передаем данные имени
        firstOrderPage.clickLineLastname();//Нажимаем на строку "Фамилия"
        firstOrderPage.putLineLastname("Бирюков");//Передаем данные фамилии
        firstOrderPage.clickLineHome();//Нажимаем на строку "Адрес"
        firstOrderPage.putLineHome("Москва");//Передаем данные адреса
        firstOrderPage.newScrollDown();//Делаем скролл до строки "Метро"
        firstOrderPage.clickLineStation();//Выбираем станцию метро
        firstOrderPage.clickLinePhone();//Нажимаем на строку "Телефон"
        firstOrderPage.putLinePhone("897759604805");//Передаем номер телефона
        firstOrderPage.clickButtonCookie();//Принимаем сообщение о "Cookie"
        firstOrderPage.ButtonScrollDown();//Делаем скролл внил
        firstOrderPage.clickNextButton();//Нажимаем кнопку "Далее"

        SecondOrderPage secondOrderPage = new SecondOrderPage(driver);

        secondOrderPage.clickLineData();//Нажимаем на строку даты привоза
        secondOrderPage.putLineData("17.07.2022");//Передаем данные
        secondOrderPage.clickColor();//Ставим цвет чекбокса
        secondOrderPage.clickLineTime();//Нажимаем на строку времени аренды
        secondOrderPage.choiceLineTime();//Выбираем срок аренды
        secondOrderPage.clickLineComment();//Нажимаем на строку коммента
        secondOrderPage.putLineComment("Пишу свой первый автотест!");//Передаем комментарий
        secondOrderPage.clickButtonOrder();//Нажимаем кнопку "Заказать"
        secondOrderPage.clickButtonYes();//Нажимаем "Да"

        //баг - не нажимается кнопка "Да"






    }
}
