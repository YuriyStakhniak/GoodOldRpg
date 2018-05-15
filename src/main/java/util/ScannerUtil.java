package util;

import java.util.Scanner;

public final class ScannerUtil {

    private static Scanner scanner;

    private ScannerUtil() {
    }

    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static String getString() {

        return getScanner().nextLine();
    }

    public static int getInt() {
        while (true) {
            String str = getString();
            if (str.matches("\\d+")) {
                return Integer.parseInt(str);
            } else {
                System.out.println("You not input number. Try again.");
            }
        }
    }
}
