package Conditional_statement;

import java.util.Scanner;

public class Switch
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("thu");
                break;
            case 6:
                System.out.println("fri");
                break;
            case 7:
                System.out.println("sat");
            default:
                System.out.println("no ag");
        }
    }
}
