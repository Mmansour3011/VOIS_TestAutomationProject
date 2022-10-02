package MainHelper;

public class Helper {
    public static String AddBasePath(String fileName) {
        final String dir = System.getProperty("user.dir");
        return dir + "/" + fileName;
    }
}
