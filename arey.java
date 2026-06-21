import java.util.Scanner;
public class arey {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the n");
        int n=sc.nextInt();
        int fact=1;
        for(int i=0; i<=n; i++){
            fact*=i;
            
        }
        System.out.println(fact);
    }    
}
