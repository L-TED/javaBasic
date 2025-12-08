package day03.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1. 상품담기");
            System.out.println("2. 상품조회");
            System.out.println("3. 프로그램 종료");
            System.out.print("번호 입력: ");
            int num = sc.nextInt();

            System.out.println();
            switch (num) {
                case 1:
                    System.out.println();
                    System.out.print("희망 상품 입력: ");
                    String prdName = sc.next();
                    System.out.print("상품 가격 입력: ");
                    Integer prdPrice = sc.nextInt();

                    products.add(new Product(prdName, prdPrice));
                    System.out.println(prdName + " 선택됨. 가격: " + prdPrice);
                    break;
                case 2:
                    if (products.toArray().length == 0) {
                        System.out.println("선택하신 상품이 없습니다.");
                    } else {
                        products.forEach((v) -> v.getProductInfo());
                        Integer sum = products.stream().map((v) -> v.getPrice()).reduce(0, Integer::sum);
                        System.out.println("총가격: " + sum +" 원");
                    }
                        break;
                case 3:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("없는 옵션");
                    break;
            }
        }

    }
}
