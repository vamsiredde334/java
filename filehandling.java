import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
public class filehandling {
    public static void main(String[] args) throws IOException{
        File file=new File("data.txt");
        BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
        BufferedReader br=new BufferedReader(new FileReader( "data.txt"));
        bw.write("vamsi");
        bw.newLine();
        bw.write("rahul");
        bw.newLine();
        bw.write("priya");
        bw.newLine();
        bw.close();

        String line;
        while ((line=br.readLine())!=null) {
            System.out.println(line);
        }


        file.delete();

        
        
        System.out.println("Program completed sucessfully");

    }
}
