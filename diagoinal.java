import java.util.Scanner;

public class diagoinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter the elements:");

        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i+j==c-1){
                    System.out.println(+a[i][j]);
                }
            }}
}
}
