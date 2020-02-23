package Task1;

class  Display {
    public static final String INFO = "If you want to use this program, You must start this program with parameters" +
            " of \nheight and width.";
    public static final String ERROR_MESSAGE = "Invalid parameters";

    public static void showMessage(String message){
        System.out.println(message);
    }

    public  static void showChessBoard(ChessBoard chessBoard){
        System.out.print(chessBoard);
    }
}
