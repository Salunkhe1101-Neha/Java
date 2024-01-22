package TwoDArray;
import java.util.Scanner;
public class _1ReverseTwoDArray {
    public static void main(String[] args) {
        operation();
    }

    static void operation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row value");
        int row=sc.nextInt();
        System.out.println("Enter col Value");
        int col=sc.nextInt();

        int [][] array=new int[row][col];
        int [][] revers=new int [row][col];

        System.out.println("Enter Elements in array");
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j<col;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Print values in array");
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(array[i][j] + " ");
                revers[j][i]=array[i][j];

            }

            System.out.println();
        }
        System.out.println("Print Reverse Array");
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(revers[i][j] + " ");
            }

            System.out.println();
        }
    }
}
