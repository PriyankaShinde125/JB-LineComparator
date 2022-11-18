import java.util.Scanner;

public class LineComparator {
    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinate for point 1 : ");
        int line1x1 = sc.nextInt();
        int line1y1=sc.nextInt();
        System.out.println("Enter co-ordinate for point 2 : ");
        int line1x2 = sc.nextInt();
        int line1y2= sc.nextInt();
        double line1Length=Math.sqrt(Math.pow(line1x2-line1x1,2)+Math.pow(line1y2-line1y1,2));
        System.out.println("Length of Line 1 = "+line1Length);
    }
}