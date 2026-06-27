import java.util.Scanner;

public class delete {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in); 
        System.out.println("enter how many elements you want"); 
        int m=sc.nextInt();  
        int[] a=new int[m]; 
        int[] b=new int[m-1];
        System.out.println("enter elements");
        for(int i=0; i<m; i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter the position at you have to delete : ");
        int position=sc.nextInt();
        for(int i = 0; i < position; i++){
            b[i] = a[i];
        
        }
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
        }
}
