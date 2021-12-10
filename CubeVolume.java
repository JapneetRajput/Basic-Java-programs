// ASSIGNMENT 1 (Q10(2))

class CubeVolume implements VolumeOfShape {
    int l = 26;
    public void volume() {
    int v;
    v = l*l*l;
    System.out.println("VOLUME OF CUBE: " +v);
    }
    public static void main(String[] args) {
    VolumeOfShape v1 = new CubeVolume();
    v1.volume();
    }
}