package pl.edu.ur.oopl7.zad1.student;

import pl.edu.ur.oopl7.zad1.person.Person;
import pl.edu.ur.oopl7.zad1.person.PersonInterface;

/**
 */
public class Student extends Person implements PersonInterface, StudentInterface {

    public void setIndexNumber(int indexNumber) {

    }

    public void setTypeOfStudies(String typeOfStudies) {

    }

    public void setFieldOfStudy(String fieldOfStudy) {

    }

    public void setYear(int year) {

    }

    public int getIindexNumber() {
        return 0;
    }

    public String getTypeOfStudies() {
        return null;
    }

    public String getFieldOfStudy() {
        return null;
    }

    public int getYear() {
        return 0;
    }

    @Override
    public String showInfo() {
        return super.showInfo();
    }
}
