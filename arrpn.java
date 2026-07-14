import java.util.Scanner;
public class arrpn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements should be in array : ");
        int n= sc.nextInt();
        int[] num = new int[n];
        System.out.println("enter the elements : ");
        for(int i=0; i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int positivecount=0;
        int neagitivecount=0;
        int zerocount=0;
        int evencount=0;
        int oddcount=0;
       for (int i = 0; i < num.length; i++) {

    if (num[i] > 0) {
        positivecount++;
    }
    else if (num[i] < 0) {
        neagitivecount++;
    }
    else {
        zerocount++;
    }

    if (num[i] % 2 == 0) {
        evencount++;
    } else {
        oddcount++;
    }
}
        System.out.println("positive count numbers are : "+positivecount);
        System.out.println("neagitive count numbers are : "+neagitivecount);
        System.out.println("zero count numbers are : "+zerocount);
        System.out.println("even count numbers are : "+evencount);
        System.out.println("odd count numbers are : "+oddcount);
    }
}
