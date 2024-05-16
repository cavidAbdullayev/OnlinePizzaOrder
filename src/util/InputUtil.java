package util;

import java.util.Scanner;

public class InputUtil {
    public static Integer inputInteger(String title) {
        System.out.println(title);
        return new Scanner(System.in).nextInt();
    }

    public static Byte inputByte(String title) {
        System.out.println(title);
        return new Scanner(System.in).nextByte();
    }

    public static String inputString(String title) {
        System.out.println(title);
        return new Scanner(System.in).next();
    }

    public static Double inputDouble(String title) {
        System.out.println(title);
        return new Scanner(System.in).nextDouble();
    }
}