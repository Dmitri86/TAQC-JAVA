package Task2.src.envelopes;

import java.util.Scanner;

class InputData{
    private static Scanner sc = new Scanner(System.in);

    public static String[] getData(){
        String[] data = new String[4];
        System.out.println("Enter value of one side for first envelope(Can be integer or number with floating point " +
                "and must be above 0):");
        data[0] = sc.nextLine();
        System.out.println("Enter value of another side for first envelope(Can be integer or number with floating " +
                "point and must be above 0):");
        data[1] = sc.nextLine();
        System.out.println("Enter value of one side for second envelope(Can be integer or number with floating point " +
                "and must be above 0):");
        data[2] = sc.nextLine();
        System.out.println("Enter value of another side for second envelope(Can be integer or number with floating " +
                "point and must be above 0):");
        data[3] = sc.nextLine();
        return data;
    }

    public static String getContinue(){
        return sc.nextLine().trim().toLowerCase();
    }

    public static void closeScanner(){
        sc.close();
    }
}
