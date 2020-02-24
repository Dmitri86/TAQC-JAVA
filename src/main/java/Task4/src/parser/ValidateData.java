package Task4.src.parser;

import java.io.File;

public class ValidateData {
    public static boolean isModeCorrect(String data){
        return data.equals("1") || data.equals("2");
    }

    public static boolean isInputtedDataCorrect(String[] inputData){
            if(isInputtedDataIncorrect(inputData)){
                Display.showMessage(Constants.INPUTTED_DATA_ERROR);
                return false;
            }
            return true;
    }

    private static  boolean isInputtedDataIncorrect(String[] inputData){
        return !(new File(inputData[0]).isFile()) || inputData[1].length() == 0;
    }
}
