package Loop;

import java.util.Scanner;

public class PrintNtoN
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int i=0;
        while (i<=n)
        {
            System.out.print(i+" ");
            i++;
        }

    }
}
