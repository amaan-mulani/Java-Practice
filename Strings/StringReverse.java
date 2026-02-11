public class StringReverse
{
    public static void main(String[] args)
    {
        String normal = "hello";
        String reversed = "";

        for (int i = normal.length()-1; i>=0;i--)
        {
            reversed = reversed + normal.charAt(i);
        }
        System.out.println(normal);
        System.out.println(reversed);
    }

}
