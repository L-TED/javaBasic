package day04.theory.ex01;

import java.util.Scanner;

public class Ex01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("수학에러");
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
