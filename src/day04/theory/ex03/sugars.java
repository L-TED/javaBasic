package day04.theory.ex03;

import day04.theory.ex02.Fruit;

@FunctionalInterface
public interface sugars {
    int sugarContents(Fruit fruitA, Fruit fruitB);
}
