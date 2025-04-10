public class Vehicle {

    private String brand, fuelType;
    private int speed;
   

       Vehicle(String brandName, String TypeofFuel, int Speed) {

        this.brand = brandName;
        this.fuelType = TypeofFuel;
        this.speed = Speed;

       }
       

        //Getter Methods
           public String getBrandName() {
           return brand;
         }
           public String getFueltype() {
           return fuelType;
       }
           public int getCarSpeed() {
             return speed;
       }
       //method display Infos
       public void displayInfo() {
        System.out.println("Brand Name: " +  brand);
        System.out.println("Type Of Fuel: " + fuelType);
        System.out.println("Speed (kph): " + speed);
       }


}
