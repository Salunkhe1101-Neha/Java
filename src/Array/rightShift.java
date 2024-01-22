package Array;

public class rightShift {
    public static void main(String[] args) {
        int count=0, num=1;
        int [] arr= {1,2,3,4,5};
        while(count<num)
        {
            int temp=arr[arr.length-1];
            for(int i=arr.length-1; i>0;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            count++;
        }

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
