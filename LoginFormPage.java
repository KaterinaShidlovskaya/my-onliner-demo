import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFormPage {

    WebDriver driver;

    String labelTitleEnterByClassName = "auth-form__title auth-form__title_big auth-form__title_condensed-default";
    String inputPasswordFieldXpath = "//input[@type='password']";
    String buttonLoginByClassName = "auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full";
    String inputNickNameByXPath = "//input[@placeholder='Ник или e-mail']";
    String errorMessageEmailXpath = "//div[contains(@class,'auth-form__description_error') and contains(text(), 'Укажите ник или e-mail')]";
    String errorMessagePasswordXpath = "//div[contains(@class,'auth-form__description_error') and contains(text(), 'Укажите пароль')]";


    public LoginFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        driver.findElement(By.className(buttonLoginByClassName)).click();
    }

    public String getLabelTitleEnter() {
        WebElement labelTitleEnter = driver.findElement(By.className(labelTitleEnterByClassName));
        return labelTitleEnter.getText();
    }

    public LoginFormPage inputNickName() {
        WebElement inputName = driver.findElement(By.xpath(inputNickNameByXPath));
        inputName.click();
        return this;
    }

    public LoginFormPage inputPasswordCheck() {
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordFieldXpath));
        inputPassword.click();
        return this;
    }

    public String getEmailPlaceholder() {
        WebElement emailPlaceholder = driver.findElement(By.xpath(inputNickNameByXPath));
        return emailPlaceholder.getText();
    }

    public String getPasswordText(){
        WebElement resultField = driver.findElement(By.xpath(inputPasswordFieldXpath));
        return resultField.getText();
    }

    public String getTextOfBtnLogin() {
        WebElement getText = driver.findElement(By.className(buttonLoginByClassName));
        return getText.getText();
    }
}
