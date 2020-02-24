package Task6.src.LuckyTiсkets;

/*
Есть 2 способа подсчёта счастливых билетов:
1. Простой — если на билете напечатано шестизначное число, и сумма первых трёх
цифр равна сумме последних трёх, то этот билет считается счастливым.
2. Сложный — если сумма чётных цифр билета равна сумме нечётных цифр билета, то
билет считается счастливым.
Определить программно какой вариант подсчёта счастливых билетов даст их большее
количество на заданном интервале.
Входные параметры: min и max номер билета
Выход: информация о победившем методе и количестве счастливых билетов для
каждого способа подсчёта.
 */

public class CalculateLuckyTickets {

    public static void main(String[] args){
        Display.displayMessage(Constants.PROGRAM_INFO);
        String[] data;
        while(true){
            data = InputData.getTicketNumber();
            if(ValidateData.isInputtedDataValid(data)){
                break;
            }
            Display.displayMessage(Constants.ERROR_INPUTTED_DATA);
        }
        InputData.closeScanner();
        int[] modifiedData = HandlingData.modifiedData(data);
        LuckyTickets luckyTickets = new LuckyTickets(modifiedData[0], modifiedData[1]);
        Display.displayLuckyTickets(luckyTickets.calculateLuckyTickets());
    }
}