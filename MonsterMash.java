public class MonsterMash{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Monster Mash");

    Monster mrLeohr = new Monster("Mr. Leohr");
    System.out.println(mrLeohr);
    System.out.println(mrLeohr.kill());
    System.out.println(mrLeohr.getName());

    Monster west = new Witch("Wicked Witch of the West");
    System.out.println(west);
    System.out.println(west.kill());

    Monster carl = new Zombie("Carl");
    System.out.println(carl);
    System.out.println(carl.kill());
  }
}
