package Array;
import java.util.Scanner;
public class ShopItemOperations {
    static Scanner sc=new Scanner(System.in);
    static ShopItemArray a1= new ShopItemArray();

    static void operations()
    {

        int items=5;

            System.out.println("Please Enter your choice");
            System.out.println(" 1. Bath Soap (15 rs Per piece) \n 2. Biscuit (40 rs per packet) \n 3. Rice (35 rs pr kg) \n 4. Sugar (55 rs per kg) \n 5. Oil (27 rs per liter)");

            int productNo=sc.nextInt();

            System.out.println("Please Enter product quantity");
            double qty=sc.nextDouble();
            if(productNo<6&&productNo>0)
              a1.AddItemInShop(productNo, qty);

            else
               System.out.println("Invalid choice");

        repeatMenu();


    }

    static void repeatMenu()
    {
        System.out.println(" 1. To add new item \n 2. To Display Bill");
        int choice=sc.nextInt();
        if (choice==1)
        {
            operations();
        }
        else if(choice==2)
        {
            a1.displayBill();
        }

    }

    public static void main(String[] args) {
        operations();

    }

}
