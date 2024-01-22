
package Array;
import java.util.Scanner;

public class Array1 {
    static int [] arr= new int[5];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements in array");
        for (int i=0; i<arr.length; i++)
        {
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println("Array Elements");
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
