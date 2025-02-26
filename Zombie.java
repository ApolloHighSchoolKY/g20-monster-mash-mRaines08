public class Zombie extends Monster
{
    public Zombie(String name)
    {
        super(name);
    }

    //override the kill meathod in herited from Monster
    public String kill()
    {
        System.out.println(super.kill());
        return "The victim has been bitten. They may soon be infected.";
    }

    public String bite(String victimName)
    {
        int infectNum = (int)(Math.random()*2);

        if(infectNum == 0)
        {
            Zombie victimBitten = new Zombie(victimName);
            return "" + victimName + " has been infected. " + victimName + " is now a zombie.";
        }
        else
            return "" + victimName + " is safe for now.";

    }
}
