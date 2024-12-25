import java.util.*;
public class Perfect
{
    int num;
    Perfect(int a)
    {
        num=a;
    }
    int SumFactors()
    {
        int sum=0;
        for(int i = 1; i<=num/2 ; i++)
        {
            if(num%i==0)
                sum+=i;
        }
        return sum;
    }
    void isPerfect()
    {
        
        if(SumFactors()==num)
            System.out.println("Perfect No.");
        else
            System.out.println(" Not a Perfect No.");
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter a No . . . . .");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        Perfect obj = new Perfect(n);
        obj.isPerfect();
    }
}