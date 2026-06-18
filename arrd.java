import java.util.Scanner;
public class arrd {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Name of crickter is");
        String name=sc.nextLine();
        System.out.println("enter the number of innings");
        int[] score = new int[sc.nextInt()];
        System.out.println("enter the score in each innings");
        for(int i=0; i<score.length; i++){
            score[i]=sc.nextInt();
            
        }int highest = score[0];
        int lowest=score[0];
        System.out.println("scoring");
        for(int i=0; i<score.length; i++){
            System.out.println(score[i]);

        }
        for(int i=0; i<score.length; i++){
            sum+=score[i];
            if(score[i]<lowest){
            lowest=score[i];
            }
            if(score[i]>highest){
            highest=score[i];
            }
            
        
        }
        double avg= (double) sum / score.length;
        System.out.println("the full score in all innings is : "+sum);
        System.out.println("lowest score is : "+lowest);
        System.out.println("highest score is : "+highest);
        System.out.println("average score in all iniings of "+name+ " is : " +avg);
    }

}
