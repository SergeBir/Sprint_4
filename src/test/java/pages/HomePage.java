package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;


public class HomePage {

    private final WebDriver driver;

    //локатор верхней кнопки "Заказать."
    private final By upperOrder = By.xpath("//button[@class='Button_Button__ra12g']");
    //локатор нижней кнопки "Заказать"
    private final By lowerOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //локатор поля "Вопросы о важном"
    private final By questionsImportant = By.xpath("//div[text()='Вопросы о важном']");

    //локатор первой строки выпадающего списка
    private final By oneLine = By.xpath("//div[@id='accordion__heading-0']");
    //локатор текста, после нажатия на первую строку
    private final By oneText = By.xpath("//div[@id='accordion__panel-0']");

    //локатор второй строки выпадающего списка
    private final By twoLine = By.xpath("//div[@id='accordion__heading-1']");
    //локатор текста, после нажатия на вторую строку
    private final By twoText = By.xpath("//div[@id='accordion__panel-1']");

    //локатор третьей строки выпадающего списка
    private final By threeLine = By.xpath("//div[@id='accordion__heading-2']");
    //локатор текста, после нажатия на третью строку
    private final By threeText = By.xpath("//div[@id='accordion__panel-2']");

    //локатор четвертой строки выпадающего списка
    private final By fourLine = By.xpath("//div[@id='accordion__heading-3']");
    //локатор текста, после нажатия на четвертую строку
    private final By fourText = By.xpath("//div[@id='accordion__panel-3']");

    //локатор пятой строки выпадающего списка
    private final By fiveLine = By.xpath("//div[@id='accordion__heading-4']");
    //локатор текста, после нажатия на пятую строку
    private final By fiveText = By.xpath("//div[@id='accordion__panel-4']");

    //локатор шестой строки выпадающего списка
    private final By sixLine = By.xpath("//div[@id='accordion__heading-5']");
    //локатор текста, после нажатия на шестую строку
    private final By sixText = By.xpath("//div[@id='accordion__panel-5']");

    //локатор седьмой строки выпадающего списка
    private final By sevenLine = By.xpath("//div[@role='button' and contains(text(),'Можно ли отменить заказ?')]");
    //private final By sevenLine = By.xpath("//div[@id='accordion__heading-6']");
    //локатор текста, после нажатия на седьмую строку
    private final By sevenText = By.id("accordion__panel-6");
    //private final By sevenText = By.xpath("//div[@id='accordion__panel-6']");

    //локатор восьмой строки выпадающего списка
    private final By eightLine = By.xpath("//div[@id='accordion__heading-7']");
    //локатор текста, после нажатия на восьмую строку
    private final By eightText = By.xpath("//div[@id='accordion__panel-7']");

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    //метод прокрутки страницы до нужного элемента
    public void scrollDown() {
        WebElement element = driver.findElement(questionsImportant);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //метод нажатия на первую строку
    public void clickLine1() {
        driver.findElement(oneLine).click();
    }

    //метод на получение текста из первой строки
    public void oneLineText() {
        String text = driver.findElement(oneText).getText();
        assertEquals(text, "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }

    //метод нажатия на вторую строку
    public void clickLine2() {
        driver.findElement(twoLine).click();
    }

    //метод на получение текста из второй строки
    public void twoLineText() {
        String text = driver.findElement(twoText).getText();
        assertEquals(text, "Пока что у нас так: один заказ — один самокат." +
                " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
    }

    //метод нажатия на третью строку
    public void clickLine3() {
        driver.findElement(threeLine).click();
    }

    //метод на получение текста из третьей строки
    public void threeLineText() {
        String text = driver.findElement(threeText).getText();
        assertEquals(text, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
                " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
    }

    //метод нажатия на четвертую строку
    public void clickLine4() {
        driver.findElement(fourLine).click();
    }

    //метод на получение текста из четвертой строки
    public void fourLineText() {
        String text = driver.findElement(fourText).getText();
        assertEquals(text, "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
    }

    //метод нажатия на пятую строку
    public void clickLine5() {
        driver.findElement(fiveLine).click();
    }

    //метод на получение текста из пятой строки
    public void fiveLineText() {
        String text = driver.findElement(fiveText).getText();
        assertEquals(text, "Пока что нет!" +
                " Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
    }

    //метод нажатия на шестую строку
    public void clickLine6() {
        driver.findElement(sixLine).click();
    }

    //метод на получение текста из шестой строки
    public void sixLineText() {
        String text = driver.findElement(sixText).getText();
        assertEquals(text, "Самокат приезжает к вам с полной зарядкой." +
                " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
                " Зарядка не понадобится.");
    }

    //метод нажатия на седьмую строку
    public void clickLine7() {
        WebElement element = driver.findElement(sevenLine);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    //метод на получение текста из седьмой строки
    public void sevenLineText() {
        String text = driver.findElement(sevenText).getText();
        assertEquals(text, "Да, пока самокат не привезли." +
                " Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
    }

    //метод нажатия на восьмую строку
    public void clickLine8() {
        WebElement element = driver.findElement(eightLine);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    //метод на получение текста из первой строки
    public void eightLineText() {
        String text = driver.findElement(eightText).getText();
        assertEquals(text, "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }

    public void clickButtonNextUpper() {
        WebElement element = driver.findElement(upperOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
}
