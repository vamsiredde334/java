import java.util.Scanner;
public class salarybonus {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the name: ");
        String name = sc.nextLine();
        System.out.print("salary is :" );
        double salary = sc.nextDouble();
        if(salary>=50000 && salary<60000){
            double bonus = salary*1.2;
            System.out.print(salary*0.2);
            System.out.print("your salary with bonus is "+bonus);
        }
        else if (salary>=60000 && salary<70000){
            double bonus = salary*1.3;
            System.out.print(salary*0.3);
            System.out.print("your salary with bonus is "+bonus);
        }
        else if (salary>=70000){
            double bonus = salary*1.4;
            System.out.print(salary*0.4);
            System.out.print("your salary with bonus is "+bonus);
        }
    }
}
