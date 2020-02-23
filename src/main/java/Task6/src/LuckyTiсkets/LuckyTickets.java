package Task6.src.LuckyTiсkets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LuckyTickets {
    private int startTicket;
    private int finishTicket;
    private List<Integer> listLuckySimpleWay;
    private List<Integer> listLuckyDifficultWay;
    private String outcome;

    LuckyTickets(int startTicket, int finishTicket){
        this.startTicket = startTicket;
        this.finishTicket = finishTicket;
        this.listLuckySimpleWay = new ArrayList<>();
        this.listLuckyDifficultWay = new ArrayList<>();
        outcome = Constants.EMPTY_STRING;
    }

    @Override
    public String toString() {
        if(outcome.isEmpty()){
            outcome = getStringResult(calculateLuckyTickets());
        }
        return outcome;
    }

    private String getStringResult (Map<String, Integer> result){
        StringBuilder ourResult = new StringBuilder();
        if(result.get("simple way") > result.get("difficult way")){
            ourResult.append("======== Win \"Simple Way\" method! ========\n");
        }else if(result.get("simple way") < result.get("difficult way")){
            ourResult.append("======== Win \"Difficult way\" method! ========\n");
        }else{
           ourResult.append("======== It's a draw! ========\n");
        }
        ourResult.append("Quantity happy tickets with simple way: ").append(result.get("simple way"));
        ourResult.append("\nQuantity happy tickets with difficult way: ").append(result.get("difficult way"));
        System.out.println(ourResult.toString());
        return ourResult.toString();
    }

    private Map<String, Integer> calculateLuckyTickets(){
        for(int i = startTicket; i <= finishTicket; i++){
            if(isTicketLuckySimpleWay(HandlingData.convertFromIntToArrayInt(i))){
                listLuckySimpleWay.add(i);
            }
            if(isTicketLuckyDifficultWay(HandlingData.convertFromIntToArrayInt(i))){
                listLuckyDifficultWay.add(i);
            }
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("simple way", listLuckySimpleWay.size());
        result.put("difficult way", listLuckyDifficultWay.size());
        return result;
    }

    private boolean isTicketLuckySimpleWay(int[] numArray){
        byte sumFirstThreeDigits = 0;
        byte sumLastThreeDigits = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (i < numArray.length / 2) {
                sumFirstThreeDigits += numArray[i];
            } else {
                sumLastThreeDigits += numArray[i];
            }
        }
        return sumFirstThreeDigits == sumLastThreeDigits;
        }

    private boolean isTicketLuckyDifficultWay(int[] numArray) {
        byte sumOddDigits = 0;
        byte sumEvenDigits = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (i % 2 == 0) {
                sumEvenDigits += numArray[i];
            } else {
                sumOddDigits += numArray[i];
            }
        }
        return sumOddDigits == sumEvenDigits;
    }

}

