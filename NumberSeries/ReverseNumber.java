package NumberSeries;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter you number");
        int n=sc.nextInt();
        int reverse=0;
        while (0<n)
        {
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
