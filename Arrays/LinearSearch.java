package Arrays;

public class LinearSearch
{
    public static void LinearSearch(int []arr,int key)
    {
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Index "+i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        LinearSearch(arr,4);
    }
}
