package day03.theory;

public class UnitStudent extends Student {
    private Laptop laptop;
    private Major major;

    public UnitStudent(String name, Integer age, String gender, Major major, Laptop laptop) {
        super(name, age, gender);
        this.major = major;
        this.laptop = laptop;
    }

    void partTime() {
        System.out.println("아르바이트");
    }
}
