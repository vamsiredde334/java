import java.util.Scanner;
public class power {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number : ");
    int square= sc.nextInt();
    int sq=1;
    int sum=0;
    for(int i=0; i<=square; i++){
        System.out.println( +sq);
        sq=i*i;
        sum+=sq;

    }
        System.out.println(sum);
    }
}
