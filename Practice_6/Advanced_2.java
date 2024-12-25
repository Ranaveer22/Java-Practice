package Practice_6;

abstract class Car
{
    abstract void FuelType();

    void Colour()
    {
        System.out.println("Black");
    }
}

class Bugatti extends Car
{
    @Override  //Overriding the Method Fuel Type
    public void FuelType() 
    {
        System.out.println("Petrol");
    }
}

public class Advanced_2
{
    public static void main(String[] args) 
    {
        Bugatti cr = new Bugatti();
        cr.Colour();
        cr.FuelType();
    }
}