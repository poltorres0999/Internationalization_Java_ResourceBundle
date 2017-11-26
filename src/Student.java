
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Student extends Person {

    private long FNumber;
    private List<Subject> subjects;
    private int Course;


    public Student (String Name, String Surname1, String Surname2, int Age, String Direction, long ID, long FNumber,
                    List<Subject> subjects, int Course) {

        super(Name, Surname1, Surname2, Age, Direction, ID);
        this.FNumber = FNumber;
        this.subjects = subjects;
        this.Course = Course;
    }

    public void printStudent (String language, String country) {

        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", new Locale(language, country));
        this.printPerson(language,country);

        System.out.println("**********" + messages.getString("Student") + "**********\n");
        System.out.println(messages.getString("FileNumber") + Long.toString(this.FNumber) + "\n");
        System.out.println(messages.getString("Course") + Integer.toString(this.Course) + "\n");
        System.out.println("**********" + messages.getString("Subjects") + "**********\n");

        for (Subject s: this.subjects) {

            s.printSubject(language, country);
        }

    }
}
