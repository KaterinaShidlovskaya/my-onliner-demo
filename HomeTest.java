import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

class HomeTest extends BaseTest {
    ChromeDriver driver;
    HomePage homePage;

public class HomeTest {

}
    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void testCheckHomepageOpened() {
        homePage.goTo();
        String expectedMessage = homePage.getFooterText();
        Assertions.assertEquals(expectedMessage,"© 2001—2023 Onlíner");
    }
    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}