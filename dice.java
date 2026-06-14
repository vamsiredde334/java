import java.util.Scanner;
import java.util.Random;
public class dice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rc = new Random();
    int total =0;
    System.out.println("enter the rolled");
    int rolled = sc.nextInt();

    if(rolled>0){
            for(int i=0; i<=rolled; i++){
            int roll=rc.nextInt(1,7);
            System.out.println("all outcomes " + roll);
            total= total+roll;
            System.out.println("total is "+total);
            }
    }
    else{
        System.out.println("enter valid number");
    }



    }
}
