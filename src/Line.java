public class Line implements Comparable<Line> {
    double length;
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.length = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        Line lineObj = ((Line) obj);
        return this.length == lineObj.length;
    }

    @Override
    public int compareTo(Line lineObj) {
        return Double.compare(this.length, lineObj.length);
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
