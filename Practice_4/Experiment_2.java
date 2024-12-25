//Program to Input Values Using Getter and Setter

import java.util.*;

public class Experiment_2 
{
    public static void main(String[] args)
    {
        System.out.println("\nProgram To Input Name & Age Using Getter & Setter\n");
        GetterSetter obj = new GetterSetter();
        obj.setValues();
        String name = obj.getName();
        int age =obj.getAge();
        System.out.println("\nName --> " + name);
        System.out.println("Age --> " + age);
    }
}

class GetterSetter
{
    private String name;
    private int age;
    public void setValues()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input   Name    &   Age     . . . .");
        name = sc.nextLine();
        age =sc.nextInt();
        sc.close();

    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
