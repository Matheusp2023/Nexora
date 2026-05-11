package org.nexora.engine.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

    private Utils() {
        // Utility class
    }

    public static String readFile(String filePath) {
        String str;
        try {
            str = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException ex) {
            throw new RuntimeException("Error reading file [" + filePath + "]", ex);
        }
        return str;
    }
}
