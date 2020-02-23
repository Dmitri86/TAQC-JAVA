package Task8.src.fibonacci_number;

import java.util.ArrayList;
import java.util.List;

class FibonacciSequence{
    private int length;
    private double lowLimit;
    private double highLimit;
    private List<Integer> fiboLineList;
    private String fiboLineString;

    private static final String EMPTY_STRING = "";
    private static final String SPACE = " ";

    FibonacciSequence(int length){
        this.length = length;
        this.fiboLineList = new ArrayList<>();
        this.fiboLineString = EMPTY_STRING;
    }

    FibonacciSequence(double lowLimit, double highLimit){
        this.lowLimit = lowLimit;
        this.highLimit = highLimit;
        this.fiboLineList = new ArrayList<>();
        this.fiboLineString = EMPTY_STRING;
    }

    @Override
    public String toString() {
        if(this.fiboLineString.isEmpty()){
            if(this.length != 0){
                this.fiboLineString = getFiboSequenceFixedLength();
            }else{
                this.fiboLineString = getFiboSequenceFromInterval();
            }
        }
        return this.fiboLineString;
    }

    private int addNextFiboElement(){
        if(fiboLineList.size() == 0){
            this.fiboLineList.add(0);
        } else if(this.fiboLineList.size() == 1){
            this.fiboLineList.add(1);
        }
        else{
            this.fiboLineList.add(fiboLineList.get(fiboLineList.size() - 1) +
                    this.fiboLineList.get(fiboLineList.size() - 2));
        }
        return fiboLineList.get(fiboLineList.size() - 1);
    }

    private String getFiboSequenceFixedLength(){
        StringBuilder fiboSequence = new StringBuilder();
        while(fiboLineList.size() < length){
            fiboSequence.append(addNextFiboElement()).append(SPACE);
        }
        return fiboSequence.toString();
    }

    private String getFiboSequenceFromInterval(){
        StringBuilder fiboSequence = new StringBuilder();
        while(true){
            int lastElement = addNextFiboElement();
            if(lastElement > highLimit){
                break;
            }
            if(lastElement > lowLimit){
                fiboSequence.append(lastElement).append(SPACE);
            }
        }
        return fiboSequence.toString();
    }
}
