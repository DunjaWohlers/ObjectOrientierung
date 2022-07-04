import model.Student;

import java.time.Instant;
import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {
        Student studentZ=new Student("Mr. Object", "w","ABC13");
     //   studentZ.setBirthday(Instant.now().minus(10, ChronoUnit.YEARS));
        studentZ.setBirthday(Instant.now().minus(10, ChronoUnit.DAYS));
//atOffset(ZoneOffset.UTC)
        studentZ.setILike(false);

        System.out.println(studentZ.toString());
    }

}
