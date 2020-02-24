package Task6.src.LuckyTiсkets;

import java.util.Map;

class Display{

    public static void displayMessage(String message){
        System.out.println(message);
    }

    public static void displayLuckyTickets(Map<String, Integer> result){
        if(result.get("simple way") > result.get("difficult way")){
            System.out.println("======== Win \"Simple Way\" method! ========");
        }else if(result.get("simple way") < result.get("difficult way")){
            System.out.println("======== Win \"Difficult way\" method! ========");
        }else{
            System.out.println("======== It's a draw! ========");
        }
        System.out.println("Quantity happy tickets with simple way: " + result.get("simple way"));
        System.out.println("Quantity happy tickets with difficult way: " +result.get("difficult way"));
    }

}
