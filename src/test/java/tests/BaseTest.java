package tests;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public abstract  class BaseTest {
    protected WebDriver driver;

    @Before
    public void configuredDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(chromeOptions);


    }

    @After
    public void closeDriver() {
        driver.quit();
    }
}
