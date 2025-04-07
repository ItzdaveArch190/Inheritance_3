public class Students extends Person {

    String GradeLevel;

    public Students(String name, int id, String GradeLevel) {
        super(name, id);
        this.GradeLevel = GradeLevel;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + GradeLevel);
    }
}
