import java.util.Locale;
import java.util.ResourceBundle;

public class Subject {

    private int ID;
    private String Name;
    private int Credits;

    public Subject (int ID, String Name, int Credits) {

        this.ID = ID;
        this.Name = Name;
        this.Credits = Credits;
    }

    public void printSubject (String language, String country) {

        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", new Locale(language, country));

        System.out.println("***********************************************\n");
        System.out.println(messages.getString("ID") + Integer.toString(this.ID) + "\n");
        System.out.println(messages.getString("SubjectName") + this.Name + "\n");
        System.out.println(messages.getString("Credits") + Integer.toString(this.Credits) + "\n");
        System.out.println("***********************************************\n");

    }

}
