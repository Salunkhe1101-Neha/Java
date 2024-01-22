package Array;
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {

        int array[]=displayArray();

        for (int i=0; i<array.length;i++)
        {
            if(array[i]>0)
            {
                System.out.println(array[i]);
            }
        }
    }
    public static int[] displayArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size=sc.nextInt();

        int j=0;
        int [] oddArray =new int [size];
        int [] array=new int[size];

        System.out.println("Enter Element in array");
        for(int i=0; i<size;i++)
        {
            array[i]=sc.nextInt();

            if(array[i]%2==1)
            {
                oddArray[j]=array[i];
                j++;
            }
        }
      size=j;





       return oddArray;
    }
}
