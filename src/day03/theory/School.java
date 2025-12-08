package day03.theory;

// 컬렉션 프레임워크

import java.util.ArrayList;

public class School {

    public static void main() {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("김철수", 21, "남성"));
        studentList.add(new Student("이영희", 23, "여성"));

        for(int i = 0; i < studentList.toArray().length; i++) {
            studentList.get(i).getInfo();
        }
    }
}
