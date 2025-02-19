package lecture_note_4_5.zee_point;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point();
        Point q = new Point(3, 4);
        Point r = p;

        double distance = p.distance(q);

        System.out.println("Distance p-q: " + distance);
        System.out.println(p == q);
        System.out.println("Distance p-q: " + Point.distance(p, q));

        p.move(2,5);
        System.out.println("Distance p-q: " + Point.distance(p, q));
        p.move(2,-15);

        if (p.isFirstQuadrant())
            System.out.println("p: is in quadrant 1");
    }
}
