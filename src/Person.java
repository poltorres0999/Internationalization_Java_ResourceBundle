import java.util.Locale;
import java.util.ResourceBundle;

public class Person {

    private String Name;
    private String Surname1;
    private String Surname2;
    private int Age;
    private String Direction;
    private long ID;

    public Person (String Name, String Surname1, String Surname2, int Age, String Direction, long ID) {
        this.Name = Name;
        this.Surname1 = Surname1;
        this.Surname2 = Surname2;
        this.Age = Age;
        this.Direction = Direction;
        this.ID = ID;
    }

    public void printPerson (String language, String country) {

        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", new Locale(language, country));
        System.out.println(messages.getString("Name") + this.Name + "\n");
        System.out.println(messages.getString("Surname1") + this.Surname1 + "\n");
        System.out.println(messages.getString("Surname2") + this.Surname2 + "\n");
        System.out.println(messages.getString("Age") + Integer.toString(this.Age) + "\n");
        System.out.println(messages.getString("Direction") + this.Direction + "\n");
        System.out.println(messages.getString("ID") + Long.toString(this.ID) + "\n");
    }


}
