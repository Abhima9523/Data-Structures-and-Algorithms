package Method.product;

import java.util.Scanner;

public class Product
{
    public static int product(int a,int b)
    {
        int Product=a*b;
        return Product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you first number");
        int a=sc.nextInt();
        System.out.println("enter your second number");
        int b=sc.nextInt();
        int p=product(a,b);
        System.out.println(p);
    }
}
