package Task4.src.parser;

import java.io.File;
import java.util.List;

public class ValidateData {
    public static boolean isModeCorrect(String data){
        return data.equals("1") || data.equals("2");
    }

    public static boolean isInputtedDataCorrect(List<String> inputData){
            return (new File(inputData.get(0)).isFile()) && (inputData.get(1).length() > 0);
    }
}
