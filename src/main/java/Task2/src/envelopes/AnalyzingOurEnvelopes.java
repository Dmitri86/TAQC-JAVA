package Task2.src.envelopes;

class AnalyzingOurEnvelopes{
    public static boolean canFirstPutInSecond(Envelope enFirst, Envelope enSecond){
        return enFirst.getBiggerSide() < enSecond.getBiggerSide() && enFirst.getSmallerSide() < enSecond.getSmallerSide();
    }

    public static boolean canSecondPutInFirst(Envelope enFirst, Envelope enSecond){
        return enFirst.getBiggerSide() > enSecond.getBiggerSide() && enFirst.getSmallerSide() > enSecond.getSmallerSide();
    }
}
