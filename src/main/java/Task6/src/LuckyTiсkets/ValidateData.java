package Task6.src.LuckyTiсkets;

class ValidateData {

    public static boolean isInputtedDataValid(String[] inputData){
        if(isInvalid(inputData)){
            Display.displayMessage(Constants.ERROR_INPUTTED_DATA);
            return false;
        }
        return true;
    }

    private static boolean isInvalid(String[] inputData){
        try{
            return Integer.parseInt(inputData[0]) > Integer.parseInt(inputData[1])
                    || inputData[0].length() >  6 || inputData[1].length() > 6 ||
                    Integer.parseInt(inputData[0]) > 0;
        }catch(NumberFormatException e){
            return true;
        }
    }
}
