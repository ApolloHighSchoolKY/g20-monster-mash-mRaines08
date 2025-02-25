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

    public String infect()
    {
        Monster friend = new Zombie("friend");
        return "Friend has been infected.";
    }
}
