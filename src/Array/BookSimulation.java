package Array;

public class BookSimulation {
    static double paybleAmount;
    String [] bookName={"java", "SQL", "WT", "J2EE"};
    int [] bookQty={15,20,25,30};
    double [] bookPrice ={450, 500, 300, 400};

    void displayBookData()
    {
        System.out.println("ID"+" "+" Book Name" + " BookQyt" +" "+"bookPrice");
        for(int i=0; i<bookName.length; i++)
        {
            System.out.println((i+1) +"  "+ bookName[i] + "  " + bookQty[i] + "  " + bookPrice[i]);
        }
    }

    void purchaseBook(int id, int qyt)
    {
        int index=id-1;
        if(qyt<=bookQty[index])
        {
            bookQty[index]=bookQty[index]-qyt;
            paybleAmount=paybleAmount+(bookPrice[index]*qyt);
            System.out.println("Final bill : " + paybleAmount);
        }

        else
        {
            System.out.println("Invalid Qyt");
        }
    }

    public void updateBookPrice(int id, double price) {
        int index=id-1;
        if(price>0)
        {
            bookPrice[index]=price;
            System.out.println("Book Price Updated Successfully");
        }
        else
        {
            System.out.println("Invalid price");
        }
    }
}
