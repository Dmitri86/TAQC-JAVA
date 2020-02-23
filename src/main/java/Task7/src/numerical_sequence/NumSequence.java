package Task7.src.numerical_sequence;

class NumSequence {
    private int length;
    private double minValue;
    private String sequence;

    NumSequence(int length, double minValue) {
        this.length = length;
        this.minValue = minValue;
    }

    @Override
    public String toString() {
        if(this.sequence == null){
            StringBuilder sequence = new StringBuilder();
            for (int i = 1, count = 0; count < this.length; i++) {
                if (i * i > this.minValue) {
                    sequence.append(i + " ");
                    count++;
                }
            }
            this.sequence = sequence.toString();
        }
        return this.sequence;
    }
}
