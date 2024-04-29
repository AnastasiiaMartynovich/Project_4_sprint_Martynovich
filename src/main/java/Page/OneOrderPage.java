    package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OneOrderPage {

    WebDriver driver;

    public OneOrderPage(WebDriver driver) {
        this.driver = driver;
            }

    // Поле с именем
    private By fieldName = By.xpath(".//input[@placeholder = '* Имя']");

    // Поле с фамилией
    private By fieldSurname = By.xpath(".//input[@placeholder = '* Фамилия']");

    // Поле с адресом
    private By fieldAddress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");

    // Стрелка выпадающего списка станций метро
    private By dropDownArrowMetro = By.className("select-search__value");

    // Значение списка станций метро - "Сокольники"
    private By listMetroSokolniki = By.xpath("//button[@value='78'][.//div[text()='Арбатская']]");

    // Поле с номером телефона
    private By fieldPhone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");

    // Кнопка "Далее"
    private By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");


    public void typeFieldName(String name) {

        driver.findElement(fieldName).sendKeys(name);
    }
    public void typeFieldSurname(String surname) {

        driver.findElement(fieldSurname).sendKeys(surname);
    }
    public void typeFieldAddress(String address) {

        driver.findElement(fieldAddress).sendKeys(address);
    }
    public void clickDropDownArrowMetro(){

        driver.findElement(dropDownArrowMetro).click();
    }
    public void pickListMetro(){

        driver.findElement(listMetroSokolniki).click();
    }
    public void typeFieldPhone(String phoneNumber){

        driver.findElement(fieldPhone).sendKeys(phoneNumber);
    }
    public void clickButtonNext(){

        driver.findElement(buttonNext).click();
    }
}
