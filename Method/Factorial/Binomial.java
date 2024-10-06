package Method.Factorial;

import java.util.Scanner;

public class Binomial
{
    public static int bionomial(int n,int r)
    {
        int nFact=Factorial.factorial(n);
        int rfact=Factorial.factorial(r);
        int Nrfact=Factorial.factorial(n-r);
        int ncr=nFact/(rfact*Nrfact);
        return ncr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your n number");
        int n=sc.nextInt();
        System.out.println("Enter your r number");
        int r=sc.nextInt();
        int bio=bionomial(n,r);
        System.out.println("Binomial Coefficent :"+bio);
    }
}
