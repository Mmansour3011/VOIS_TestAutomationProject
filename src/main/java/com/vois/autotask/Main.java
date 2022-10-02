package com.vois.autotask;

import Config.PropertiesConfig;
import MainHelper.Helper;
import Selenium.NewMailPage;
import Sikuli.ExcelSheet;
import Sikuli.SikuliHelper;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.awt.*;
import java.io.IOException;

public class Main extends Base {

    private WebDriver driver;
    public static String userEmail = null;
    public static String userPassword = null;
    public static String receiverEmail = null;
    public static String subject_mail = null;
    public static String content_mail = null;
    public static String excelFile_relativePath = null;


    public static void excelSheetEditTest() throws FindFailed, IOException, InterruptedException, AWTException {
        Screen screen = new Screen();
        SikuliHelper.minimizeAll(screen);
        SikuliHelper.openFile(screen, excelFile_relativePath);
        ExcelSheet myTest = new ExcelSheet();
        myTest.excelSheetEdit();
    }


    public static void emailSendingTest() throws InterruptedException {
        setUp();
        homePage.enterEmail(userEmail);
        homePage.enterPassword(userPassword);
        NewMailPage newMailPage = homePage.clickSignIn();
        newMailPage.clickNewMessage();
        newMailPage.enterMailReceiver(receiverEmail);
        newMailPage.enterMailSubject(subject_mail);
        newMailPage.enterMailContent(content_mail);
        newMailPage.setAttachment(Helper.AddBasePath(excelFile_relativePath));
        Thread.sleep(5000);
        newMailPage.clickSendEmail();

    }


    public static void main(String[] args) throws FindFailed, IOException, InterruptedException, AWTException {
        PropertiesConfig.getProperties();
        Main.excelSheetEditTest();
        Main.emailSendingTest();


    }
}
