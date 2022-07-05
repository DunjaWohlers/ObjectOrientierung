package model;

import java.time.Instant;
import java.util.Objects;

public class Student {
    private boolean iLike;
    private String name;
    private String sex;
    private String immatriculationNr;
    private Instant birthday;

    public Student(String name, String sex, String immatriculationNr) {

        this.name = name;
        this.sex = sex;
        this.immatriculationNr = immatriculationNr;
    }

    public Student() {
    }


    public String toString() {
        return "Name: " + name + "\n" + "Geschlecht: " + sex + "\n" + "Immatrikulationsnummer: " + immatriculationNr;
    }


    public boolean isILike() {
        return iLike;
    }

    public void setILike(boolean iLike) {
        this.iLike = iLike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImmatriculationNr() {
        return immatriculationNr;
    }

    public void setImmatriculationNr(String immatriculationNr) {
        this.immatriculationNr = immatriculationNr;
    }

    public Instant getBirthday() {
        return birthday;
    }

    public void setBirthday(Instant birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return iLike == student.iLike && name.equals(student.name) && sex.equals(student.sex) && immatriculationNr.equals(student.immatriculationNr) && birthday.equals(student.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iLike, name, sex, immatriculationNr, birthday);
    }

}
