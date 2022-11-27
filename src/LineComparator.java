import java.util.Scanner;

public class LineComparator {
    public static void main(String[] args) {
        int x;
        int y;
        System.out.println("Welcome to line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinate first line point 1 : ");
        x = sc.nextInt();
        y = sc.nextInt();
        Point p1 = new Point(x, y);
        System.out.println("Enter co-ordinate first line point 2 : ");
        x = sc.nextInt();
        y = sc.nextInt();
        Point p2 = new Point(x, y);
        Line line1Obj = new Line(p1, p2);
        System.out.println("Length of Line 1 = " + line1Obj.getLength());

        System.out.println("Enter co-ordinate second line point 1 : ");
        x = sc.nextInt();
        y = sc.nextInt();
        Point p3 = new Point(x, y);
        System.out.println("Enter co-ordinate second line point 2 : ");
        x = sc.nextInt();
        y = sc.nextInt();
        Point p4 = new Point(x, y);
        Line line2Obj = new Line(p3, p4);
        System.out.println("Length of Line 2 = " + line2Obj.getLength());

        int compareOutput = line1Obj.compareTo(line2Obj);
        switch (compareOutput) {
            case 1:
                System.out.println("First Line is greater than second line");
                break;
            case -1:
                System.out.println("First Line is less than second line");
                break;
            default:
                System.out.println("Both Lines are equals");
                break;
        }
    }
}