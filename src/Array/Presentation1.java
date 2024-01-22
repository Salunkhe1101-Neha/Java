package Array;
import java.util.Scanner;
public class Presentation1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array=new int[5];
        int [][] array1=new int[2][2];

        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter elements in array");
            array[i]=sc.nextInt();
        }

        System.out.println("print elements in array");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }


    }
}
