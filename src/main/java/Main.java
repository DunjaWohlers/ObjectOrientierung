import model.Student;

import java.time.Instant;
import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {
        Student studentZ = new Student("Mr. Object", "w", "ABC13");
        studentZ.setBirthday(Instant.now().minus(365, ChronoUnit.DAYS));
        studentZ.setILike(false);

        System.out.println(studentZ.toString());
    }

}
