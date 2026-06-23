import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter table you want : ");
        int num= sc.nextInt();
        int mul=1;
        for(int i=1; i<=10; i++){
        mul=num*i;
        System.out.println(num+"*"+i+"="+ mul);
        }
    }
}
