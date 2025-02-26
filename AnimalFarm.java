public class AnimalFarm
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the animal farm!\n");

        Animal animal = new Animal();
        System.out.println(animal.speak());
        animal.kill();
        System.out.println(animal + "\n");

        Animal smanimal = new Animal();
        System.out.println(smanimal);
        smanimal.getOlder();
        System.out.println(smanimal);
        smanimal.kill();
        System.out.println(smanimal);
    }
}