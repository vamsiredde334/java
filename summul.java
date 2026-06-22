import java.util.Scanner;
public class summul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be producted : ");
        int num = sc.nextInt();
        int product =1;
        while(num !=0){
            int digit = num%10;
            product*=digit;
            num/=10;


        }
        System.out.println("the product is " +product);
    }
}
