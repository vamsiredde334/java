import java.util.Scanner;
public class weignt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the weight what you choose");
        System.out.print("enter the kgs mean 1");
        System.out.print("if lbs mean 2");
        int choose = sc.nextInt();
        if(choose==1){
            System.out.println("enter the weight in kgs");
            double weight = sc.nextDouble();
            double weiightinlbs = weight*2.20462;
            System.out.println("the weight in lbs is: " + weiightinlbs);

        }
        else if(choose==2){
            System.out.println("enter the weight in lbs");
            double weight = sc.nextDouble();
            double weightinkgs = weight/2.20462;
            System.out.println("the weight in kgs is: " + weightinkgs);
        }

        }
}
