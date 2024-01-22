package Array;


public class Array5 {
    public static void main(String[] args) {
        char [] ch={'c','a', 't'};
        char [] temp={'t', 'c', 'a'};

        if(ch.length==temp.length)
        {
            boolean status=test(ch, temp);
            if(status)
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not Anagram");
            }
        }

        else
        {
            System.out.println("Not Anagram");
        }

    }

    public static boolean test(char[] ch, char[] temp)
    {
        int [] array=new int[26];
        for (int i = 0; i < ch.length; i++) {
            ++array[ch[i] - 'a'];
            --array[temp[i] - 'a'];
        }


        for(int i=0; i< array.length;i++)
        {
           if(array[i]!=0)
           {
               return false;
           }

     }
        return true;
    }
}
