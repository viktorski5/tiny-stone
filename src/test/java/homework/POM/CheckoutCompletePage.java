package homework.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage {
    public WebDriver driver;

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void backHome() {
        WebElement backHomeButton = driver.findElement(By.name("back-to-products"));
        backHomeButton.click();
    }
}
