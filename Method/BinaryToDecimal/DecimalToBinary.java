package Method.BinaryToDecimal;

public class DecimalToBinary
{
    public static void DectoBin(int n)
    {
        int mynum=n;
        int power=0;
        int binary=0;
        while (0<n)
        {
            int rem=n%2;
            binary=binary+(rem*(int)Math.pow(10,power));
            power++;
            n=n/2;
        }
        System.out.println(" Decimal "+mynum +" Binary :"+binary);
    }
    public static void main(String[] args) {
        DectoBin(7);
    }
}
