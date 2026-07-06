import java.util.ArrayList;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("vamsi");
        list.add("rahul");
        list.add("priya");
        list.add("rohit");

        
        for(String name : list){
            System.out.println(name);
        }
    }
}