package Task7.src.numerical_sequence;

class Display{
    public static final String START_MESSAGE = "To use this program you have to input length of sequence and minimal value. " +
            "The program will show numerical sequence.\n The squaring each number of this sequence is more then " +
            "inputted minimal value.";
    public static final String ERROR = "Inputted parameters incorrect";

    public static void displayMessage(String message){
        System.out.println(message);
    }

    public static void displaySequence(NumSequence numSequence){
        System.out.print(numSequence);
    }
}
