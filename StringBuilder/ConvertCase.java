package StringBuilder;

public class ConvertCase
{
    public static StringBuilder convert(String str)
    {
        StringBuilder s= new StringBuilder("");
        char c= Character.toUpperCase(str.charAt(0));
        s.append(c);
        for (int i=1; i<str.length(); i++)
        {
            if (str.charAt(i)==' ' && i<str.length()-1)
            {
                s.append(str.charAt(i));
                i++;
                s.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                s.append(str.charAt(i));
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String str= "hi, i am abhimanyu kumar";
        System.out.println(convert(str));

    }
}
