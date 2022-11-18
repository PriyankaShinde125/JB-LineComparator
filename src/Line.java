public class Line {
    int x1;
    int y1;
    int x2;
    int y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        Line lineObj = ((Line) obj);
        if (lineObj.x1 == this.x1 && lineObj.x2 == this.x2 && lineObj.y1 == this.y1 && lineObj.y2 == this.y2)
            return true;
        else
            return false;
    }
}
