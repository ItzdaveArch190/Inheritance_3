public class Teacher extends Person{

    String subject;
    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject); 
   }
}
