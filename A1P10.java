import java.util.*;

interface Functions{
	float cube(float side);
	float cuboid(float l,float b,float h);
	float sphere(float r);
}
class Volume implements Functions
{
    	public float cube(float side){
			return (side * side * side);
		}
    	public float cuboid(float l,float b,float h){
			return (l * b * h);
    	}
    	public float sphere(float r){
			return (4f / 3 * 3.14f * r * r * r);
		}
}
public class A1P10{
    public static void main(String args[]){
		float l,b,h,r,volume;
		Scanner sc = new Scanner(System.in);
		Volume v = new Volume();
		System.out.println();
		System.out.print("Enter length of side of cube: ");
		l=sc.nextFloat();
		volume=v.cube(l);
		System.out.println("\nVolume of the cube is "+volume);
		System.out.println("\nEnter length, breadth and height of cuboid:");
		l=sc.nextFloat();
		b=sc.nextFloat();
		h=sc.nextFloat();
		volume=v.cuboid(l,b,h);
		System.out.println("\nVolume of the cuboid is "+volume);
		System.out.print("\nEnter radius of sphere: ");
		r=sc.nextInt();
		volume=v.sphere(r);
		System.out.println("\nVolume of the sphere is "+volume);
		
    }
}