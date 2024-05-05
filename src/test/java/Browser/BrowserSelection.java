package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelection {
    WebDriver driver;

    @Before
    public void startUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        /*WebDriverManager.firefoxdriver().clearDriverCache().setup();
        driver = new FirefoxDriver();*/

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void clean(){
        // Закрой браузер
        driver.quit();
    }
}
