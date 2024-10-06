package Method.BinaryToDecimal;

public class BinaryToDecimal
{
    public static void BinToDec(int Bin)
    {
        int pow=0;
        int dec=0;
        while (Bin>0)
        {
            int ld=Bin%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            Bin=Bin/10;
        }
        System.out.println("Decimal :"+dec);
    }
    public static void main(String[] args) {
        BinToDec(100);
    }
}
