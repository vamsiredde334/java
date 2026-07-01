public class sort {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,6,7,90};
        boolean sort=true;
        for(int i=0; i<ar.length-1; i++ ){
            if(ar[i]>ar[i+1]){
            sort=false;

            }
        }
        if(sort){
            System.out.println("this is sorted array");

        }
        else{
            System.out.println("not sorted");
        }
    }
    
}
