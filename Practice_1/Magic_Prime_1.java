//Printing Magic Prime Number from x to y


import java.util.*;

public class Magic_Prime_1
{   
    private static boolean Prime(int num)
    {
        int c=0;
        for(int i = 1 ; i <= num ; i++)
        {
            if(num % i == 0)
                c++;
        }
        if(c == 2)
            return true;
        else 
            return false;
    }
    private static boolean Magic(int num)
    {
        int temp = num, sum = 0;
        while( temp > 9 )
        {
            while(temp != 0)
            {
                sum += temp % 10;
                temp /= 10;
            }
            temp = sum;
            sum = 0;
        }
        if(temp == 1)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("\nInput   Starting     &    Ending   Number  . . . . . .");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("\nPrinting    Magic   Prime   Numbers   from    "+x+"    to     "+y+"    . . . . . .");
        for(int i = x ; i <= y ; i++)
            if(Prime(i) && Magic(i))
                System.out.println(i+"  -->  Magic  Prime  number !");
        sc.close();         
    }
}