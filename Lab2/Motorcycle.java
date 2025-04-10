public class Motorcycle extends Vehicle{

    public String hasSideCar;
    
    public Motorcycle(String brand, String fuelType, String hasSidecar,int speed, int numDoors) {
        super(brand, fuelType,speed);
        this.hasSideCar = hasSidecar;
    }
       @Override
       public void displayInfo() {
        System.out.println("The Motorcycle has sideCar? " + hasSideCar);
       }

}
