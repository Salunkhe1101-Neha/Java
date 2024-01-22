package Array;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class Array2 {
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

        displayArray(array);

    }
    public  static  void displayArray(int [] array)
    {
        System.out.println("Size of array:"+ array.length);
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i] +"\t");
        }
    }
}
