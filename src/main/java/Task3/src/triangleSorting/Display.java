package Task3.src.triangleSorting;

import java.util.Set;

class Display{
    static void displaySetTriangle(Set<Triangle> triangleSet){
        System.out.println("=================Triangle list:================= ");
        int i = 1;
        for (Triangle temp:triangleSet){
            System.out.printf(i + ". [Triangle " + temp.getName() + "]: %.2f cm\n", temp.getArea());
            i++;
        }
    }
}