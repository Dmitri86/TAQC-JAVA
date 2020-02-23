package Task8.src.fibonacci_number;

class ValidateData{
    private static final String ERROR_LENGTH = "Inputted length is incorrect";
    private static final String ERROR_INTERVAL = "Inputted interval is incorrect";

    public static boolean isCorrectMode(String stringMode){
        return stringMode.equals("1") || stringMode.equals("2");
    }

    public static boolean isCorrect(String length){
        if(isInvalid(length)){
            Display.showMessage(ERROR_LENGTH);
            return false;
        }
        return true;
    }

    private static boolean isInvalid(String length){
        try{
            return Integer.parseInt(length) < 0 || Integer.parseInt(length) > 47;
        }catch (NumberFormatException e){
            return true;
        }
    }

    public static boolean isCorrect(String[] interval){
        if(isInvalid(interval)){
            Display.showMessage(ERROR_INTERVAL);
            return false;
        }
        return true;
    }

    private static boolean isInvalid(String[] interval){
        try{
            return (Double.parseDouble(interval[0]) > Double.parseDouble(interval[1])
                    || Double.parseDouble(interval[0]) > Integer.MAX_VALUE
                    ||Double.parseDouble(interval[1]) > Integer.MAX_VALUE);
        }catch(NumberFormatException e){
            return true;
        }

    }
}
