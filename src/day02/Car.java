package day02;

public class Car {
    protected String name;
    protected int fuel;
    protected int speed;
    protected int year;
    protected boolean isEngineON;

    public Car(String name, int fuel, int year) {
        this.name = name;
        this.fuel = fuel;
        this.speed = 0;
        this.year = year;
        this.isEngineON = false;
    }

    public void status () {
        System.out.println();
        System.out.println("차량 이름: " + this.name);
        System.out.println("차량 기름 잔량: " + this.fuel);
        System.out.println("차량 현재 속도: " + this.speed);
        System.out.println("차량 연식: " + this.year);
        System.out.println(isEngineON? "시동 켜짐": "시동 꺼짐");
    }

    public void engineTrigger () {
        System.out.println();
        this.isEngineON = !this.isEngineON;
        System.out.println(this.isEngineON ? "시동 켜짐" : "시동 꺼짐");
        status();
    }

    public void accelerate () {
        if (this.isEngineON) {
            System.out.println();
            System.out.println("차량 출발");
            this.speed = this.speed + 10;
            this.fuel = this.fuel - 1;
        } else {
            System.out.println("시동을 키십시오.");
        }
        status();
    }
    public void getSpeedDown () {
        if (this.isEngineON) {
            this.speed = 0;

        } else {
            System.out.println();
            System.out.println("시동이 꺼져 있습니다.");
        }
        status();
    }
}
