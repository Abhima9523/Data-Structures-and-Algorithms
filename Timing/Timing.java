package Timing;

import java.util.Scanner;

public class Timing
{
    public static void time(String str, long l)
    {
        if (str.equalsIgnoreCase("AM"))

        {
            l=l+12;
            System.out.println(l);
        }else {
            System.out.println(l);
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter AM and PM");
        String str=sc.nextLine();
        System.out.println("houer.menitues");
        long l=sc.nextLong();
        time(str,l);
    }
}
