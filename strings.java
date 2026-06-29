import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your name");
    String name=sc.nextLine();
    System.out.println("Hello "+name);
    System.out.println("characters of you name is "+name.length()+1 +" letters");
    System.out.println("First letter of your name is "+name.charAt(0));
    System.out.println("last letter of your name is "+name.charAt(name.length()-1));
}}
