package Task6.src.LuckyTiсkets;

class Display{
    public static final String PROGRAM_INFO = "This program counts happy six-digit tickets.\n" +
            "Simple way\" - sum of first three digits equal sum of last three digits.\n" +
            "Difficult way\" - sum of odd elements equal sum of even elements.\n";


    public static void displayMessage(String message){
        System.out.println(message);
    }

    public static void displayLuckyTickets(LuckyTickets luckyTickets){
        System.out.println(luckyTickets);
    }
}
