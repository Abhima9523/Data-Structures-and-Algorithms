package QuestionsProgram;

import java.util.Scanner;

public class ContiuneStmt
{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
