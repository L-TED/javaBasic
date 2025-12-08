package day02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    Car car = new Car("소나타", 100, 2000);
//    car.engineTrigger();
//    car.accelerate();
//    car.getSpeedDown();
//
//    Truck truck = new Truck("픽업", 150, 2020, 1800);
//    truck.engineTrigger();
//    truck.accelerate();
//    truck.load(300);

//    PartTimeWorker lee = new PartTimeWorker("이영희", 26, 10030);
//    lee.changeWage();

//        int numArr[] = {1, 2, 3, 4, 5}; // 직접 생성한 밸류를 가진 배열 생성
//        System.out.println(numArr[0]);
//        System.out.println(numArr[4]);
//
//        int numArrA[] = new int[5]; // 정수 밸류가 5개 있는 배열 생성
//        String strArrA[] = new String[3]; // 문자 밸류가 3개 있는 배열 생성
//
//        String a = strArrA[0] = "아메리카노";
//        String b = strArrA[1] = "모카";
//        String c = strArrA[2] = "라떼";
//
//        System.out.println(strArrA[0]);
//        System.out.println(strArrA[1]);
//        System.out.println(strArrA[2]);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(a + b + c);
//
//        Car carArr[] = new Car[4];
//
//        carArr[0] = new Car("소나타", 100, 2023);
//        carArr[1] = new Car("벤츠", 140, 2024);
//        carArr[2] = new Car("아우디", 160, 2025);
//        carArr[3] = new Truck("덤프 트럭", 120, 2020, 2000);
//
//        carArr[0].status();
//        carArr[1].status();
//        carArr[2].status();
//        carArr[3].status();
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("알파벳 입력(A, B, C): ");
//        String text = sc.nextLine();
//        switch (text.trim()) {
//            case "A":
//                System.out.println("문자 'A' 출력");
//                break;
//            case "B":
//                System.out.println("문자 'B' 출력");
//                break;
//            case "C":
//                System.out.println("문자 'C' 출력");
//                break;
//            default:
//                System.out.println("A, B, C 중 선택");
//                break;
//        }
//          // 3배수 3, 5배수 5, ㅗ
//
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            } else if (i % 5 == 0) {
//                System.out.println(i);
//            } else {
//                System.out.println("ㅗ");
//            }
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("단 입력: ");
//        int u = sc.nextInt();
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println(u + " X " + i + " = " + (u * i));
//        }
//
//            // 369 게임
//        for (int i = 1; i <= 100; i++) {
//            String a = String.valueOf(i); // 혹은 "" + 100; => 문자열 타입 캐스트
//
//            if (a.contains("3") || a.contains("6") || a.contains("9")) {
//                System.out.println("💨");
//            } else {
//                System.out.println(i);
//            }
//        }
//
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.print("숫자 입력(1: 퇴직금 계산, 2: 주휴수당 계산, 3: 연차수당 계산): ");
//            int numPrompt = sc.nextInt();
//
//            if (numPrompt == 1) {
//                System.out.println();
//                System.out.println("퇴직금 계산법 = (퇴직 전 3개월 임금 총액 / 퇴직 전 3개월 총일수) × 30일 × (계속 근로일수 / 365일)");
//            } else if (numPrompt == 2) {
//                System.out.println();
//                System.out.println("주휴수당 계산법 = (1주간 소정근로시간 ÷ 40시간) x 8시간 x 시급");
//            } else if (numPrompt == 3) {
//                System.out.println();
//                System.out.println("연차수당 계산법 = 미사용 연차 수당 = 1일 통상임금 X 미사용 연차 일수");
//            } else if (numPrompt == 4) {
//                System.out.println();
//                System.out.println("프로그램 종료");
//                break;
//            } else {
//                System.out.println();
//                System.out.println("번호 입력 오류");
//            }
//        }
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println();
//            System.out.print("1: 더하기\n2: 빼기\n3: 곱하기\n4: 나누기\n5: 프로그램 종료\n 계산기 옵션 입력: ");
//            int cal = sc.nextInt();
//            System.out.print("첫 번째 정수 입력: ");
//            int numValA = sc.nextInt();
//            System.out.print("두 번째 정수 입력: ");
//            int numValB = sc.nextInt();
//
//            switch (cal) {
//                case 1:
//                    System.out.println();
//                    System.out.println("더한 값: " + (numValA + numValB));
//                    break;
//                case 2:
//                    System.out.println();
//                    System.out.println("뺀 값: " + (numValA - numValB));
//                    break;
//                case 3:
//                    System.out.println();
//                    System.out.println("곱한 값: " + (numValA * numValB));
//                    break;
//                case 4:
//                    if ( numValB <= 0) {
//                        System.out.println("두 번째 수는 0보다 큰 정수여야 합니다.");
//                        return;
//                    }
//                    System.out.println();
//                    System.out.println("나눈 값: " + (numValA / numValB));
//                    System.out.println("나머지 값: " + (numValA % numValB));
//                    break;
//                case 5:
//                    System.out.println("프로그램 종료");
//                    return;
//                default:
//                    System.out.println("없는 계산기 옵션");
//                    break;
//            }
//        }
        /*
         => 이름, 나이, 수강료
         - 1. 학생 등록
         - 2. 학생 삭제
         - 3. 학생 전체 조회[]
         - 4. 프로그램 종료
         */
        while (true) {
            Scanner sc = new Scanner(System.in);

            Student student[] = new Student[10];
            System.out.print("학생 관리 프로그램\n1. 학생 등록\n2. 학생 삭제\n3. 모든 학생 조회\n4. 프로그램 종료\n번호입력: ");
            int student_count = 0;
            int numVal = sc.nextInt();
            sc.nextLine();

        }
    }
}
