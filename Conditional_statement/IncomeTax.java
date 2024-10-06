package Conditional_statement;

import java.util.Scanner;

public class IncomeTax
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your Income");
        double income=sc.nextDouble();
        double tax=0;
        if(income<500000)
        {
            tax=0;
        } else if (income>500000 && income<1000000) {
            tax=income*(0.2);
        }
        else {
            tax=income*(0.3);
        }
        System.out.println(" Income :"+income);
        System.out.println(" Tax :"+tax);
    }
}
