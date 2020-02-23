package Task1;

class ValidateData{

    public static boolean isParametersValid(String[] inputData){
        try{
            return (Integer.parseInt(inputData[0]) > 0 && Integer.parseInt(inputData[1]) > 0);
        }catch(NumberFormatException e){
            Display.showMessage(Display.ERROR_MESSAGE);
            return false;
        }
    }
}
