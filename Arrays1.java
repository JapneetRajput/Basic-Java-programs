import java.util.*;
public class Arrays1 {
    public static void main(String args[]){
        System.out.print("Enter how many elements you want to enter: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] numbers = new int[20];
        fillArray(numbers, n);
        printArray(numbers);
    }
    private static void printArray(int[] numbers) {
        System.out.println("The elements are: ");
        System.out.print(Arrays.toString(numbers));
    }

    private static void fillArray(int[] numbers, int n) {
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Enter the element: ");
            numbers[i] = scan.nextInt();
        }
    }
}
