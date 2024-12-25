//Checking if a Number is Magic Prime or Not

import java.util.*;
public class Magic_Prime
{   
    private static boolean Prime(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                c++;
        }
        if(c==2)
            return true;
        else 
            return false;
    }
    private static boolean Magic(int num)
    {
        int temp=num,sum=0;
        while(true)
        {
            sum+=temp%10;
            temp/=10;
            if(temp==0 && sum>9)
            {
                temp=sum;
                sum=0;
            }
            else if(temp==0 &&sum<10)
                break;
            
        }
        if(sum==1)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number ....");
        int x=sc.nextInt();
        if(Prime(x) && Magic(x))
            System.out.println(x+" is magic number!");
        else{
            System.out.println("Not a magic number!");
        }
        sc.close();
    }
}