package day03.game_rpg.characters;

public class Archer extends Character{
    private int hp = 60;
    private int mp = 30;
    private int strength = 5;

    @Override
    void attack() {
        System.out.println("공격");
    }

    @Override
    void skill() {
        System.out.println("특수공격");
    }
}
