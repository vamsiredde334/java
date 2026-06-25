import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            num=num+count;
            count++;

        }
    System.out.println("no of digits " + count);

    }
}
