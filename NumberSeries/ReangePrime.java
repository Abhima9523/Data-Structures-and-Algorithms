package NumberSeries;

public class ReangePrime
{
    public static void print(int n)
    {
        for (int i=0; i<=n; i++)
        {
            if ( CheckPrime.check(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        print(18);
    }
}
