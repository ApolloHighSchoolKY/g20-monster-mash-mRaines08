public class Witch extends Monster
{
    public Witch(String name)
    {
        super(name);
    }

    //override the kill meathod in herited from Monster
    public String kill()
    {
        System.out.println(super.kill());
        return "The victim was tured into a toad. Ribbit ribbit.";
    }
    
}
