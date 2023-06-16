import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginFormTest extends BaseTest {

    LoginFormPage loginFormPage;
    WebDriver driver;

    @Test
    public void testLoginFormOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        homePage.clickButtonEnter();

        LoginFormPage loginFormPage = new LoginFormPage(driver);
        String actual = loginFormPage.getLabelTitleEnter();

        Assertions.assertEquals("Вход", actual);
    }

    @Test
    public void testIsCorrectNameButtonSignIn() {
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        LoginFormPage page = new LoginFormPage(driver);

        homePage.goTo();
        homePage.clickButtonEnter();
        Assertions.assertEquals("Войти", page.getTextOfBtnLogin());
    }

    @Test
    public void testPasswordPlaceholder() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        driver.manage().window().maximize();
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickButtonLogin();
        String actualResult = loginFormPage.getPasswordText();
        Assertions.assertEquals("Пароль", actualResult);
    }

    @Test
    public void compareEmailPlaceholder(){

        loginFormPage = new LoginFormPage(driver);
        String actualEmailPlaceholder = loginFormPage.getEmailPlaceholder();
        Assertions.assertEquals("Ник или e-mail", actualEmailPlaceholder);
    }
}

