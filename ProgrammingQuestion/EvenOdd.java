package ProgrammingQuestion;

public class EvenOdd
{
    public static void logic1(int n)
    {
        if (n%2==0)
        {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    public static boolean logic3(int n)
    {
        return n%2==0;
    }
    public static String logic2(int n)
    {
        return n%2==0 ? "Even":"odd";
    }
    public static void logic4(int n)
    {
        if ((n&1)==0)
        {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        int n=10;
        logic1(n);
        System.out.println(logic2(n));
        System.out.println(logic3(n));
        logic4(n);
    }
}
