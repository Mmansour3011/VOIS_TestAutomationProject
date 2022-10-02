package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewMailPage {
    private WebDriver driver;
    private By newMessageButton = By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/button");
    private By to_messageTextBox = By.cssSelector(".field [placeholder]");
    private By subject_messageTextBox = By.xpath("/html/body/div[1]/div[4]/div/div/div/div/div/div[3]/div/div/input");
    private By messageTextFrame = By.xpath("/html/body/div[1]/div[4]/div/div/div/div/section/div/div/div[1]/div/iframe");
    private By messageTextBody = By.xpath("//html//body[not(contains(@class,'is-comfortable'))]");


    private By messageTextBox = By.cssSelector("#rooster-editor > div:nth-child(1)");
    private By attachment_messageTextBox = By.cssSelector("body > div.app-root > div.composer-container > div > div > div > footer > div > div.flex.flex-item-fluid > div.flex-item-fluid.flex.pr1 > div > label > input");
    private By sendMessageButton = By.cssSelector("body > div.app-root > div.composer-container > div > div > div > footer > div > div.button-group.button-group-solid-norm.button-group-medium > button");

    public NewMailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNewMessage() {
        driver.findElement(newMessageButton).click();
    }

    public void enterMailReceiver(String email) {
        driver.findElement(to_messageTextBox).sendKeys(email);
    }

    public void enterMailSubject(String subject) {
        driver.findElement(subject_messageTextBox).sendKeys(subject);
    }

    public void switchToEditArea() {
        driver.switchTo().frame(driver.findElement(messageTextFrame));
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }


    public void enterMailContent(String mailContent) {
        switchToEditArea();
        driver.findElement(messageTextBox).clear();
        driver.findElement(messageTextBox).sendKeys(mailContent);
        switchToParentFrame();

    }

    public void setAttachment(String filePath) {
        driver.findElement(attachment_messageTextBox).sendKeys(filePath);
    }

    public void clickSendEmail() {
        driver.findElement(sendMessageButton).click();
    }

}
