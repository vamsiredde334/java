import java.util.Scanner;
public class exceptionn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    try {
        System.out.print("Enter a : ");
        int a =sc.nextInt();
        System.out.print("Enter b : ");
        int b=sc.nextInt();
        System.out.println(a/b);
    }
    catch (Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("Thank you for using the program.");
    }
    }
}
