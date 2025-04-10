import java.util.Scanner;

public class TestVehicle {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

           

        System.out.println("Enter Car brand name: ");
        String carbrand = sc.nextLine();
        System.out.println("Enter your Fuel Type: ");
        String fuel = sc.nextLine();
        System.out.println("Enter number of the door: ");
        int cardoor = sc.nextInt();
        System.out.println("Enter the speed: ");
        int speed = sc.nextInt(); 
                   sc.nextLine();

           Car car = new Car(carbrand, fuel, speed, cardoor);

             car.displayInfo();

        System.out.println("***Motorcycle***");
        System.out.println("\n");
        System.out.println("Enter your Motorcycle brand name");
        String motorBrand = sc.nextLine();
        System.out.println("Enter your engine fuel type: ");
        String gasoline = sc.nextLine();
        System.out.println("Is your motorcycle has sidecar? :");
        String sideCar = sc.nextLine();
        System.out.println("Enter the door: ");
        int door = sc.nextInt();
        System.out.println("Enter motorcycle speed: ");
        int Speeds = sc.nextInt();
            sc.nextLine();

       Motorcycle motor = new Motorcycle(motorBrand, gasoline, sideCar, Speeds, door);
                motor.displayInfo();
            




       

      sc.close();

    }
}
