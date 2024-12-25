import java.util.*;

class Person
{
    String Name;
    int Age;
    Person(String Name , int Age)
    {
        this.Name = Name;
        this.Age = Age;
    }
}

class Workers extends Person
{
    String Occupation;
    double Wage;
    Workers(String Name , int Age , String Occupation , double Wage)
    {
        super(Name, Age);
        this.Occupation = Occupation;
        this.Wage = Wage;
    }
}

public class Advanced_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input Name , Age , Occupation , Wage . . . . .");
        String Name =  sc.nextLine();
        int Age = sc.nextInt();
        sc.nextLine();
        String Occupation = sc.nextLine();
        double Wage = sc.nextDouble();
        Workers wk =new Workers(Name , Age , Occupation , Wage);
        System.out.println("\nDetails Of The Worker -->");
        System.out.println(wk.Name);
        System.out.println(wk.Age);
        System.out.println(wk.Occupation);
        System.out.println(wk.Wage);
        sc.close();
    }
}