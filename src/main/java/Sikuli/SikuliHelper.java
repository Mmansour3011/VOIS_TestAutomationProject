package Sikuli;

import MainHelper.Helper;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.event.KeyEvent;

public class SikuliHelper {
    public static void minimizeAll(Screen screen) {
        screen.keyDown(Key.WIN);
        screen.keyDown(KeyEvent.VK_D);
        screen.keyUp(Key.WIN);
        screen.keyUp(KeyEvent.VK_D);
    }

    public static void openFile(Screen screen, String path) {
        screen.keyDown(Key.WIN);
        screen.keyDown(KeyEvent.VK_R);
        screen.keyUp(Key.WIN);
        screen.keyUp(KeyEvent.VK_R);
        screen.type(Helper.AddBasePath(path));
        screen.keyDown(Key.ENTER);
        screen.keyUp(Key.ENTER);
    }

    public static void clickOnPattern(Screen screen, Pattern pattern, double similar, int timeOut) throws FindFailed {
        screen.wait(pattern.similar(similar), timeOut).click();

    }

    public static void doubleClickOnPattern(Screen screen, Pattern pattern, double similar, int timeOut) throws FindFailed {
        screen.wait(pattern.similar(similar), timeOut).doubleClick();

    }
}
