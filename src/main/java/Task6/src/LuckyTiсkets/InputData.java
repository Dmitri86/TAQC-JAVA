package Task6.src.LuckyTiсkets;

import java.util.Scanner;

class InputData {

    private static Scanner sc = new Scanner(System.in);

    public static String[] getTicketNumber() {
        String[] ticketNumbers = new String[2];
        Display.displayMessage(Constants.FIRST_TICKET_MESSAGE);
        ticketNumbers[0] = sc.nextLine();
        Display.displayMessage(Constants.SECOND_TICKET_MESSAGE);
        ticketNumbers[1] = sc.nextLine();
        return ticketNumbers;
    }

    public static void closeScanner() {
        sc.close();
    }
}