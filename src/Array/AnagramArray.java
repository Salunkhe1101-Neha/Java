package Array;

public class AnagramArray {

    public static void main(String[] args)
    {
        char [] name={'A', 'N', 'A', 'G', 'R', 'A', 'M'};
        char [] name1 = {'G', 'R', 'A', 'M', 'A', 'N', 'A',};
        int [] count=new int[name.length];
        int [] count1=new int[name.length];
        char [] duplicate=new char[name.length];
        char [] duplicate1=new char[name.length];

        if(name.length!=name1.length)
        {
            System.out.println("Not anagram");
        }

        for (int i=0; i< name.length;i++) {
            int temp=1, temp1=1;
            {
                for(int j=i+1; j< name.length;j++) {

                    if (name[i] == name[j]) {

                        temp++;
                        count[j] = -1;
                    }
                    if(name1[i]==name1[j])
                    {
                        temp1++;
                        count1[j] = -1;
                    }
                }
                if(count[i]==0)
                {
                    count[i]=temp;
                    duplicate[i]=name[i];
                }
                if(count1[i]==0)
                {
                    count1[i]=temp1;
                    duplicate1[i]=name1[i];
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

        System.out.println();
        int temp=0;
        for (int i=0; i<duplicate1.length; i++)
        {
           for(int j=0;j<duplicate1.length;j++)
           {
               if((duplicate[i]==duplicate1[j])&&(count[i]==count1[j]))
               {
                   System.out.println(duplicate[i]);
                   temp++;
               }
           }
        }
        System.out.println(temp);

    }
}
