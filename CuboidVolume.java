// ASSIGNMENT 1 (Q10(3))

class CuboidVolume implements VolumeOfShape {
    int w = 10, h = 11, l = 12;
    public void volume() {
    int v;
    v = l*h*w;
    System.out.println("VOLUME OF CUBOID: " +v);
    }
    public static void main(String[] args) {
    VolumeOfShape v1 = new CuboidVolume();
    v1.volume();
    }
}