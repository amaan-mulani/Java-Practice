import java.util.Scanner;

public class SecondLargest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the elements in array: ");
        for (int i = 0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements in array are: ");
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i]>first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second && arr[i]!=first)
            {
                second = arr[i];
            }
        }
        System.out.println("\nSecond largest element in this array is: "+second);

    }
}
