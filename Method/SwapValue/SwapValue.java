package Method.SwapValue;

import java.util.Scanner;

public class SwapValue
{
    public static void swap(int a, int b)
    {
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }public static void swap1(int a, int b)
{
    System.out.println("a :"+a);
    System.out.println("b :"+b);
   a=a+b;
   b=a-b;
   a=a-b;
    System.out.println("After swaping");
    System.out.println("a :"+a);
    System.out.println("b :"+b);
}
    public static void swap2(int a, int b)
    {
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swaping");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first vale");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b= sc.nextInt();
        swap(a,b);
        swap1(a,b);
        swap2(a,b);
    }
}
