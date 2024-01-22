package Array;

import java.sql.SQLOutput;

public class ShopItemArray {
    static double paybleAmount;
    int [] ItemName=new int[5];
    int [] priceItem={10,40,35,55,27};


    public void AddItemInShop(int productNo, double qty) {
        int index=productNo-1;
        paybleAmount=paybleAmount+(priceItem[index]*qty);

    }

    public void displayBill() {
        double discount=paybleAmount*5/100;
        double GST=paybleAmount*3/100;
        double BillAfterDiscount=paybleAmount-discount;
        double grandTotal=BillAfterDiscount+GST;
        System.out.println("Total Bill Amount is : "+paybleAmount);
        System.out.println("Discount(5%) :         "+discount);
        System.out.println("Bill After Discount :  "+BillAfterDiscount);
        System.out.println("GST(3%) :              "+GST);
        System.out.println("Grand Ttotal :         "+grandTotal);
        System.out.println(5/100);
    }
}
