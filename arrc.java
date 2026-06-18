import java.util.Scanner;

public class arrc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[4];
        int sum=0;

        System.out.println("Enter 4 marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Marks are:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        for(int i=0; i<marks.length; i++){
            sum += marks[i];
            
        }
        System.out.println(sum);
    }
}
