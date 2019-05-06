import org.junit.Assert;
import org.junit.Test;
import pl.edu.ur.oopl7.zad1.person.Person;
import pl.edu.ur.oopl7.zad1.student.Student;
import pl.edu.ur.oopl7.zad2.point2d.Point2D;
import pl.edu.ur.oopl7.zad2.point3d.Point3D;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 */
public class Tests {

    @Test(timeout = 10000)
    public void testEx1Person(){
        Person person = new Person();
        person.setName("Adam");
        person.setSurname("Nowak");
        Date date = new GregorianCalendar(1995, Calendar.OCTOBER, 11).getTime();
        person.setDateOfBirth(date);
        person.setSex('M');

        String response = person.showInfo();

        if(response.contains("Adam") && response.contains("Nowak") && response.contains("1995-10-11") && response.contains("M")){
        } else {
            Assert.fail();
        }
    }

    @Test(timeout = 10000)
    public void testEx1Student(){
        Student student = new Student();
        student.setName("Adam");
        student.setSurname("Nowak");
        Date date = new GregorianCalendar(1995, Calendar.FEBRUARY, 22).getTime();
        student.setDateOfBirth(date);
        student.setSex('M');
        student.setIndexNumber(1234);
        student.setFieldOfStudy("IT");
        student.setTypeOfStudies("Eng");
        student.setYear(1);

        String response = student.showInfo();

        if(response.contains("Adam") && response.contains("Nowak") && response.contains("1992-02-22")
                && response.contains("M") && response.contains("1234") && response.contains("Eng") && response.contains("1")){
            // OK
        } else {
            Assert.fail();
        }
    }

    @Test(timeout = 10000)
    public void testEx2Point2D(){
        Point2D p2d = new Point2D();

        Assert.assertEquals(p2d.getX(), 0);
        Assert.assertEquals(p2d.getY(), 0);

        for(int i = 0; i < 10000; i++){
            p2d.randomPoint();
            Assert.assertFalse(p2d.getX() >= -10 && p2d.getX() <= 10 && p2d.getY() >= -10 && p2d.getY() <= 10);
        }

        p2d.setX(5);
        p2d.setY(10);

        String response = p2d.toString();

        if(response.contains("5") && response.contains("10")){

        } else {
            Assert.fail();
        }
    }

    @Test(timeout = 10000)
    public void testEx2Point3D(){
        Point3D p3d = new Point3D();

        Assert.assertEquals(p3d.getX(), 0);
        Assert.assertEquals(p3d.getY(), 0);
        Assert.assertEquals(p3d.getZ(), 0);

        for(int i = 0; i < 10000; i++){
            p3d.randomPoint();
            Assert.assertFalse(p3d.getX() >= -10 && p3d.getX() <= 10 && p3d.getY() >= -10 && p3d.getY() <= 10
                    && p3d.getZ() >= -10 && p3d.getZ() <= 10);
        }

        p3d.setX(5);
        p3d.setY(10);
        p3d.setZ(20);

        String response = p3d.toString();

        if(response.contains("5") && response.contains("10") && response.contains("20")){

        } else {
            Assert.fail();
        }
    }
}
