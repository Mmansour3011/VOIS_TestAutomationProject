package Config;

import com.vois.autotask.Main;

import java.io.FileInputStream;
import java.io.InputStream;

public class PropertiesConfig {
    static java.util.Properties properties = new java.util.Properties();
    static String projectPath = System.getProperty("user.dir");

    public static void getProperties() {
        try {
            InputStream input = new FileInputStream(projectPath +"/app.properties");

            properties.load(input);
            Main.userEmail = properties.getProperty("userEmail");
            Main.userPassword = properties.getProperty("userPassword");
            Main.receiverEmail = properties.getProperty("receiverEmail");
            Main.subject_mail = properties.getProperty("subject_mail");
            Main.content_mail = properties.getProperty("content_mail");
            Main.excelFile_relativePath = properties.getProperty("excelFile_relativePath");


        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

    }

}
