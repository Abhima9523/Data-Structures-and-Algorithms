package Arrays;

public class PairsArray
{
    public  static  void pairs(int[] arr)
    {
        for (int i=0; i<arr.length-1; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                    System.out.print("( "+arr[i]+","+arr[j]+" )");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]=ArrayInput.intput();
        pairs(arr);
    }
}
