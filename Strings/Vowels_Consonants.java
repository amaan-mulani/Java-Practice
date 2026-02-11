public class Vowels_Consonants
{
    public static void main(String[] args)
    {
        String str = " Hello, This is sample text.";
        int vowels=0;
        int consonants = 0;

        for(int i = 0; i<=str.length()-1;i++)
        {
            char ch = str.charAt(i);
            if( (ch>= 'a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                if ((ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
                        ||
                        (ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'))
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
        }

        System.out.println(str);
        System.out.println("Contains: "+vowels+" vowels & " +consonants+" consonants.");
    }
}
