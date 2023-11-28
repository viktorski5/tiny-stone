package homework.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    public WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        WebElement add = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        add.click();
    }

    public void removeFromCart() {
        WebElement remove = driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        remove.click();
    }

    public void logOut() {
        WebElement sidebar = driver.findElement(By.id("react-burger-menu-btn"));
        sidebar.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        logout.click();
    }

    public void goToCart() {
        WebElement cart = driver.findElement(By.id("shopping_cart_container"));
        cart.click();
    }
}
