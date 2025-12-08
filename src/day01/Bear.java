package day01;

public class Bear extends Animal {
    private final String location;
    public Bear(String name, int age, String location) {
        super(name, age);
        this.location = location;
    }
    
    public void drinkCoke() {
        System.out.println("콜라 마심");
    }

}
