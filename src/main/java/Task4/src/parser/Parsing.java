package Task4.src.parser;
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
        if(mode.equals("1")){
            Display.showMessage(firstMode());
        }else{
            Display.showMessage(secondMode());
        }
        InputData.closeScanner();
    }

    private static String firstMode(){
        String[] dataInput = new String[2];
        do{
            dataInput[0] = InputData.getData(Constants.FILE_PATH_MESSAGE);
            dataInput[1] = InputData.getData(Constants.YOUR_STRING_MESSAGE);
        }while(!ValidateData.isInputtedDataCorrect(dataInput));
        FileParse fileParse = new FileParse(dataInput[0], dataInput[1]);
        return fileParse.getQuantityMatches().toString();
    }

    private static String secondMode(){
        String[] dataInput = new String[3];
        do{
            dataInput[0] = InputData.getData(Constants.FILE_PATH_MESSAGE);
            dataInput[1] = InputData.getData(Constants.YOUR_STRING_MESSAGE);
            dataInput[2] = InputData.getData(Constants.YOUR_REPLACE_STRING_MESSAGE);
        }while(!ValidateData.isInputtedDataCorrect(dataInput));
        FileParse fileParse = new FileParse(dataInput[0], dataInput[1], dataInput[2]);
        return fileParse.replaceStrings();
    }
}
