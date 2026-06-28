import java.util.Scanner;

public class tdsearch {
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
        }System.out.println("enter element to search");
        int key=sc.nextInt();
        boolean find=false;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(a[i][j]==key){
                    System.out.println("Element found at Row " + i + " Column " + j);
                    find=true;
                }
            }
if(find){
        break;}
    }
    if(!find){
        System.out.println("element not found");
    }
}
}
