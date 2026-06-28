import java.util.Scanner;

public class tdsum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter the elements:");

        // Input
        System.out.println("elements of row");
        for(int i = 0; i < r; i++){
            System.out.println("elements of column");
            for(int j = 0; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }int sum=0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                sum+=a[i][j];
            }
    }System.out.println("sum of whole matrix is"+sum);
}
}