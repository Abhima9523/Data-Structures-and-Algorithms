package BitManuplation;

public class EvenOddWithoutMod
{
    public static void main(String[] args) {
        int n = 11;
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
