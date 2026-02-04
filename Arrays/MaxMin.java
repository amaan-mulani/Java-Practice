import java.util.Scanner;

public class MaxMin
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

        int max = arr[0];
        for (int i = 0; i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max= arr[i];
            }
        }

        int min = arr[0];
        for (int i = 0; i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                max= arr[i];
            }
        }

        System.out.println("Elements in array are: ");
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nGreatest element in this array: "+max);
        System.out.println("\nSmallest element in this array: "+min);
    }
}
