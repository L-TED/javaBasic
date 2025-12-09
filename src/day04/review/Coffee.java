package day04.review;

public class Coffee {
    String name;
    Integer price;

    public Coffee(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }



    void getCoffeeInfo () {
        System.out.println(name + " 가격:" + price);
    }
}
