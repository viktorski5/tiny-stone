package homework.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutStepTwoPage {
    public WebDriver driver;

    public CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCancel() {
        WebElement cancel = driver.findElement(By.id("cancel"));
        cancel.click();
    }

    public void clickOnFinish() {
        WebElement finish = driver.findElement(By.id("finish"));
        finish.click();
    }
}
