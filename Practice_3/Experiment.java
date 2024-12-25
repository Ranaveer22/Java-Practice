// Printing Average Marks in PCB Using 2 Classes

import java.util.*;

public class Experiment 
{
    public static void main(String[] args)
    {
        PreDefined_Values obj = new PreDefined_Values();
        double average = obj.Input_Values()/3;
        System.out.println("Average Marks in Physics, Chemistry & Biology --> "+average);
    }
}

class PreDefined_Values 
{
    public double Input_Values()
    {
        System.out.println("Enter Marks In Physics, Chemistry & Biology ......");
        Scanner sc  = new Scanner(System.in);
        double phy  = sc.nextDouble();
        double chem = sc.nextDouble();
        double bio  = sc.nextDouble();
        sc.close();
        return (phy+chem+bio);
    }
}