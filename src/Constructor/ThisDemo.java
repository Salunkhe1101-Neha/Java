package Constructor;

import java.sql.SQLOutput;

public class ThisDemo {

    ThisDemo(int a)
    {
        this(10.2);
        System.out.println(1);
    }

    ThisDemo(double b)
    {
        this('A');
        System.out.println(2);
    }
    ThisDemo(char ch)
    {
//        this(1);
        System.out.println(3);
    }

    public static void main(String[] args) {
        ThisDemo d1=new ThisDemo(21);
    }
}
