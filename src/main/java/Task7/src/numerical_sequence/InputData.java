package Task7.src.numerical_sequence;
import java.util.Scanner;

class InputData {
    public static final String INPUT_LENGTH_MESSAGE = "Input length(Length must be integer and must be above 0):";
    public static final String INPUT_MIN_VALUE_MESSAGE = "Input minimal value(Can be integer or number with floating point):";
    private static Scanner sc = new Scanner(System.in);

    public static String getData(String message){
        Display.displayMessage(message);
        return sc.nextLine();
    }

    public static void closeScanner(){
        sc.close();
    }
}
