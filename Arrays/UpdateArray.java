package Arrays;

public class UpdateArray
{
    public static void update(int arr[])
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+1);
        }
    }
    public static void main(String[] args) {
            int arr[]={10,20,30,40,50};
            update(arr);
    }
}
