public class StringPalindrome
{
    public static void main(String[] args)
    {
        String str = "madam";
        String reversed = "";

        //reverse the string
        for (int i = str.length()-1; i>=0; i--)
        {
            reversed = reversed + str.charAt(i);
        }

        if(str.equals(reversed))
        {
            System.out.println(str + " Is Palindrome !");
        }
        else {
            System.out.println(str + " Not a Palindrome");
        }

    }
}
