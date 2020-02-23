package Task2.src.envelopes;


public class AnalyzeEnvelopes {
    private static String[] data;
    private static String answer;

    public static void main(String[] args) {
        Display.showProgramInfo();
        do {
            do {
                data = InputData.getData();
            } while (!ValidateData.checkInputtedData(data));
            Envelope envelopeFirst = new Envelope(Double.parseDouble(data[0]), Double.parseDouble(data[1]));
            Envelope envelopeSecond = new Envelope(Double.parseDouble(data[2]), Double.parseDouble(data[3]));
            if (AnalyzingOurEnvelopes.canFirstPutInSecond(envelopeFirst, envelopeSecond)) {
                Display.firstCanPutInSecond();
            } else if (AnalyzingOurEnvelopes.canSecondPutInFirst(envelopeFirst, envelopeSecond)) {
                Display.secondCanPutInFirst();
            } else {
                Display.canNotPutIn();
            }
            Display.showContinueQuestion();
            answer = InputData.getContinue();
        } while (answer.equals("y") || answer.equals("yes"));
        InputData.closeScanner();
    }
}
