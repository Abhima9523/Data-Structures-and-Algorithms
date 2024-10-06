package Method.BlockScope;

public class BlockScope
{
    public static void main(String[] args) {
        {
            int a=10;
            System.out.println(" a:"+a);
        }
//        System.out.println(a);//cannot be resolve it block scope varialbe annot access outside
    }
}
