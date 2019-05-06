package pl.edu.ur.oopl7.zad1.person;

import java.util.Date;

/**
 */
public interface PersonInterface {

    void setName(String name);

    void setSurname(String surname);

    void setDateOfBirth(Date date);

    void setSex(char sex);

    String getName();

    String getSurname();

    Date getDateOfBirth();

    char getSex();
}
