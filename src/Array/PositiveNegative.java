package Array;
public class PositiveNegative {
    public static void main(String[] args) {
        int[] array = {1, -3, 2, 4, -5, 6, -7, 8};

        // Bubble Sort
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

        // Print the sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
