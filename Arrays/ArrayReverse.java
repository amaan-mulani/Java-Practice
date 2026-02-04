import java.util.Scanner;

public class ArrayReverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size;


        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        int[] arr =new int[size];

        System.out.println("Enter the elements in array: ");
        for(int i = 0; i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }

        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }

        //Reverse logic
        int i =0;
        int j = arr.length-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("\nReversed array: ");
        for(int k = 0; k<arr.length;k++)
        {
            System.out.print(arr[k] +" ");
        }
    }
}
