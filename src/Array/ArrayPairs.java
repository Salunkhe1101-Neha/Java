package Array;

public class ArrayPairs {
    public static void main(String[] args) {
        int [] arr={-1,3,5,10,8,4,2,6};
//        int [][] pairs= new int[6][2];

        for (int i=0; i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length; j++)
            {
                int sum=(arr[i])+(arr[j]);
                if (sum==9)
                {
                    System.out.print("\n"+"{"+ arr[i] +","+ arr[j]+"}");
                }
            }
        }
    }
}
