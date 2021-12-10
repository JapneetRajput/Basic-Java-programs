// Assignment1 Q1

import java.util.*;
class Cylinder {
public static final double pi = 3.14;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RADIUS & HEIGHT: ");
        double r = sc.nextInt();
        double h = sc.nextInt();
        double SArea = 2*pi*r*(r+h);
        double Volume = pi*r*r*h;
        System.out.println("SURFACE AREA OF CYLINDER IS: " +SArea);
        System.out.println("VOLUME OF CYLINDER IS : " +Volume);
    }
}