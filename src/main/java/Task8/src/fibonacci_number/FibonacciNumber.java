package Task8.src.fibonacci_number;

/*
Вывести все числа Фибоначчи, которые удовлетворяют переданному в функцию ограничению:
находятся в указанном диапазоне, либо имеют указанную длину.
 */
public class FibonacciNumber {

	public static void main(String[] args) {
		Display.showMessage(Display.INFO);
		String mode;
		FibonacciSequence fibo;
		do{
			mode = InputData.getData(InputData.MODE_MESSAGE);
		}while(!ValidateData.isCorrectMode(mode));
		if(mode.equals("1")){
			fibo = getFiboSequenceFixedLength();

		}else{
			fibo = getFiboSequenceFromInterval();
		}
		InputData.closeScanner();
		Display.showFibonacciSequence(fibo);
	}

	private static FibonacciSequence getFiboSequenceFixedLength(){
		String length;
		do {
			length = InputData.getData(InputData.LENGTH_MESSAGE);
		}while(!ValidateData.isCorrect(length));
		return new FibonacciSequence(Integer.parseInt(length));
	}

	private static FibonacciSequence getFiboSequenceFromInterval(){
		String[] interval = new String[2];
		do {
			interval[0] = InputData.getData(InputData.LOW_LIMIT_MESSAGE);
			interval[1] = InputData.getData(InputData.HIGH_LIMIT_MESSAGE);
		}while(!ValidateData.isCorrect(interval));
		return new FibonacciSequence(Double.parseDouble(interval[0]), Double.parseDouble(interval[1]));
	}
}



