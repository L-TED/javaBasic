package day04.theory.ex02;

public class Fruit {
    private String name;
    private Integer sugar;

    public Fruit(String name, Integer sugar) {
        this.name = name;
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public Integer getSugar() {
        return sugar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }
}
