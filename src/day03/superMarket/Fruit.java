package day03.superMarket;

abstract class Fruit {
    String name;
    Integer sugar;
    String color;

    public Fruit(String name, Integer sugar, String color) {
        this.name = name;
        this.sugar = sugar;
        this.color = color;
    }

    abstract void getInfo();
}
