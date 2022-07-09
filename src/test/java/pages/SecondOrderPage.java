package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SecondOrderPage {
    private final WebDriver driver;

    //локатор строки "Когда привезти самокат
    private final By data = By.xpath("//input[@placeholder='* Когда привезти самокат']");

    //локатор строки "Срок аренды"
    private final By time = By.xpath("//div[@class='Dropdown-control']");

    //локатор чекбокса "Цвет самоката"
    private final By colour = By.xpath("//input[@id = 'black'and@class='Checkbox_Input__14A2w']");

    //локатор поля "Комментарий для курьера"
    private final By comment = By.xpath("//input[@placeholder='Комментарий для курьера']");

    //локатор нижней кнопки "Заказать"
    private final By order = By.xpath("//button[text()='Заказать' and @class='Button_Button__ra12g Button_Middle__1CSJM']");

    //локатор верхней кнопки "Заказать"
    private final By UpOrderButton = By.xpath("//button[text()='Заказать' and @class='Button_Button__ra12g']");


    public SecondOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    //метод нажатия на первую строки с выбором даты
    public void clickLineData() {
        WebElement element = driver.findElement(data);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

    }

    //методы передачи данных в строку даты
    public void putLineData(String sendData) {
        driver.findElement(data).sendKeys(sendData);
        WebElement elements = driver.findElement(By.xpath("//div[@role='button' and text()='17']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elements);
    }

    //метод нажатия на строку времени
    public void clickLineTime() {
        WebElement element = driver.findElement(By.xpath("//div[@class='Dropdown-placeholder']"));
        element.click();

    }
    //метод выбора строки из списка
    public void choiceLineTime() {
        driver.findElement(By.xpath("//div[@class='Dropdown-option' and text()='сутки']")).click();
    }

    //метод выбора чекбокса
    public void clickColor() {
        WebElement element = driver.findElement(colour);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    //метод нажатия строки комментария
    public void clickLineComment() {
        WebElement element = driver.findElement(comment);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    //методы передачи текста в строку комментария
    public void putLineComment(String sendComment) {
        driver.findElement(comment).sendKeys(sendComment);
    }

    //метод нажатия на кнопку "Заказать"
    public void clickButtonOrder() {
        WebElement element = driver.findElement(order);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    //метод нажатия на кнопку подтверждения
    public void clickButtonYes() {
        driver.findElement(By.xpath("//button[text()='Да']")).click();
    }
}
