package Task2.src.envelopes;

class Display{
    public static void showProgramInfo(){
        System.out.println("This program compares two envelopes.");
        System.out.println("The result will show can you put the first envelope in the second or can  the second " +
                "envelope put in the first.");
    }

    public static void firstCanPutInSecond(){
        System.out.println("You can put the first envelope in the second one.");
    }

    public static void secondCanPutInFirst(){
        System.out.println("You can put the second envelope in the first one.");
    }

    public static void canNotPutIn(){
        System.out.println("You can't put neither the first envelope in the second nor the second envelope " +
                "in the first one.");
    }

    public static void showContinueQuestion(){
        System.out.println("Do you want to continue? Input 'y' or 'yes': ");
    }
}
