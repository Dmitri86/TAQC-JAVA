package Task3.src.triangleSorting;

class ValidateData {

    public static boolean checkData(String[] data){
        double sides[] = new double[3];
        if(data.length != 4){
            System.out.println("Inputted data is incorrect.");
            return false;
        }
        for(int i = 1, j = 0; i < data.length; i++, j++){
            try{
                sides[j] = Double.parseDouble(data[i]);
            }catch(NumberFormatException e){
                System.out.println("Inputted data is incorrect.");
                return false;
            }
        }
        if(!checkSide(sides)){
            System.out.println("Inputted data is incorrect. One side triangle can't be more than sum of other sides.");
            return false;
        }
        return true;
    }

    private static boolean checkSide(double[] sides){
        for(int i = 0; i < sides.length; i ++){
            if(sides[i] < 0){
                return false;
            }
        }
        if(sides[0] > (sides[1] + sides[2]) || sides[1] > (sides[0] + sides[2]) || sides[2] > (sides[0] + sides[1])){
            return false;
        }
        return true;
    }
}