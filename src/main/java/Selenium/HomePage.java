package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By emailTextBox = By.cssSelector("#username");
    private By passwordTextBox = By.cssSelector("#password");

    private By signInButton = By.xpath("/html/body/div[1]/div[3]/div[1]/div/main/div[2]/form/button");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailTextBox).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public NewMailPage clickSignIn() {
        driver.findElement(signInButton).click();
        return new NewMailPage(driver);
    }
}
