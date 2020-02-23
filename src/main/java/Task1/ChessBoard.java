package Task1;

class ChessBoard{
    private int height;
    private int width;
    private char ch;

    private final static String BLANK = " ";
    private final static String NEW_LINE = "\n";

    ChessBoard(int height, int width, char ch){
        this.height = height;
        this.width = width;
        this.ch = ch;
    }

    public String toString(){
        StringBuilder chessBoard = new StringBuilder();
        for(int i = 0; i < this.height; i++) {
            for(int j = 0; j < this.width; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard.append(ch);
                } else {
                    chessBoard.append(BLANK);
                }
            }
            chessBoard.append(NEW_LINE);
        }
        return chessBoard.toString();
    }
}
