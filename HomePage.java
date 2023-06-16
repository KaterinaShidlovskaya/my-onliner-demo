import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    String footerClassName = "footer-style__copy";

    // auth-bar__item auth-bar__item--text
    String buttonEnterByXPath = "//*[@id='userbar']/div[1]/div/div/div[1]";
    String buttonNewsByXpath = "//span[@class='b-main-navigation__text' and text() = 'Новости']";
    String servicesItemByXpath = "//span[@class='b-main-navigation__text' and text() = 'Услуги']";
    String mainNavAvtobaraholkaItemXpath = "//span[@class='b-main-navigation__text'and text()='Автобарахолка']";
    String mainNavForumItemXpath = "//span[@class='b-main-navigation__text'and text()='Форум']";
    String mainNavFleaItemByXpath = "//span[@class='b-main-navigation__text'][text()='Барахолка']";
    String buttonCatalogItemXpath = "//span[@class='b-main-navigation__text' and text() = 'Каталог']";
    String buttonHousesAndApartmentsItemXpath = "//span[@class='b-main-navigation__text' and text() = 'Дома и квартиры']";

    String buttonLoginByXpath = "//div[contains(text(),'Вход')]";
    String url = "https://www.onliner.by/";

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage clickNewsButton() {
        WebElement buttonNews = driver.findElement(By.className(buttonNewsByXpath));
        buttonNews.click();
        return this;
    }

    public void clickButtonEnter() {
        WebElement buttonEnter = driver.findElement(By.xpath(buttonEnterByXPath));
        buttonEnter.click();
    }


    public void clickButtonLogin() {
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginByXpath));
        buttonLogin.click();
    }

    public void clickmainNavAvtobaraholkaItem() {
        WebElement mainNavAvtobaraholkaItem = driver.findElement(By.xpath(mainNavAvtobaraholkaItemXpath));
        mainNavAvtobaraholkaItem.click();
    }

    public void clickServicesItem() {
        WebElement servicesItem = driver.findElement(By.xpath(servicesItemByXpath));
        servicesItem.click();
    }

    public HomePage clickMenuItemFlea() {
        WebElement menuItemFlea = driver.findElement(By.xpath(mainNavFleaItemByXpath));
        menuItemFlea.click();
        return this;
    }

    public void clickbuttonCatalogItem() {
        WebElement buttonCatalogItem = driver.findElement(By.xpath(buttonCatalogItemXpath));
        buttonCatalogItem.click();
    }

    public String getFooterText() {

        WebElement footerText = driver.findElement(By.className(footerClassName));
        String actualFooterText = footerText.getText();
        return actualFooterText;
    }

    public void goTo() {
        driver.get(url);
    }
    public HomePage clickMenuItemHouses(){
        WebElement buttonHouses = driver.findElement(By.xpath(buttonHousesAndApartmentsItemXpath));
        buttonHouses.click();
        return this;
    }
}
