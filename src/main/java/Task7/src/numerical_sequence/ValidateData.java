package Task7.src.numerical_sequence;

class ValidateData{
    public static boolean isDataCorrect(String[] inputData){
        if(!isInputDataValid(inputData)){
            Display.displayMessage(Display.ERROR);
            return false;
        }
        return true;
    }

    private static boolean isInputDataValid(String[] inputData){
        try{
            return ((Integer.parseInt(inputData[0]) > 0 && Integer.parseInt(inputData[0]) < Integer.MAX_VALUE)
                    && Double.parseDouble(inputData[1]) < Integer.MAX_VALUE);
        }catch (NumberFormatException e){
            return false;
        }
    }
}
