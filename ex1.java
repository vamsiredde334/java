import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    try{
        System.out.print("Enter your age : ");
        int age=sc.nextInt();
        if(age<18){
            throw new ArithmeticException("Not Eligible to Vote");
        }
        System.out.println("you can vote");

    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("program finished");
    }
    }
}
