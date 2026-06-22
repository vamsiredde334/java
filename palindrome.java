import java.util.Scanner;;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to be checked : ");
        int num=sc.nextInt();
        int original=num;
        int reverse=0;
        while (num!=0) {
            int digit = num%10;
            reverse=reverse*10+digit;
            num/=10;    
        }
        System.out.println("your reversd number is " +reverse);

        if(reverse==original){
        System.out.println("its palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
