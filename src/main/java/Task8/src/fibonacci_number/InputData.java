package Task8.src.fibonacci_number;

import java.util.Scanner;

class InputData{
    public static final String MODE_MESSAGE = "Choose mode(enter only '1' or '2'):";
    public static final String LENGTH_MESSAGE = "Enter length of Fibonacci sequence(Must be integer and must be " +
            "more 0 and less than 47):";
    public static final String LOW_LIMIT_MESSAGE = "Enter a low interval limit(Can be integer or number with floating point):";
    public static final String HIGH_LIMIT_MESSAGE = "Enter a high interval limit(Can be integer or number with floating point " +
            "and must be \nabove then low interval limit and less than " + Integer.MAX_VALUE +  "):";

    private static Scanner sc = new Scanner(System.in);

    public static String getData(String message){
        Display.showMessage(message);
        return sc.nextLine();
    }

    public static void closeScanner(){sc.close();}

}
