package SortingArrays;

import Arrays.ArrayInput;

public class InsertionSort
{
    public static void sort(int arr[])
    {
        for (int i=1; i<arr.length; i++)
        {
            int curr=arr[i];
            int pre=i-1;
            //finding the currect position
            while (pre>=0 && arr[pre]>curr)
            {
                  arr[pre+1]=arr[pre];
                pre--;
            }
            //insertion
            arr[pre+1]=curr;

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
