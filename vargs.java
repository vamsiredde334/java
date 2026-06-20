public class vargs {
    public static void main(String[] args) {
        System.out.println(add(1,2,3));
    }
    static int add(int... num){
        int sum=0;

        for(int number:num){
            sum+=number;

        }
        return sum ;
        
    }
}
