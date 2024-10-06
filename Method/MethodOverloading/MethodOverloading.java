package Method.MethodOverloading;

public class MethodOverloading
{
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10.1f,20.1f));
    }
}
