package Array;
//Find count of largest sub array
public class LargestSubArray10 {
    public static void main(String[] args) {
        int [] array={1,2,1,2,3,4,1};
        find(array);
    }

    public static void find(int [] array)
    {
        int count=1, max=0;
        for(int i=1; i<array.length;i++)
        {
            if(array[i]>array[i-1]){
                count++;
            }
            else {
                if(max<count)
                {
                    max=count;
                    count=1;
                }
            }
        }
        System.out.println(max);
    }
}
