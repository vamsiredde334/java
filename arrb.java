import java.util.Arrays;
public class arrb {
    public static void main(String[] args) {
        int[] matrix = { 1 , 3 , 5 ,6,8,9,10};
        Arrays.fill(matrix, 6);
        for(int i=0; i<matrix.length; i++){
            System.out.println(matrix[i]);
        }
    }
}
