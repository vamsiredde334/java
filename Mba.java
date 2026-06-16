import java.util.Scanner;

public class Mba {

    static int maximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = maximum(a, b);

        System.out.println("Largest = " + result);
    }
}