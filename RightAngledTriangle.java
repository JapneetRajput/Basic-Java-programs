// Assignment1 Q2

import java.util.*;
import java.lang.Math;
class RightAngledTriangle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER BASE LENGTH OF TRIANGLE: ");
        double b = sc.nextDouble();
        System.out.println("ENTER HEIGHT OF TRIANGLE: ");
        double h = sc.nextDouble();
        double hyp = Math.sqrt(b*b+h*h);
        System.out.println("THE LENGTH OF HYPOTENUSE IS: " +hyp);
    }
}