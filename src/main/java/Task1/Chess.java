package Task1;

/*
Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
* * * * * *
 * * * * * *
* * * * * *
 * * * * * *
Программа запускается через вызов главного класса с параметрами.
*/

public class Chess {
	
	public static void main(String[] args) {
		if(args.length == 0) {
			Display.showMessage(Display.INFO);
		}
		else if (args.length != 2 || !ValidateData.isParametersValid(args)) {
			Display.showMessage(Display.ERROR_MESSAGE);
		}else {
			Chess.ourProgramRun(args);
		}	
	}

	public static void ourProgramRun(String[] args){
		ChessBoard chessBoard = new ChessBoard(Integer.parseInt(args[0]), Integer.parseInt(args[1]), '*');
		Display.showChessBoard(chessBoard);
	}
}

