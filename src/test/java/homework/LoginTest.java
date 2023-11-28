package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Testiranje je počelo!");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Početak testa!");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Kraj testa!");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Testiranje je završeno!");
    }

    public static void test(WebDriver driver, String username, String password) {
        driver.get("https://www.saucedemo.com");
        WebElement usernameName = driver.findElement(By.name("user-name"));
        usernameName.sendKeys(username);
        WebElement passwordID = driver.findElement(By.id("password"));
        passwordID.sendKeys(password);
        WebElement loginButtonCSS = driver.findElement(By.cssSelector("input[value='Login']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        loginButtonCSS.click();
        wait.until(ExpectedConditions.titleIs("Swag Labs"));
        driver.quit();
    }

    @Test(priority = 1)
    public void successfulLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("Test 1");
        LoginTest.test(driver,"standard_user", "secret_sauce");
    }

    @Test(priority = 2)
    public void wrongUsername() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("Test 2");
        LoginTest.test(driver, "cool_user", "secret_sauce");
    }

    @Test(priority = 3)
    public void wrongPassword() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("Test 3");
        LoginTest.test(driver,"error_user", "secretSauce");
    }
}
