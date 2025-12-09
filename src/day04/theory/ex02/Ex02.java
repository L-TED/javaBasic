package day04.theory.ex02;

public class Ex02 {
    static void main(String[] args) {

        Box<Fruit> fruitBox = new Box<>(new Fruit("키위", 12));
        Box<Toy> toyBox = new Box<>(new Toy("콩순이 컴퓨터", "콩순", 8));

        Fruit a = fruitBox.getValue();
        Toy b = toyBox.getValue();
        System.out.println(a);
        System.out.println(b.getMinAge() + "살");
    }

}
