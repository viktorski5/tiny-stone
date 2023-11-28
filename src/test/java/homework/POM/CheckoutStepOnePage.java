package homework.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutStepOnePage {
    public WebDriver driver;

    public CheckoutStepOnePage(WebDriver driver) {
        this.driver = driver;
    }

    public void firstNameInput(String fName) {
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys(fName);
    }

    public void lastNameInput(String lName) {
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys(lName);
    }

    public void postalCodeInput(String pCode) {
        WebElement postalCode = driver.findElement(By.name("postalCode"));
        postalCode.sendKeys(pCode);
    }

    public void clickOnCancel() {
        WebElement cancel = driver.findElement(By.id("cancel"));
        cancel.click();
    }

    public void clickOnContinue() {
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
    }
}
