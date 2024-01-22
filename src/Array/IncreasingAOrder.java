package Array;

public class IncreasingAOrder {
    public static void main(String[] args) {
        int [] array={1,0,1,0,2,0,1,2};
        int [] result=new int[array.length];
        result=operation(array);
        for(int i=0;i< array.length;i++)
        {
            System.out.println(result[i]);
        }
    }
    public static int [] operation(int [] array)
    {
        int [] duplicate=new int[array.length];
        int k=0;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]==0)
            {
                duplicate[k]=array[i];

            }else if(array[i]==1)
            {
                duplicate[k]=array[i];
            }
            else
            {
                duplicate[k]=array[i];
            }
            k++;
        }

        return duplicate;
    }
}
