package Array;

public class ArraySort {
    public static void main(String[] args) {
         operation();
    }
    static void operation()
    {
        int [] array={2,3,5,1,4};
        for(int i=0;i< array.length;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}

