import java.util.Scanner;
public class sumloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int sum=0;
        while (num !=0) {
        int digit=num%10;
        sum=sum+digit;
        num/=10;
            
        }
        System.out.println(+sum);
    }
}
