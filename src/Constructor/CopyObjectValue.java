package Constructor;

public class CopyObjectValue {
    int a;
    int b;
    CopyObjectValue(int a, int b)
    {
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        CopyObjectValue b1=new CopyObjectValue(10, 20);
        System.out.println(" a:-"+b1.a+ " b:- "+ b1.b);
        CopyObjectValue b2=new CopyObjectValue(b1.a, b1.b);
        System.out.println(" a:-"+b2.a+ " b:- "+ b2.b);


        System.out.println("b1 : "+b1);

    }

}
