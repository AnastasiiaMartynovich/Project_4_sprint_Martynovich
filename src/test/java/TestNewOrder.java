import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import Page.MainPage;
import Page.OneOrderPage;
import Page.TwoOrderPage;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Parameterized.class)
public class TestNewOrder {

    WebDriver driver;
    MainPage mainPage;
    OneOrderPage oneOrderPage;
    TwoOrderPage twoOrderPage;

    String name;
    String surname;
    String address;
    String phoneNumber;
    String calendarDate;
    String comments;

    public TestNewOrder(String name, String surname, String address, String phoneNumber, String calendarDate, String comments) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.calendarDate = calendarDate;
        this.comments = comments;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> getCredentials() {
        return Arrays.asList(new Object[][]{
                {"Анастасия", "Мартынович", "Арбатская 1", "89161234567", "29.04.2024", "Доставка до 18"},
                {"Александр", "Иванов", "Арбатская 1", "89161234567", "01.05.2024", ""},
        });
    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void orderButtonMenu() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage = new MainPage(driver);
        oneOrderPage = new OneOrderPage(driver);
        twoOrderPage = new TwoOrderPage(driver);

        mainPage.clickOrderButtonMenu();

        oneOrderPage.typeFieldName(name);
        oneOrderPage.typeFieldSurname(surname);
        oneOrderPage.typeFieldAddress(address);
        oneOrderPage.clickDropDownArrowMetro();
        oneOrderPage.pickListMetro();
        oneOrderPage.typeFieldPhone(phoneNumber);
        oneOrderPage.clickButtonNext();

        twoOrderPage.typeFieldCalendarDate(calendarDate);
        twoOrderPage.clickDropDownArrowRental();
        twoOrderPage.pickRentalPeriodOneDay();
        twoOrderPage.pickScooterColourBlack();
        twoOrderPage.typeFieldComments(comments);
        twoOrderPage.clickOrderButtonNext();
        twoOrderPage.checkWindowQuestionNewOrder();
        twoOrderPage.clickOrderButtonFinal();
        twoOrderPage.checkWindowСonfirmationNewOrder();
    }
    @Test
    public void orderButtonDown() {

        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        mainPage = new MainPage(driver);
        oneOrderPage = new OneOrderPage(driver);
        twoOrderPage = new TwoOrderPage(driver);

        mainPage.scrollBlockOrder();
        mainPage.clickOrderButtonDown();

        oneOrderPage.typeFieldName(name);
        oneOrderPage.typeFieldSurname(surname);
        oneOrderPage.typeFieldAddress(address);
        oneOrderPage.clickDropDownArrowMetro();
        oneOrderPage.pickListMetro();
        oneOrderPage.typeFieldPhone(phoneNumber);
        oneOrderPage.clickButtonNext();

        twoOrderPage.typeFieldCalendarDate(calendarDate);
        twoOrderPage.clickDropDownArrowRental();
        twoOrderPage.pickRentalPeriodOneDay();
        twoOrderPage.pickScooterColourBlack();
        twoOrderPage.typeFieldComments(comments);
        twoOrderPage.clickOrderButtonNext();
        twoOrderPage.checkWindowQuestionNewOrder();
        twoOrderPage.clickOrderButtonFinal();
        twoOrderPage.checkWindowСonfirmationNewOrder();
    }

    @After
    public void clean() {
        // Закрой браузер
        driver.quit();
    }
}
