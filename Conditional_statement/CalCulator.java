package Conditional_statement;

import java.util.Scanner;

public class CalCulator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        int a=sc.nextInt();
        System.out.println("enter b :");
        System.out.println("enter operator");
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("input invailed");
        }

    }
}
