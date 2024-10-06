package Arrays;

public class SubArrays
{
    public static void printSubarrays(int arr[])
    {
        for (int i=0; i<arr.length; i++)
        {
            int sum=0;
            for (int j=i; j<arr.length; j++)
            {
                for (int k=i; k<=j; k++)
                {
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");

                }
//                System.out.println();
                System.out.println(" =>"+sum);
            }
            System.out.println();
        }
    }
    public  static  void  kadens(int []arr)
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0; i<arr.length; i++)
        {
            cs=cs+arr[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sum :"+ms);
    }
    public static void main(String[] args) {
        int []arr=ArrayInput.intput();
        kadens(arr);
    }
}
