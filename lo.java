import java.util.Scanner;
public class lo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter upto");
        int i = sc.nextInt();
        for(i=0; i<=100; i++){
            if(i%2!=0){
                System.out.println("hi" + i);
            }
        }

    }
}