package homework.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendUsername(String username) {
        WebElement usernameField = driver.findElement(By.name("user-name"));
        usernameField.sendKeys(username);
    }

    public void sendPassword(String password) {
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();
    }
}
