package day04.review;
    /*
    * 변수/데이터 타입/타입 캐스팅/ArrayList<>/추상클래스&인터페이스/HashSet&HashMap
    * */

import java.util.ArrayList;
import java.util.Scanner;

public class Review {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Coffee> coffeeMenu = new ArrayList<>();
    ArrayList<Coffee> coffeeCart = new ArrayList<>();
    coffeeMenu.add(new Coffee("아이스 아메리카노", 1500));
    coffeeMenu.add(new Coffee("커피 라떼", 2000));
    coffeeMenu.add(new Coffee("에스프레소", 3500));

        while (true) {
            System.out.println();
            System.out.println("0. 커피등록");
            System.out.println("1. 커피주문");
            System.out.println("2. 장바구니");
            System.out.println("3. 정산");
            System.out.println("4. 주문취소");
            System.out.print("번호 입력: ");
            int num = sc.nextInt();

            System.out.println();
            switch (num) {
                case 0:
                    // 커피 등록
                    System.out.println();
                    System.out.print("등록할 커피 이름 입력: ");
                    sc.nextLine();
                    String coffeeName = sc.nextLine();
                    System.out.print("커피 가격 입력: ");
                    Integer coffeePrice = sc.nextInt();
                    coffeeMenu.add(new Coffee(coffeeName, coffeePrice));
                    System.out.println(coffeeName + " 선택됨. 가격: " + coffeePrice);
                    break;
                case 1:
                    // 커피 주문
                    System.out.println("========== 커피 메뉴 ==========");
                    for (int i = 0; i < coffeeMenu.size(); i++) {
                        System.out.print(i + ". ");
                        coffeeMenu.get(i).getCoffeeInfo();
                    }
                    System.out.println("=============================");
                    System.out.print("원하는 커피의 번호를 입력하세요: ");
                    Integer coffeeNum = sc.nextInt();

                    if (coffeeNum < 0 || coffeeNum >= coffeeMenu.size()) {
                        System.out.println("선택하신 상품이 없습니다.");
                    } else {
                        coffeeCart.add(coffeeMenu.get(coffeeNum));
                        System.out.println("장바구니에 " + coffeeMenu.get(coffeeNum).name + " 이/가 추가 되었습니다.");
                    }
                    break;
                case 2:
                    // 장바구니
                    if (coffeeCart.isEmpty()) {
                        System.out.println("선택하신 상품이 없습니다.");
                    } else {
                        System.out.println("장바구니 목록: ");
                        coffeeCart.forEach((v) -> v.getCoffeeInfo());
                    }
                    break;
                case 3:
                    // 정산
                    if (coffeeCart.toArray().length == 0) {
                        System.out.println("선택하신 상품이 없습니다.");
                    } else {
                        Integer sum = coffeeCart.stream().map((v) -> v.getPrice()).reduce(0, Integer::sum);
                        System.out.println("총가격은 " + sum +" 원 입니다.");
                        System.out.println("이용해 주셔서 감사합니다.");
                        coffeeCart.clear();
                    }
                    break;
                case 4:
                    System.out.println("이용해 주셔서 감사합니다.");
                    return;
                default:
                    System.out.println("없는 옵션입니다.");
                    break;
            }
        }
    }
}
