package Testing;

import java.awt.*;

public class Hello {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point1);
    }
}
