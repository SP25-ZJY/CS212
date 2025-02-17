package lecture_note_4_5.zee_point;
/***
 * @author Zee
 * @version 1.0
 * */

public class Point {

    double x;
    double y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double byX, double byY){
        this.x += byX;
        this.y += byY;
    }

    public double distance(Point other){
        double dX = (this.x - other.x) * (this.x - other.x);
        double dY = (this.y - other.y) * (this.y - other.y);
        return Math.sqrt( dX + dY);
    }

    public static double distance(Point s, Point t){
        double dX = (s.x - t.x) * (s.x - t.x);
        double dY = (s.y - t.y) * (s.y - t.y);
        return Math.sqrt( dX + dY);
    }

    public boolean isFirstQuadrant(){
        return this.x > 0 && this.y > 0;
    }
    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if ( !(o instanceof Point other)) return false;
        return this.x == other.x && this.y == other.y;
    }
}
