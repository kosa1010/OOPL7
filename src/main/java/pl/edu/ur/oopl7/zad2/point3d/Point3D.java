package pl.edu.ur.oopl7.zad2.point3d;

import pl.edu.ur.oopl7.zad2.point2d.Point2D;
import pl.edu.ur.oopl7.zad2.point2d.Point2DInterface;

/**
 */
public class Point3D extends Point2D implements Point2DInterface, Point3DInterface{

    public int getZ() {
        return 0;
    }

    public void setZ(int z) {

    }

    @Override
    public void randomPoint() {
        super.randomPoint();
    }
}
