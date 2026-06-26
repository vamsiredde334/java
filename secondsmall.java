public class secondsmall {
    public static void main(String[] args) {
        int[] a={2,4,5,3,6,9,3};
        int small =a[0];
        int second =Integer.MAX_VALUE;
        for(int i=1; i<a.length; i++){
            if(a[i]<small){
                second=small;
                small=a[i];
            }
            else if(a[i]<second && a[i]!=small){
                second=a[i];

            }

        }System.out.println("smallest number is :"+small);
        System.out.println("second smallest number is :"+second);
    }
}
