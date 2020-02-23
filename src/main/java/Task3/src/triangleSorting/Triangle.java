package Task3.src.triangleSorting;


class Triangle implements Comparable<Triangle>{
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;
    private String name;
    private double random;

    Triangle(String[] data ){
        this.name = data[0].isEmpty()? "without name": data[0] ;
        this.sideA = Double.parseDouble(data[1]);
        this.sideB = Double.parseDouble(data[2]);
        this.sideC = Double.parseDouble(data[3]);
        this.random = Math.random()*10000;
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        this.area = Math.sqrt(p * (p-this.sideA) * (p-this.sideB) * (p - this.sideC));
    }

    public double getArea() {
        return this.area;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Triangle tr) {
        int compare = (int)(tr).area - (int)this.area;
        if(compare == 0){
            return (int)this.random - (int)(tr).random;
        }else{
            return compare;
        }
    }
}
