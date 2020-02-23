package Task7.src.numerical_sequence;
/*
Вывести через запятую ряд длиной n, состоящий из натуральных чисел, квадрат которых не
меньше заданного m.
Входные параметры: длина и значение минимального квадрата
Выход: строка с рядом чисел
 */

public class NumericalSequence {
    private static String[] inputData = new String[2];

    public static void main(String[] args){
        Display.displayMessage(Display.START_MESSAGE);
        do{
            inputData[0] = InputData.getData(InputData.INPUT_LENGTH_MESSAGE);
            inputData[1] = InputData.getData(InputData.INPUT_MIN_VALUE_MESSAGE);
        }while(!ValidateData.isDataCorrect(inputData));
        InputData.closeScanner();
        NumSequence sequence = new NumSequence(Integer.parseInt(inputData[0]), Double.parseDouble(inputData[1]));
        Display.displaySequence(sequence);
    }
}


















