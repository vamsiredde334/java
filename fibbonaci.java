import java.util.Scanner;
public class fibbonaci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number  : ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=a;
            int c=a+b;
            a=b;
            b=c;
            
            
            
        }System.out.println(sum);
    }
}
