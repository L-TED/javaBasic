package day01;/*
  1. Hello World 출력
  2. 변수 사용하기: [타입 + 변수명]
  3. 데이터 타입 - 기본, 참조 타입 [wrapper 클래스]
  4. 입력: [Prompt => Scanner]
  5. 타입 캐스팅
*/

public class Basic {
    public static void main(String[] args) {
       /*
        // 1
        System.out.println();
        System.out.println("Hello World");
        // 2
        String name = "고기";
        System.out.println(name + " 먹고싶다.");
        // 3
        boolean a = false;
        int a1 = 10;
        double a2 = 3.14;
        char a3 = 'i';
        Boolean b = true;
        Integer b1 = 20;
        Double b2 = 3.14;
        Character b3 = 'a';
        String a4 = "Hi Everyone";
        String c = "포도";
        String c1 = "포도";
        boolean c4 = c == c1; // true
        String c2 = new String("사과");
        String c3 = new String("사과");
        boolean c5 = c2 == c3; // false
        boolean c6 = (c2.equals(c3)); // true
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        // 4
        Student Kim = new Student("김철수", 22);
        Student Lee = new Student("이영희", 23);
        Kim.studying();
        Lee.studying();

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력: ");
        int a1 = sc.nextInt();
        System.out.print("두 번째 정수 입력: ");
        int a2 = sc.nextInt();
        System.out.println("입력한 숫자 합: " + (a1 + a2));
        // 5
        String b1 = "10";
        String b2 = "20";
        Integer b3 = Integer.parseInt(b1);
        Integer b4 = Integer.parseInt(b2);

        System.out.println(b1 + b2); // 1020
        System.out.println(b3 + b4); // 30
        */

        Bear poo = new Bear("푸", 20, "캐나다");
        poo.drinkCoke();
        poo.breathe();

        Dolphin doldol = new Dolphin("돌돌이", 5);
        doldol.playBall();
    }
}


