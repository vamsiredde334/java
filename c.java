import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your a:");
        double a = sc.nextDouble();
        System.out.println("enter your operation +,-,*,/,^:");
        char s=  sc.next().charAt(0);
        System.out.println("enter your b:");
        Double b = sc.nextDouble();
        double result=0;
        switch (s) {
            case '+' -> result = a+b;
            case '-' -> result = a-b;
            case '*' -> result = a*b;
            case '/' -> result = a/b;
            case '^' -> result = Math.pow(a, b);
        }
        System.out.println("Result: " + result);

    }
}
