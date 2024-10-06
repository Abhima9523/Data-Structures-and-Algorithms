package QuestionsProgram;

import java.util.Scanner;

public class CheckPrime
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int n=sc.nextInt();
        if (n==2)
        {
            System.out.println("prime no");
        }
       else {
            boolean isPrime=true;
            for (int i=2; i<=Math.sqrt(n); i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                }
            }
            if (isPrime==true)
            {
                System.out.println("Prime Number");
            }
            else {
                System.out.println("Not a prime no");
            }
        }
    }
}
