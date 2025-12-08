package day01;

public class Animal {
    protected  String name;
    protected  int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void breathe () {
        System.out.println("호흡");
    }
}
