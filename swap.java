import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elements ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int start=0;
        int end=a.length-1;
        System.out.println("enter the elements");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();

        }
        while (start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;

            
        }
        System.out.println("Swapped array is");
        for(int i=0; i<n; i++){
        System.out.println(a[i]);
        }

        }
}
