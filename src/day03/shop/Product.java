package day03.shop;

public class Product {
    String name;
    Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    void getProductInfo() {
        System.out.println();
        System.out.println("상품명: " + this.name);
        System.out.println("상품가격: " + this.price + " 원");
    }
}
