package QuestionsProgram;

import java.util.Scanner;

public class ExceptUserNo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        while (true)
        {
            int n=sc.nextInt();
            if (n%10==0)
            {
                continue;
            }
            System.out.println(n);
        }
    }
}
