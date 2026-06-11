import java.util.Scanner;
public class cart {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what do you want to buy");
        String item = sc.nextLine();
        System.out.println("enter the quantity");
        int quantity = sc.nextInt();
        System.out.println("enter the price");
        double price= sc.nextDouble();
        double total = quantity*price;
        System.out.println("total price of "+total);
        double gst = total*0.18;
        System.out.println("total price of "+ item +" of "+quantity+" with gst is "+gst);

        }  
}
