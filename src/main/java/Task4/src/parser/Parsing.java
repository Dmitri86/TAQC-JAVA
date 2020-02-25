package Task4.src.parser;

import java.util.ArrayList;
import java.util.List;

/*
Нужно написать программу, которая будет иметь два режима:
1. Считать количество вхождений строки в текстовом файле.
2. Делать замену строки на другую в указанном файле
 */
public class Parsing {

    public static void main(String[] args){
        Display.showMessage(Constants.PROGRAM_INFO);
        String mode;
        do{
            mode = InputData.getData(Constants.MODE_MESSAGE);
        }while(!ValidateData.isModeCorrect(mode));
        List<String> dataInput;
        while(true){
            dataInput = new ArrayList<>();
            dataInput.add(InputData.getData(Constants.FILE_PATH_MESSAGE));
            dataInput.add(InputData.getData(Constants.YOUR_STRING_MESSAGE));
            if(mode.equals("2")){
                dataInput.add(InputData.getData(Constants.YOUR_REPLACE_STRING_MESSAGE));
            }
            if(ValidateData.isInputtedDataCorrect(dataInput)){
                break;
            }
            Display.showMessage(Constants.INPUTTED_DATA_ERROR);
        }
        if(mode.equals("1")){
            FileParse fileParse = new FileParse(dataInput.get(0), dataInput.get(1));
            Display.showMessage(fileParse.startProgram());
        }else {
            FileParse fileParse = new FileParse(dataInput.get(0), dataInput.get(1), dataInput.get(2));
            Display.showMessage(fileParse.startProgram());
        }
    }
}
