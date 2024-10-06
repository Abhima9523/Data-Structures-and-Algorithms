package TwoDArrays;

import java.util.Scanner;

public class Matrices
{
    public static  boolean search(int [][] arr ,int key)
    {
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[0].length; j++)
            {
                if (arr[i][j]==key)
                {
                    System.out.println("( "+i+", "+j+" )");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=3;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        //out put
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
    }
}
