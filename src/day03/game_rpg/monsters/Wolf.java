package day03.game_rpg.monsters;

public class Wolf extends Monster{
    private int hp = 40;
    private int strength = 10;

    @Override
    void attack() {
        System.out.println("깨물기");
    }
}
