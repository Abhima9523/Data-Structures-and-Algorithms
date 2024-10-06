package Method;

import java.util.Scanner;

public class Calculator
{
    public static int sum(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    public static int sub(int a,int b)
    {
        int sub=a-b;
        return sub;
    }
    public static int div(int a, int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your first number");
        int a=sc.nextInt();
        System.out.println("enter your second number");
        int b=sc.nextInt();
        System.out.println(sum(a,b));
    }
}
