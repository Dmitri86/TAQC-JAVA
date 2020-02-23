package Task2.src.envelopes;

class ValidateData{
    public static boolean checkInputtedData(String[] data){
        for(int i = 0; i < data.length; i++){
            double side = 0;
            try{
                side = Double.parseDouble(data[i]);
            }catch(NumberFormatException e){
                System.out.println("Inputted parameters are wrong");
                return false;
            }
            if(side < 0){
                System.out.println("Side length can't be less than 0");
                return false;
            }
        }
        return true;
    }
}
