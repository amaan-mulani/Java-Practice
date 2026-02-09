import java.util.Scanner;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Prime numbers from  1-100 are: ");
        for(int i = 2; i<=100; i++)
        {
            boolean isPrime =  true;

            for (int j= 2; j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime==true)
            {
                System.out.println(i);
            }
        }

    }
}
