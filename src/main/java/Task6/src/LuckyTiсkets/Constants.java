package Task6.src.LuckyTiсkets;

public interface Constants {
    String PROGRAM_INFO = "This program counts happy six-digit tickets.\n" +
            "Simple way\" - sum of first three digits equal sum of last three digits.\n" +
            "Difficult way\" - sum of odd elements equal sum of even elements.\n";
    String ERROR_INPUTTED_DATA = "Inputted ticket number is incorrect";
    String FIRST_TICKET_MESSAGE = "Input started ticket number(Can be six-digit number or less):";
    String SECOND_TICKET_MESSAGE = "Input finished ticket number(Can be six-digit number or less " +
            "and be more than number of the start ticket):";
    String EMPTY_STRING = "";
}
