public class Staff extends Person {

    String department;

    Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;

    }
     @Override
     void displayInfo() {
            super.displayInfo();
            System.out.println("Department: " + department);
     }
    
}
