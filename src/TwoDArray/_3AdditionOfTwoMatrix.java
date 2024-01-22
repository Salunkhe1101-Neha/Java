package TwoDArray;

import java.util.Scanner;
import java.util.Scanner;
public class _3AdditionOfTwoMatrix {
    public static void main(String[] args) {
              Addition();
    }

    static void Addition()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row value");
        int row=sc.nextInt();
        System.out.println("Enter col Value");
        int col=sc.nextInt();
        System.out.println("Enter Elements in first array");
        int [][] array=new int[row][col];
        int [][] array2=new int[row][col];
        int [][] sum=new int[row][col];
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j<col;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements in second array");
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j<col;j++)
            {
                array2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j]=array[i][j]+array2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

}
