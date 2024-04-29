package Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //Верхняя кнопка "Заказать"
    private By orderButtonMenu = By.className("Button_Button__ra12g");

    //Блок с нижней кнопкой "Заказать".
    private By blockOrderDown = By.className("Home_RoadMap__2tal_");

    //Нижняя кнопка "Заказать".
    private By orderButtonDown = By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[contains(text(), 'Заказать')]");

    //Блок "Вопросы о важном"
    private By blockQuestions = By.className("Home_FourPart__1uthg");

    //Кнопка с вопросом "Сколько это стоит? И как оплатить?"
    private By buttonQuestionCoast = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Сколько это стоит? И как оплатить?')]");

    //Текст ответа на вопрос "Сколько это стоит? И как оплатить?"
    private By textAnswerCoast = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");

    //Кнопка с вопросом "Хочу сразу несколько самокатов! Так можно?"
    private By buttonQuestionFewScooters = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Хочу сразу несколько самокатов! Так можно?')]");

    //Текст ответа на вопрос "Хочу сразу несколько самокатов! Так можно?"
    private By textAnswerFewScooters = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");

    //Кнопка с вопросом "Как рассчитывается время аренды?"
    private By buttonQuestionTimeRent = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Как рассчитывается время аренды?')]");

    //Текст ответа на вопрос "Как рассчитывается время аренды?"
    private By textAnswerTimeRent = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");

    //Кнопка с вопросом "Можно ли заказать самокат прямо на сегодня?"
    private By buttonQuestionOrderToday = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Можно ли заказать самокат прямо на сегодня?')]");

    //Текст ответа на вопрос "Можно ли заказать самокат прямо на сегодня?"
    private By textAnswerOrderToday = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");

    //Кнопка с вопросом "Можно ли продлить заказ или вернуть самокат раньше?"
    private By buttonQuestionExtendAndReturn = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Можно ли продлить заказ или вернуть самокат раньше?')]");

    //Текст ответа на вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    private By textAnswerExtendAndReturn = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");

    //Кнопка с вопросом "Вы привозите зарядку вместе с самокатом?"
    private By buttonQuestionCharger = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Вы привозите зарядку вместе с самокатом?')]");

    //Текст ответа на вопрос "Вы привозите зарядку вместе с самокатом?"
    private By textAnswerCharger = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");

    //Кнопка с вопросом "Можно ли отменить заказ?"
    private By buttonQuestionCancelOrder = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Можно ли отменить заказ?')]");

    //Текст ответа на вопрос "Можно ли отменить заказ?"
    private By textAnswerCancelOrder = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");

    //Кнопка с вопросом "Я живу за МКАДом, привезёте?"
    private By buttonQuestionDeliveryAfterMKAD = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Я жизу за МКАДом, привезёте?')]");

    //Текст ответа на вопрос "Я живу за МКАДом, привезёте?"
    private By textAnswerDeliveryAfterMKAD = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");

    //Клик по кнопке "Заказать" в верхнем меню
        public void clickOrderButtonMenu() {

            driver.findElement(orderButtonMenu).click();
    }

    //Скролл до блока заказа самоката
    public void scrollBlockOrder() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(blockOrderDown));
    }

    //Клик по кнопке "Заказать" в нижнем меню
    public void clickOrderButtonDown() {

            driver.findElement(orderButtonDown).click();
    }
    //Скролл до блока вопросов
    public void scrollBlockFaq() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(blockQuestions));
    }
    //Проверка текста
    public void checkAllLocators(int index, String expectedResult) {
        By[] buttons = {buttonQuestionCoast, buttonQuestionFewScooters, buttonQuestionTimeRent, buttonQuestionOrderToday, buttonQuestionExtendAndReturn, buttonQuestionCharger, buttonQuestionCancelOrder, buttonQuestionDeliveryAfterMKAD};
        By[] locators = {textAnswerCoast, textAnswerFewScooters, textAnswerTimeRent, textAnswerOrderToday, textAnswerExtendAndReturn, textAnswerCharger, textAnswerCancelOrder, textAnswerDeliveryAfterMKAD};

        driver.findElement(buttons[index]).click();
        String actualText = driver.findElement(locators[index]).getText();
        Assert.assertEquals(expectedResult, actualText);
    }
}
