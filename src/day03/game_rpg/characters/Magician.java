package day03.game_rpg.characters;

public class Magician extends Character{
    private int hp = 30;
    private int mp = 100;
    private int strength = 10;

    @Override
    void attack() {
        System.out.println("공격");
    }

    @Override
    void skill() {
        System.out.println("특수공격");
    }
}
