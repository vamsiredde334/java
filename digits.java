import java.util.Scanner;
public class digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the word ");
        String word=sc.nextLine();
        int count=0;
        for(int i=0; i<word.length(); i++ ){
            char ch=word.charAt(i);
            if(ch>='0' && ch<='9'){
                count++;
            }



        }System.out.println("number of digits "+count);
    }}