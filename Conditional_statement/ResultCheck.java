package Conditional_statement;

import java.util.Scanner;

public class ResultCheck
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks");
        double n=sc.nextInt();
        if(n<33)
        {
            System.out.println("fail :"+n);
        } else if (n>33 && n<=60) {
            System.out.println("Pass :"+n);
        }
        else {
            System.out.println("First :"+n);
        }
    }
}
