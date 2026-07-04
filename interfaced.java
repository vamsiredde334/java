interface Animal{
        void sound();
}
class  Dog implements Animal{
    @Override
    public void sound(){
    System.out.println("Dog Barks");
    }
}
public class interfaced {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();;
    }
}
