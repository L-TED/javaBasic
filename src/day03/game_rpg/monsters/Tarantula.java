package day03.game_rpg.monsters;

public class Tarantula extends Monster{
    private int hp = 25;
    private int strength = 8;

    @Override
    void attack() {
        System.out.println("독 발사");
    }
}
