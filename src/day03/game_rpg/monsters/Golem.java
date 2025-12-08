package day03.game_rpg.monsters;

public class Golem extends Monster{
    private int hp = 85;
    private int strength = 13;

    @Override
    void attack() {
        System.out.println("내려치기");
    }
}
