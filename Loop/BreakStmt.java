package Loop;

public class BreakStmt
{
    public static void main(String[] args) {
        int n=10;
        for (int i=0; i<=n; i++)
        {
            if (i==3)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
