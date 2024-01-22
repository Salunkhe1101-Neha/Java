package Array;
//Find one missing element in array
public class MissingElement {
    public static void main(String[] args) {
        int [] num={3,4,5,1};
        findMissingE(num);
    }
    public static void findMissingE(int [] num)
    {


        int sum=0;
        int max=num[0];
        int min=num[0];
        for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
            if(min>num[i])
            {
                min=num[i];
            }
            if(max<num[i])
            {
               max=num[i];
            }
        }
        int add=0;
        for(int i=min; i<=max;i++)
        {
          add=add+i;
        }

        int result=add-sum;
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Sum: "+sum);
        System.out.println("Add: "+add);
        System.out.println("Missing Element is : "+result);
    }
}
