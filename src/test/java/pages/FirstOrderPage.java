package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class FirstOrderPage {
    private final WebDriver driver;

    //локатор строки "Имя"
    private final By firstName = By.xpath("//input[@placeholder='* Имя']");

    //локатор строки "Фамилия"
    private final By lastname = By.xpath("//input[@placeholder='* Фамилия']");

    //локатор строки "Адрес"
    private final By home = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");

    //локатор строки "Метро"
    private final By subwayStation = By.xpath("//input[@placeholder='* Станция метро']");

    //локатор строки из выпадающего меню
    

    //локатор строки "Телефон"
    private final By phoneNumber = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

    //локатор кнопки "Далее"
    private final By next = By.xpath("//button[text()='Далее']");


    public FirstOrderPage(WebDriver driver) {
        this.driver = driver;
        }

    //метод нажатия на первую строку
    public void clickLineName() {
        WebElement element = driver.findElement(firstName);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    //метод  передачи данных в первую строку
    public void putLineName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    //метод нажатия на вторую строку
    public void clickLineLastname() {
        WebElement element = driver.findElement(lastname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    //метод передачи данных во вторую строку
    public void putLineLastname(String last) {
        driver.findElement(lastname).sendKeys(last);
    }

    //метод нажатия на третью строку
    public void clickLineHome() {
        WebElement element = driver.findElement(home);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    //метод передачи данных в третью строку
    public void putLineHome(String myHome) {
        driver.findElement(home).sendKeys(myHome);
    }

    //метод нажатия на выпадающий список
    public void clickLineStation() {
        driver.findElement(By.xpath("//input[@placeholder='* Станция метро']")).click();
        driver.findElement(By.className("select-search__row")).click();
    }

    //метод нажатия на строку номера
    public void clickLinePhone() {
        WebElement element = driver.findElement(phoneNumber);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    //метод передачи данных в строку номера
    public void putLinePhone(String phone) {
        driver.findElement(phoneNumber).sendKeys(phone);
    }
    //метод нажатия на кнопку
    public void clickNextButton() {
        driver.findElement(next).click();
    }
    //метод скролла до строки выпадающего списка
    public void newScrollDown() {
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='* Станция метро']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickButtonCookie() {
        WebElement element = driver.findElement(By.xpath("//button[@class='App_CookieButton__3cvqF']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void ButtonScrollDown() {
        WebElement element = driver.findElement(By.xpath("//button[text()='Далее']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}
