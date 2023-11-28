package homework.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    public WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void removeFromCart() {
        WebElement remove = driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        remove.click();
    }

    public void continueShopping() {
        WebElement cs = driver.findElement(By.name("continue-shopping"));
        cs.click();
    }

    public void checkout() {
        WebElement checkOut = driver.findElement(By.id("checkout"));
        checkOut.click();
    }
}
