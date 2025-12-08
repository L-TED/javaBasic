package day03.theory;

/*
* 종속 관계
* is - a 관계 => extends
* has - a 관계 => 변수
* */
public class Student {
    private String name;
    private Integer age;
    private String gender;
    public Student(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void study() {
        System.out.println("공부");
    }

    void getInfo() {
        System.out.println();
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("성별: " + this.gender);
    }
}
