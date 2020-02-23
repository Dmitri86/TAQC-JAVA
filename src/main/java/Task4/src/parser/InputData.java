package Task4.src.parser;

import java.util.Scanner;

public class InputData {

    private static Scanner sc = new Scanner(System.in);

    public static String getData(String message){
        Display.showMessage(message);
        return sc.nextLine();
    }
}
