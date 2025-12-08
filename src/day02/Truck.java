package day02;

public class Truck extends Car {

    private int loadWeight;

    public Truck(String name, int fuel, int year, int loadWeight) {
        super(name, fuel, year);
        this.loadWeight = loadWeight;

        System.out.println();
        status();
    }

    public void load (int a) {
        System.out.println();
        System.out.println("현재 차량 무게: " + (this.loadWeight + a) + " kg");
    }

}
