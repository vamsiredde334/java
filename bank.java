import java.util.Scanner;
public class bank {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean isrunning=true;
        double balance=0;
        while (isrunning) {
        System.out.println("*******");
        System.out.println("WELCOME");
        System.out.println("*******"); 
        System.out.print("enter your option 1.BALANCE 2.DEPOSIT 3.WITHDRAW 4.EXIT : " );
        int num = sc.nextInt();
        
            
        switch(num) {
            case (1) -> showbalance(balance);
            case (2) -> balance += deposit();
            case (3) -> balance -= withdrawn();
            case (4) -> System.out.println("EXIT");
        }

        }
    } static void showbalance(double balance){
        System.out.println("$"+balance);
    }
    static double deposit(){
        System.out.println("enter the amount to be deposited  $");
        double amount=sc.nextDouble();
        return amount;
    }
    static double withdrawn(){
        System.out.println("enter the amount to be withdrawn  $");
        double amount =sc.nextDouble();
        return amount;

    }
}
