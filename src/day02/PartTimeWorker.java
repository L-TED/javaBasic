package day02;

import java.util.Scanner;

public class PartTimeWorker {
    private String name;
    private int age;
    private int wage;
    private Schedule schedule;

    public PartTimeWorker(String name, int age, int wage) {
        this.name = name;
        this.age = age;
        this.wage = wage > 10030 ? wage : 10030;
        this.schedule = new Schedule("월, 수, 금", 8, 14);
    }

    void getWorkerInfo() {
        System.out.println("이름: "+ this.name);
        System.out.println("나이: "+ this.age);
        System.out.println("시급: "+ this.wage);
        this.schedule.timetable();
    }

    void changeWage () {
    Scanner sc = new Scanner(System.in);

    System.out.print("조정 시급: ");
    int changedWage = sc.nextInt();
        if (changedWage < 10030) {
            System.out.println("최저 시급보다 액수가 적습니다.");
            this.changeWage();
        } else {
            this.wage = changedWage;
            getWorkerInfo();
        }
    }
}
