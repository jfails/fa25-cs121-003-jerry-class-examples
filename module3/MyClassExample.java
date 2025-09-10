import java.awt.Point;

public class MyClassExample {

    public static void main(String[] args) {
        Point myPoint1 = new Point();
        Point myPoint2 = new Point(4, 5);
        Point myPoint3 = myPoint2;
        myPoint3.setLocation(6, 8);

        System.out.println(myPoint1.toString());
        System.out.println(myPoint2.toString());
        System.out.println(myPoint3.toString());
    }
}