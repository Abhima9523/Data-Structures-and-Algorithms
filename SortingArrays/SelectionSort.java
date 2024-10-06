package SortingArrays;

import Arrays.ArrayInput;

public class SelectionSort
{
    public static void sort(int arr[])
    {
        for (int i=0; i<arr.length-1; i++)
        {
            int minpos=i;
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }
    public static void Print(int arr[])
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= ArrayInput.intput();
        sort(arr);
        Print(arr);
    }
}
