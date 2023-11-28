package homework.POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class POMTest {
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        LoginPage login = new LoginPage(driver);
        InventoryPage inventory = new InventoryPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutStepOnePage ch1 = new CheckoutStepOnePage(driver);
        CheckoutStepTwoPage ch2 = new CheckoutStepTwoPage(driver);
        CheckoutCompletePage chc = new CheckoutCompletePage(driver);

        login.sendUsername("standard_user");
        login.sendPassword("secret_sauce");
        login.clickOnLoginButton();

        inventory.addToCart();
        inventory.removeFromCart();
        inventory.addToCart();
        inventory.goToCart();

        cart.removeFromCart();
        cart.continueShopping();
        inventory.addToCart();
        inventory.goToCart();
        cart.checkout();

        ch1.clickOnCancel();
        cart.checkout();
        ch1.firstNameInput("g");
        ch1.lastNameInput("g");
        ch1.postalCodeInput("g");
        ch1.clickOnContinue();

        ch2.clickOnFinish();
        chc.backHome();
        inventory.logOut();

        driver.quit();
    }
}
