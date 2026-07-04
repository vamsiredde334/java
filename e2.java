class Vehicle{
    void start(){
        System.out.println("Vehicle started");
    }
}
class car extends Vehicle{
    void drive(){
        System.out.println("Car is driving ");
    }
}
public class e2 {
    public static void main(String[] args) {
        car c1= new car();
        c1.start();
        c1.drive();
    }
}
