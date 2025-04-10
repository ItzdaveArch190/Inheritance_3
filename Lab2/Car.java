class Car extends Vehicle{

    int numDoors;

    public Car(String brand, String fuelType, int speed, int numDoors) {
        super(brand, fuelType, speed);
        this.numDoors = numDoors;
    }
        @Override
        public void displayInfo() {
         
            super.displayInfo();
            System.out.println("Number of Doors: " + numDoors);
     }
}
