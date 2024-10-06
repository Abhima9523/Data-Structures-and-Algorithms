package QuestionsProgram;

public class CheckEven
{
    public static String check(int n)
    {

        return n%2==0?"even":"odd";
    }
    public static boolean check1(int n)
    {
        return n%2==0;
    }

    public static void main(String[] args) {
        System.out.println(check1(10));
    }
}
