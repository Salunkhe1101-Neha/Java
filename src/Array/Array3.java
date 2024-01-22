package Array;
import java.util.Scanner;
public class Array3 {
//    static int sum=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size=sc.nextInt();
        int [] array=new int[size];
        System.out.println("Enter Element in array");
        for(int i=0; i<size;i++)
        {
            array[i]=sc.nextInt();
        }

        System.out.println("Sum of Elements at odd index is : " + displayArray(array, size));

    }
    public static int displayArray(int [] array, int size)
    {
        int sum=0;
        for (int i=1; i<size;i+=2)
        {
//            System.out.println(array[i]);
            sum=sum+array[i];
        }
        return sum;
    }
}
