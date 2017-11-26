import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Teacher extends Person {

    private double Salary;
    private List<Subject> Subjects;

    public Teacher (String Name, String Surname1, String Surname2, int Age, String Direction, long ID,
                    double Salary, List<Subject> subjects) {
        super(Name, Surname1, Surname2, Age, Direction, ID);
        this.Salary = Salary;
        this.Subjects = subjects;

    }

    public void printTeacher (String language, String country) {

        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", new Locale(language, country));
        this.printPerson(language,country);

        System.out.println("**********" + messages.getString("Teacher") + "**********\n");
        System.out.println(messages.getString("Salary") + Double.toString(this.Salary) + "\n");
        System.out.println("**********" + messages.getString("Subjects") + "**********\n");

        for (Subject s: this.Subjects) {

            s.printSubject(language, country);
        }

    }
}
