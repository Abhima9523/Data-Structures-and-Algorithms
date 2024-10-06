package Conditional_statement;

import java.util.Scanner;

public class CheckAge
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int n=sc.nextInt();
        if(n>18)
        {
            System.out.println("Adult");
        } else if (n>=13 && n<18) {
            System.out.println("Tennager");
        }
        else {
            System.out.println("child");
        }
    }

}
