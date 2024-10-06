package ProgrammingQuestion;

import java.util.Scanner;

public class StrongNumber
{
    public static void check(int n)
    {

        int num=n;
        int sum=0;
        while (n>0)
        {
            int rem=n%10;
            int fact=1;
            while (rem>0)
            {
                fact*=rem;
                rem--;
            }
            sum+=fact;
            n=n/10;
        }
        System.out.println(sum);
        if (num==sum)
        {
            System.out.println("Strong number");
        }
        else {
            System.out.println("not a strong number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        check(n);
    }
}
