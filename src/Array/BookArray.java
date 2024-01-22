package Array;

import java.sql.SQLOutput;
import java.util.Scanner;
public class BookArray {
    static BookSimulation b1= new BookSimulation();
    static  Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        operation();
    }

    static void operation()
    {
       boolean status=true;



        while (status)
        {
            System.out.println(" 1. Display All Books \n" + " 2. Purches Book \n 3. Update Book Price \n 4. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    b1.displayBookData();
                    break;

                case 2:
                    purchesBookProduct();
                    break;

                case 3:
                    updateBookPrice();
                    break;

                case 4:
                    System.out.println("Thank You for visiting");
                    status=false;
                    break;

                default:
                    System.out.println("Invalid Choice ");
            }
        }

    }

    static  void purchesBookProduct()
    {
        System.out.println("Enter Book Id");
        int id=sc.nextInt();

        System.out.println("Enter book Quantity");
        int qyt=sc.nextInt();

        if(id>0&&id<5)
        {
            b1.purchaseBook(id, qyt);
        }
    }

    static void updateBookPrice()
    {
        System.out.println("Enter Id of book which you have to change price");
        int id=sc.nextInt();
        System.out.println("Enter price");
        double price=sc.nextDouble();

        b1.updateBookPrice(id,price);
    }
}
