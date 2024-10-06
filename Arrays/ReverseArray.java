package Arrays;

public class ReverseArray
{
    public static void  reverse(int []arr)
    {
        for (int i=0; i<arr.length/2; i++)
        {
            arr[i]=arr[i]^arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i]^arr[arr.length-1-i];
            arr[i]=arr[i]^arr[arr.length-1-i];
        }
    }
    public static void main(String[] args) {
        int arr[]=ArrayInput.intput();
        reverse(arr);
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
