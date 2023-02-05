import java.util.Scanner;

public class Restaurant {

    public static String[] products = {null, "1.) Panner tika masala 50.00",
            "2.) biryani 99.00",
            "3.) combo 1 naan  1 panner butter masala  150.00",
            "4.) mega combo 2 naan 1 panner tika 1 mogo 1 rice 200.00"};

    public static int[] product_price ={0,50,99,150,200};

    public static int[] final_qty=new int[5];

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int choose, quantity;
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        char decision;
        System.out.println("Welcome to Kevin restaurant, please choose any of the menu there..");
        do
        {



            System.out.println(products[1]);
            System.out.println(products[2]);
            System.out.println(products[3]);

            System.out.println(products[4]);

            System.out.print("Choose any item: ");
            choose=s.nextInt();

            System.out.print("How many pieces? ");
            quantity=s.nextInt();

            switch(choose)
            {
                case 1:
                    p1 += quantity;
                    final_qty[1]=p1;
                    break;

                case 2:
                    p2 += quantity;
                    final_qty[2]=p2;
                    break;

                case 3:
                    p3 += quantity;
                    final_qty[3]=p3;
                    break;

                case 4:
                    p4 += quantity;
                    final_qty[4]=p4;
                    break;

                default:
                    System.out.println("sorry cant accept");
                    break;
            }
            System.out.print("Would you like to order again? / y/n: ");
            decision=s.next().charAt(0);
        }while(decision != 'n' && decision != 'N');

        System.out.println("==Final Cart==");
        System.out.println("\t\\Item\t\\Qty\t\\Total");
        int sum=0;
        for(int i=0; i < final_qty.length; i++)
        {
            if(final_qty[i] != 0)
            {
                System.out.println(products[i]+"\\"+final_qty[i]+"\\"+final_qty[i]*product_price[i]);
                sum = sum + final_qty[i]*product_price[i];
            }
        }
        System.out.println("Total Purchased items: "+(p1+p2+p3+p4));
        System.out.println("Total Purchase: "+sum);
        int payment=0;
        do
        {
            System.out.print("Enter Payment: ");
            payment=s.nextInt();
        }while(sum > payment);
        System.out.println("Thank you for buying! here's your change: "+(payment-sum));
    }

}
