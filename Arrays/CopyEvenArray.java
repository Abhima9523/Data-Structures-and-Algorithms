package Arrays;

import java.util.Arrays;

public class CopyEvenArray
{
    public  static  int[]  disp(int arr[])
    {
        int arr2[]= new  int[arr.length];
        for (int i=0; i<arr.length; i++)
        {
           arr2[i]=arr[i];
        }

        for (int i=0; i<arr2.length; i++)
        {
            if (arr2[i]%2==0) {
                System.out.print(arr2[i] + " ");
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6};
        disp(arr);
    }
}
