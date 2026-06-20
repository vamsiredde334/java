import java.util.Scanner;

public class arrta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] vehicles = {"bike", "car", "lorry", "plane", "truck"};

        boolean isfound = false;

        System.out.println("Enter the target you have to find:");
        String target = sc.nextLine();

        for (int i = 0; i < vehicles.length; i++) {

            if (vehicles[i].equals(target)) {
                System.out.println("Element found at index: " + i);
                isfound = true;
                break;
            }
        }

        if (!isfound) {
            System.out.println("Element not found!");
        }
    }
}


