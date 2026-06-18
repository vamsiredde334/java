import java.util.Arrays;
public class arrb {
    public static void main(String[] args) {
        int[] matrix = { 1 , 3 , 5 ,6,8,9,10};
        Arrays.sort(matrix);
        Arrays.fill(matrix, 6);
        System.out.println(Arrays.toString(matrix));
    }
}
