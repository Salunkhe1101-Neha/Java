package Array;
//Write a java program to find  occurance of character
import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        char [] name = {'N', 'A','Y','A','N'};
        int [] count=new int[name.length];
        char [] duplicate=new char[name.length];

        for (int i=0; i< name.length;i++) {
            int temp=1;
            {
                for(int j=i+1; j< name.length;j++) {

                    if (name[i] == name[j]) {

                        temp++;
                        count[j] = -1;
                    }
                }
                    if(count[i]==0)
                    {
                        count[i]=temp;
                        duplicate[i]=name[i];
                    }

            }
        }
        for (int i=0; i<name.length; i++)
        {
            if(count[i]>0)
            {
                System.out.println(duplicate[i] + " " + count[i]);
            }
        }
    }
}
