package Array;
//Find Sub array of original array
public class SubArray {
    public static void main(String[] args) {
        int [] originalArray={1,2,3,4};
        for(int i=0; i<originalArray.length;i++)
        {
            for (int j=0;j<originalArray.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(originalArray[k]+ " ");

                }
                System.out.println();
            }

        }
    }

}
