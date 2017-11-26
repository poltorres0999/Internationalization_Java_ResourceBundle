import java.util.ArrayList;
import java.util.List;

public class main {

    static public void main(String[] args) {

        String language;
        String country;

        if (args.length != 2) {
            language = new String("ca");
            country = new String("CA");
        } else {
            language = new String(args[0]);
            country = new String(args[1]);
        }

        Person p1 = new Person("Pol", "Torres", "Alfonso", 21, "urb.salats nº27", 48253459);
        p1.printPerson(language, country);

        List<Subject> subjects = new ArrayList<>();

        subjects.add(new Subject(15, "Maths", 9));
        subjects.add(new Subject(12, "Programming", 15));
        subjects.add(new Subject(13, "Geology", 4));

        Teacher t1 = new Teacher("Pol", "Torres", "Alfonso", 21, "urb.salats nº27", 48253459, 1000, subjects);
        t1.printTeacher(language, country);

        Student s1 = new Student("Pol", "Torres", "Alfonso", 21, "urb.salats nº27", 48253459, 15, subjects, 4);
        s1.printStudent(language, country);
    }
}
