// ASSIGNMENT 1 (Q10(4))

class Sphere implements VolumeOfShape {
    double r = 4;
    public void volume() {
    double v;
    v = (4*3.14*r*r*r)/3;
    System.out.println("VOLUME OF SPHERE: " +v);
    }
    public static void main(String[] args) {
    VolumeOfShape v1 = new Sphere();
    v1.volume();
    }
}