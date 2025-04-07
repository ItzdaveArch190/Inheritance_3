public class SchoolTest {
    public static void main(String[] args) {


        //Student Information
        System.out.println("============================");
        System.out.println("Students Information");
        Students student = new Students("Dave V. Besorio", 1089015, "1st year College");
        student.displayInfo();
        System.out.println("\n");

        //For teacher Information
        System.out.println("============================");
        System.out.println("Teacher Information");
        System.out.println("\n");
        Teacher SirArchie = new Teacher("Sir Archie Menesis", 111890, "Object Oriented Programming");
        SirArchie.displayInfo();

        //Staff Information
        System.out.println("\n");
        System.out.println("============================");
        System.out.println("Staff Information");
        System.out.println("\n");
        Staff worker = new Staff("Mark Justine B. Pulido", 223098, "School Service");
        worker.displayInfo();
        
    }
    
}
