package Task8.src.fibonacci_number;

class Display{
    public static final String INFO = "This program works in two modes:\n" +
            "1.If you want to get Fibonacci numbers with fixed length, You have to enter \n one integer variable which " +
            "will be length of fibonacci line.\n" +
            "2.If you want to get Fibonacci numbers from interval, You have to enter two integer variables,\n" +
            "which are borders from this interval.\n";

    public static void showMessage(String message){
        System.out.println(message);
    }

    public static void showFibonacciSequence(FibonacciSequence fibo) {
        System.out.println(fibo);
    }
}
