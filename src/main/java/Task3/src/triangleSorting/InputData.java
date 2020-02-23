package Task3.src.triangleSorting;

import java.util.Scanner;

class InputData {
    private static Scanner sc = new Scanner(System.in);

    public static String[] getDataForTriangle() {
        System.out.println("Please, enter data for triangle: <name>, <side length>, " +
                "<side length>, <side length>");
        String data = sc.nextLine().toLowerCase();
        data = data.replaceAll(" ", "");
        return data.split(",");
    }

    public static String getContinue(){
        System.out.println("If you want to add another triangle enter 'y' or 'yes':");
            return sc.nextLine().toLowerCase().trim();
    }

    public static void closeScanner(){
        sc.close();
    }
}