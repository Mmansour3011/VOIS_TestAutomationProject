package Sikuli;

import MainHelper.Helper;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.*;
import java.io.IOException;

public class ExcelSheet {
    private Pattern excelFile = new Pattern(Helper.AddBasePath("img/pic_excel.png"));

    private Pattern enableEditing = new Pattern(Helper.AddBasePath("img/pic_enableEditing.png"));

    private Pattern joinDate = new Pattern(Helper.AddBasePath("img/pic_joinDate.png"));
    private Pattern sortAndFilter = new Pattern(Helper.AddBasePath("img/pic_sortAndFilter.png"));
    private Pattern sortAtoZ = new Pattern(Helper.AddBasePath("img/pic_sortAtoZ.png"));
    private Pattern dataTab = new Pattern(Helper.AddBasePath("img/pic_dataTab.png"));
    private Pattern removeDuplicates = new Pattern(Helper.AddBasePath("img/pic_removeDuplicates.png"));
    private Pattern unselectAll = new Pattern(Helper.AddBasePath("img/pic_unselectAll.png"));
    private Pattern nameSelect = new Pattern(Helper.AddBasePath("img/pic_nameSelect.png"));
    private Pattern ok1 = new Pattern(Helper.AddBasePath("img/pic_ok1.png"));
    private Pattern ok2 = new Pattern(Helper.AddBasePath("img/pic_ok2.png"));

    private Pattern save = new Pattern(Helper.AddBasePath("img/pic_save.png"));
    private Pattern close = new Pattern(Helper.AddBasePath("img/pic_close.png"));


    public void excelSheetEdit() throws FindFailed, IOException, InterruptedException, AWTException {
        Screen screen = new Screen();
        Robot robot = new Robot();
        // sikuliHelper.clickOnPattern(screen, enableEditing,0.4,5);
        robot.delay(5000);
        SikuliHelper.clickOnPattern(screen, joinDate, 0.7, 5);
        robot.delay(500);
        SikuliHelper.clickOnPattern(screen, sortAndFilter, 0.5, 5);
        robot.delay(1000);
        SikuliHelper.clickOnPattern(screen, sortAtoZ, 0.4, 5);
        SikuliHelper.clickOnPattern(screen, dataTab, 0.5, 5);
        SikuliHelper.clickOnPattern(screen, removeDuplicates, 0.5, 5);
        SikuliHelper.clickOnPattern(screen, unselectAll, 0.5, 5);
        SikuliHelper.doubleClickOnPattern(screen, nameSelect, 0.5, 5);
        SikuliHelper.clickOnPattern(screen, ok1, 0.5, 5);
        robot.delay(500);
        SikuliHelper.clickOnPattern(screen, ok2, 0.5, 5);
        SikuliHelper.clickOnPattern(screen, save, 0.5, 5);
        SikuliHelper.clickOnPattern(screen, close, 0.5, 5);


    }


}
