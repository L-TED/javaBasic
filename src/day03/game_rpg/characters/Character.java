package day03.game_rpg.characters;


abstract class Character {
  private int hp;
  private int mp;
  private int strength;

  abstract void attack();
  abstract void skill();
}
