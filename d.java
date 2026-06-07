import java.util.Scanner;
public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the bill");
        int bill = sc.nextInt();
        float totalbill = bill + (0.05f * bill);
        System.out.println("total bill with gst is "+ totalbill);
    }
}
