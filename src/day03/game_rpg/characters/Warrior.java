package day03.game_rpg.characters;

public class Warrior extends Character{
    private int hp = 100;
    private int mp = 10;
    private int strength = 3;

    @Override
    void attack() {
        System.out.println("공격");
    }

    @Override
    void skill() {
        System.out.println("특수공격");
    }
}
