import java.util.Scanner;

public class Mab {

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = square(num);

        System.out.println("Square = " + result);
    }
}
