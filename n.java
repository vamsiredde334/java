import java.util.Scanner;
public class n {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter upto");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println((i*(i+1))/2);

        }
    }  
}
