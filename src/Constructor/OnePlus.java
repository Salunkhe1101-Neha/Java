package Constructor;

public class OnePlus {
    static int onePlus;

    void plusOne()
    {
        onePlus++;
    }

    OnePlus(int one)
    {
        onePlus=one;
    }

    public  static void main(String[] args)
    {
        OnePlus one=new OnePlus(1);
        OnePlus two=new OnePlus(2);
        one.plusOne();
        two.plusOne();
        System.out.println(one.onePlus+two.onePlus);

    }



}
