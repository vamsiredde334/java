//student management system
import java.util.Scanner;
public class studentmanagementsystem {
    public static void main(String[] args) {
// scanner class    
    Scanner sc=new Scanner(System.in);
// declaring name
    System.out.print("Enter the student name : ");
    String name= sc.nextLine();
// declaring marks
    int[] marks = new int[6];
    System.out.println("Enter the marks : ");
// declaring variables
    int sum=0;
    double avg=1;
    int max= marks[0];
    int count=0;
    

    for(int i=0; i<marks.length; i++){  
    System.out.print("telugu ");
    marks[0] =sc.nextInt();
    System.out.print("English ");
    marks[1] =sc.nextInt();
    System.out.print("Maths ");
    marks[2] =sc.nextInt();
    System.out.print("PScience ");
    marks[3] =sc.nextInt();
    System.out.print("Biology ");
    marks[4] =sc.nextInt();
    System.out.print("Social ");
    marks[5] =sc.nextInt();
    break;
    }
// printing the marks
    System.out.println("Your marks are : ");

    for(int i=0; i<marks.length; i++){
    if(marks[i]<=100){
    System.out.println(marks[i]);
    }
    else {
        System.out.println("Check marks again !!!");
    }
    }
// sum
    for(int i=0; i<marks.length; i++){
        sum+=marks[i];
    }
System.out.println("your total is : "+sum);
// average
    for(int i=0; i<marks.length; i++){
        avg=sum/6;
    }
    System.out.println("your average is : " +avg);
// highest marks
    for(int i=0; i<marks.length; i++){
        if(marks[i]>max){
            max=marks[i];
        }
    } System.out.println("your highest mark is :" +max);
// lowest meet
int min = marks[0];
    for(int i=0; i<marks.length; i++){
        if(marks[i]<min){
            min=marks[i];
        }
    }System.out.println("your lowest mark is :" +min);
    for(int i=0; i<marks.length; i++){
        if(marks[i]<33){
        count++;
        }
        
    }System.out.println("you failed in  : "+count);
    if(avg>90 && avg<100){
        System.out.println("you have passed in Grade O");}
    if(avg>80 && avg<90){
        System.out.println("you have passed in Grade A+");}
    if(avg>70 && avg<80){
        System.out.println("you have passed in Grade A");}
    if(avg>60 && avg<70){
        System.out.println("you have passed in Grade B+");}
    if(avg>50 && avg<60){
        System.out.println("you have passed in Grade B");}
    } 

}

