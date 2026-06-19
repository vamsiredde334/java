import java.util.Scanner;
public class arre{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the elements " );
    int n= sc.nextInt();
    int[] ani= new int[n];
    System.out.println("enter the elements  ");

    for(int i=0; i<ani.length; i++){
        ani[i]=sc.nextInt();
    
    }
    int count=0;
    for (int i = 0; i < ani.length; i++) {
            if (ani[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even Count = " + count);
    }
}
