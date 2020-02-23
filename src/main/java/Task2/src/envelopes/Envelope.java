package Task2.src.envelopes;

class Envelope {
    private double biggerSide;
    private double smallerSide;

    public Envelope(double sideOne, double sideTwo) {
        if(sideOne > sideTwo){
            this.biggerSide = sideOne;
            this.smallerSide = sideTwo;
        }else{
            this.biggerSide = sideTwo;
            this.smallerSide = sideOne;
        }

    }

    public double getBiggerSide() {
        return this.biggerSide;
    }

    public double getSmallerSide() {
        return this.smallerSide;
    }
}
