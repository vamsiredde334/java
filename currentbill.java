import java.util.Scanner;
public class currentbill {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the units consumed");
    double a = sc.nextDouble();
    if(a<0 &&  a>=100){
        double price = a*2;
        System.out.println("you bill is: " + price);
    }
    else if(a>100 && a<=200){
        double price = a*4;
        System.out.println("you bill is: " + price);
    }
    else{
        double price = a*6;
        System.out.println("you bill is: " + price);
    }
}
}
