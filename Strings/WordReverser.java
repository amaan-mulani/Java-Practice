public class WordReverser
{
    public static void main(String[] args)
    {
        String str = "Amaan Mulani";
        String[] arr = str.split(" ");
        String reversed = "";
        for(int i = arr.length-1; i>=0; i--)
        {
            String word = arr[i];
            String reversedWord = "";
            for(int j = word.length()-1; j>=0;j--)
            {
                reversedWord+= word.charAt(j);
            }

            reversed += reversedWord + " ";
        }

        System.out.println(reversed);

    }
}
