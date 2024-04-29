package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class TwoOrderPage {

    WebDriver driver;

    public TwoOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    // Поле даты доставки
    private By fieldCalendarDate = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");

    // Стрелка выпадающего списка срок аренды
    private By dropDownArrowRental = By.xpath(".//span[@class='Dropdown-arrow']");

    // Значение списка продолжительности аренды - "Сутки"
    private By rentalOneDay = By.xpath(".//div[@role='option' and text()='сутки']");

    // Значение чек-бокса цвета самоката - "Черный жемчуг".
    private By scooterColourBlack = By.id("black");

    // Поле комментария для курьера
    private By fieldComments = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");

    // Кнопка "Заказать".
    private By orderButtonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");

    // Текст всплывающего уведомления - "Хотите оформить заказ?".
    private By windowQuestionNewOrder = By.xpath(".//div[text()='Хотите оформить заказ?']");

    // Кнопка "Да" во всплывающем уведомлении.
    private By orderButtonFinal = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");

    // Текст всплывающего подтверждения - "Заказ оформлен".
    private By windowСonfirmationNewOrder = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    public void typeFieldCalendarDate(String calendarDate){
        driver.findElement(fieldCalendarDate).sendKeys(calendarDate);
    }
    public void clickDropDownArrowRental(){

        driver.findElement(dropDownArrowRental).click();
    }
    public void pickRentalPeriodOneDay(){

        driver.findElement(rentalOneDay).click();
    }
    public void pickScooterColourBlack(){

        driver.findElement(scooterColourBlack).click();
    }
    public void typeFieldComments(String comments){

        driver.findElement(fieldComments).sendKeys(comments);
    }
    public void clickOrderButtonNext(){

        driver.findElement(orderButtonNext).click();
    }
    public void checkWindowQuestionNewOrder(){
        boolean isDisplayed = driver.findElement(windowQuestionNewOrder).isDisplayed();
        assertTrue(isDisplayed);
    }
    public void clickOrderButtonFinal(){
        driver.findElement(orderButtonFinal).click();
    }
    public void checkWindowСonfirmationNewOrder(){
        boolean isDisplayed = driver.findElement(windowСonfirmationNewOrder).isDisplayed();
        assertTrue(isDisplayed);
    }

}
