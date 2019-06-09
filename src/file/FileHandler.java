package file;

import java.io.*;

public class FileHandler {

    public static byte[] getFileBytes(String path) {
        BufferedInputStream stream;
        byte[] fBytes;
        try {
            File file = new File(path);
            stream = new BufferedInputStream(new FileInputStream(file));
            fBytes = new byte[stream.available()];
            stream.read(fBytes, 0, stream.available());
            stream.close();
        } catch (Exception e) {
            return null;
        }
        return fBytes;
    }

    public static String fileToString(String path) {
        return new String(getFileBytes(path));
    }

}
