public class arreve{
    public static void main(String[] args) {
        int[] ev={1,2,3,4,5,6,7};
        int largest=ev[0];
        int second=ev[0];
        for(int i=1; i<ev.length; i++){
            if(ev[i]>largest){
                second=largest;
                largest=ev[i];}
                else if(ev[i]>second){
                    second=ev[i];
                }
        }System.out.println(largest);
        System.out.println(second);
    }
}
