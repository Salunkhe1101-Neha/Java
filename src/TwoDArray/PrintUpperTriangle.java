package TwoDArray;
import java.util.Scanner;
import java.util.Scanner;

public class PrintUpperTriangle {
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
//        System.out.println("Enter Elements in first array");
        int [][] array=new int[row][col];
        int [][] array2=new int[row][col];
        int num=1;
        for(int i=0;i< array.length;i++)
        {

            for(int j=0;j<col;j++)
            {
                array[i][j]=num++;
            }
        }
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i<=j)
                {
                    System.out.print(array[i][j] + " ");
                }
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }

    }
}
