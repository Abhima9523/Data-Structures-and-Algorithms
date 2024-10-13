package Strings;

public class Concatination
{
    public static void Print(String str)
    {
        for (int i=0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i)+" ");
        }

    }
    public static void main(String[] args) {
        String first="Abhimanyu";
        String last="Kumar";
        String Fullname=first+" "+last;
//        System.out.println(Fullname);
        Print(Fullname);
    }

}
