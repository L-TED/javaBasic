package day04.theory.ex04;

import day04.theory.quiz.Student;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex04 {
    static void main(String[] args) {
//        Function<Integer, Integer> plusHundred = x -> x + 100;
//        System.out.println(plusHundred.apply(100));
//        Function<String, String> sayHi = name -> name + " ㅎㅇ";
//        System.out.println(sayHi.apply("김철수"));
//
//        Consumer<String> print = s -> System.out.println(s);
//        print.accept("하이");
        BiConsumer<ArrayList<Student>, ArrayList<Student>> avgAge = (stdA, stdB) -> {
            int sum = 0;
            for (int i = 0; i < stdA.size(); i++) {
                sum = sum + stdA.get(i).getAge();
            }
            for (int i = 0; i < stdB.size(); i++) {
                sum = sum + stdB.get(i).getAge();
            }
            System.out.println(sum/(stdA.size() + stdB.size()));
        };
        ArrayList<Student> classroomA = new ArrayList<>();
        ArrayList<Student> classroomB = new ArrayList<>();
        classroomA.add(new Student("김철수", 24));
        classroomA.add(new Student("이철수", 22));
        classroomA.add(new Student("신철수", 23));
        classroomB.add(new Student("금태양", 24));
        classroomB.add(new Student("이태양", 25));
        classroomB.add(new Student("신태양", 21));
        avgAge.accept(classroomA, classroomB);
    }
}
