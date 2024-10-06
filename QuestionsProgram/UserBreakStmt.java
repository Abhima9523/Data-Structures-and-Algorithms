package QuestionsProgram;

import java.util.Scanner;

public class UserBreakStmt
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number");

        while (true)
        {
            int n=sc.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println(n);
        }

    }
}
