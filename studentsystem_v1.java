//STUDENT MANAGEMENT SYSTEM
import java.util.Scanner;
public class studentsystem_v1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
//design
    System.out.println("*================================================*");
    System.out.println("*                                                *");
    System.out.println("*          STUDENT MANAGEMENT SYSTEM             *");
    System.out.println("*                                                *");
    System.out.println("*================================================*");
//declare array
System.out.println();
    System.out.print("Enter the number of Students : ");
    int students=sc.nextInt();
    System.out.print("Enter the number of subjects : ");
    int subjects=sc.nextInt();
//array
    System.out.println("enter the marks of students");
    int[][] studentinfo=new int[students][subjects];
    for(int i=0; i<students; i++){
        System.out.println("Enter the marks of Student "+ (i+1) +" :");
        for(int j=0; j<subjects; j++){
            System.out.println("subject "+(j+1)+" : ");
            studentinfo[i][j]=sc.nextInt();    
        }
    }System.out.println();
//design 2 
    System.out.println("*================================================*");
    System.out.println("*                MAIN    MENU                    *");
    System.out.println("*================================================*");
System.out.println("1. Display All Marks\n" + //
        "2. Display Marks of One Student\n" + //
        "3. Highest Mark\n" + //
        "4. Lowest Mark\n" + //
        "5. Total of Each Student\n" + //
        "6. Average of Each Student\n" + //
        "7. Search a Mark\n" + //
        "8. Subject-wise Highest Marks\n" + //
        "9. Subject-wise Lowest Marks\n" + //
        "10. Exit"); 
        System.out.print("Select the menu : ");
        int menu=sc.nextInt();
        int neq =menu;
//111111
    if(menu==1){
    for(int i=0; i<students; i++){
        System.out.println("Marks of Student "+ (i+1) + " is");
        for(int j=0; j<subjects; j++){
            System.out.print("subject "+(j+1)+" : ");
        System.out.println(studentinfo[i][j]);    
        }
        System.out.println();
    }
    }
//222222
    if(menu==2){
        System.out.print("Select a student for marks : ");
        int select=sc.nextInt();
    for(int i=select-1; i<select; i++){
        System.out.println("Marks of Student "+ (i+1) + " is");
        for(int j=0; j<subjects; j++){
            System.out.print("subject "+(j+1)+" : ");
        System.out.println(studentinfo[i][j]);    
        }
        System.out.println();
    } 
    }
//3333333
    if(menu==3){
        int max=studentinfo[0][0];
        for(int i=0; i<students; i++){
        for(int j=0; j<subjects; j++){
            if(studentinfo[i][j]>max){
                max=studentinfo[i][j];
            }   
        }   
    }System.out.println("Highest mark is : "+max);
    }
//44444444
    if(menu==4){
        int min=studentinfo[0][0];
        for(int i=0; i<students; i++){
        for(int j=0; j<subjects; j++){
            if(studentinfo[i][j]<min){
                min=studentinfo[i][j];
            }   
        }   
    }System.out.println("Lowest mark is : "+min);
    }
//555555555
    if(menu==5){
        
    for(int j=0; j<subjects; j++){
        int sum=studentinfo[0][0];
        for(int i=0; i<students; i++){
            sum+=studentinfo[i][j];
            
            }   System.out.println(sum);
        } 
    }
//66666666
    if(menu==6){
    for(int j=0; j<subjects; j++){
        int sum=studentinfo[0][0];
        int avg=0;
        for(int i=0; i<students; i++){
            sum+=studentinfo[i][j];
            avg=sum/subjects;
            
            }   System.out.println(avg);
        } 
    }
//77777777
if(menu==7){
    System.out.println("enter element to search");
        int key=sc.nextInt();
        boolean find=false;
        for(int i = 0; i < students; i++){
            for(int j = 0; j < subjects; j++){
                if(studentinfo[i][j]==key){
                    System.out.println("Element found at student " +(i+1) + " subject " + (j+1));
                    find=true;
                }
            }
    if(find){
        break;}
    }
    if(!find){
        System.out.println("element not found");
    }}
//8888888888888
    if(menu==8){
        
        for(int i=students-1; i>=0; i--){
            int max=studentinfo[0][0];
            for(int j=subjects-1; j>=0; j--){
            if(studentinfo[i][j]>max){
                max=studentinfo[i][j];
                System.out.println("Highest mark is : "+max);
                
            }   

        }   
    }
    }

//9999999999
        if(menu==9){
        int min=studentinfo[0][0];
        for(int i=0; i<students; i++){
        for(int j=0; j<subjects; j++){
            if(studentinfo[i][j]<min){
                min=studentinfo[i][j];
                min++;
            }   System.out.println("Lowest mark is : "+min);
        }   
    }
    }
//101010101010
    if(menu==10){
        System.out.print("exit : ");
    

    }


    }
    }












    




    