public class MonsterMash{
  public static void main(String[] args)
  {
    System.out.println("\n\nWelcome to the Monster Mash\n");

    Monster mrLeohr = new Monster("Mr. Leohr");
    System.out.println(mrLeohr);
    System.out.println(mrLeohr.kill());
    System.out.println(mrLeohr.getName());

    System.out.println("");
    Monster west = new Witch("Wicked Witch of the West");
    System.out.println(west);
    System.out.println(west.kill());

    System.out.println("");
    Zombie carl = new Zombie("Carl");
    System.out.println(carl);
    System.out.println(carl.kill());
    System.out.println(carl.bite("Sam"));
  }
}
