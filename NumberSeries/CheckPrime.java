package NumberSeries;

public class CheckPrime
{
    public static boolean check(int n)
    {
        if (n==2)
        {
            return true;
        }
       else {
            boolean isPrime=true;
            for (int i=2; i<=n-1; i++)
            {
                if (n%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
            return isPrime;
        }
    }
    public static void main(String[] args) {
        System.out.println(check(3  ));
    }
}
