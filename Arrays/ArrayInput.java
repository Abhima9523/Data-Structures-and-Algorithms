package Arrays;

import java.util.Scanner;

public class ArrayInput
{
    static int[] arr;
    public static int[] intput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Size");
        int size=sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size; i++)
        {
            System.out.print("Enter element :");
            arr[i]=sc.nextInt();
        }
        return arr;
    }

}
