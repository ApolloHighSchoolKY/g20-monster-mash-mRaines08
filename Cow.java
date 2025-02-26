/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{
    int weight;

    public Cow()
    {
        super(0, true, "moo");
        weight = age * 10;;
    }

    public int weigh()
    {
        weight = age * 10;;
        return weight;
    }
}