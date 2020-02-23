package Task6.src.LuckyTiсkets;

class HandlingData {

    public static int[] modifiedData(String[] data) {
        int[] modifiedData = new int[2];
        for (int i = 0; i < data.length; i++) {
            if (data[i].length() != 6) {
                for (int j = data[i].length(); j < 6; j++) {
                    data[i] = "0" + data[i];
                }
            }
            modifiedData[i] = Integer.parseInt("1" + data[i]);
        }
        return modifiedData;
    }

    public static int[] convertFromIntToArrayInt(Integer number){
        String[] strArray = number.toString().split(Constants.EMPTY_STRING);
        int[] intArray = new int[number.toString().length() - 1];
        for(int j = 1, i = 0; j < strArray.length; j++, i++) {
            intArray[i] = Integer.parseInt(strArray[j]);
        }
        return intArray;
    }
}
