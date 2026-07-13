import java.util.Scanner;
public class allcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ");
        String na=sc.nextLine();
        int alphabet=0;
        int digit=0;
        int space=0;
        int special=0;

        for(int i=0; i<na.length(); i++){
            char ch= na.charAt(i);
            if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
                alphabet++;
            }
            else if(ch>='0' && ch<='9'){
                digit++;
            }
            else if(ch ==' '){
                space++;

            }
            else{
                special++;
            }
        }System.out.println(na+" has : ");
        System.out.println(alphabet+" alphabets");
        System.out.println(digit+" digits");
        System.out.println(space+" spaces");
        System.out.println(special+" special charecters");

    }
}
