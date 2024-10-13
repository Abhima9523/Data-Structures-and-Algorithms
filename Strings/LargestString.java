package Strings;

public class LargestString
{
    public static String largest(String str[])
    {
        String largest=str[0];
        for (int i=0; i<str.length; i++)
        {
            if (largest.compareTo(str[i])<0)
            {
                largest=str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
    String[] str={"banan","hgsdjks","dsjfsgj"};
        System.out.println(largest(str));
    }
}
