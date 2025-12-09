package day04.theory.quiz;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        quiz a = stdArr -> {
            int sum = 0;
            for (int i = 0; i < stdArr.size(); i++) {
                sum = sum + stdArr.get(i).getAge();
            }
            return (double) (sum/ stdArr.size());
        };
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("김철수", 25));
        list.add(new Student("곽철수", 25));
        list.add(new Student("금철수", 25));
        list.add(new Student("한철수", 20));
        System.out.println(a.ageAvg(list));
    }
}
