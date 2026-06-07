import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your a:");
        int a = sc.nextInt();
        System.out.println("enter your b:");
        int b = sc.nextInt();
        System.out.println("enter your c:");
        int c = sc.nextInt();
        int percentage = ((a+b+c)/3);
        System.out.println(percentage);

    }
}
