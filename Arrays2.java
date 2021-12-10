import java.util.*;
public class Arrays2 {
    public static void main(String args[]){
        System.out.print("Enter how many elements you want to enter: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] numbers = new int[n];
        fillArray(numbers,n);
        printArray(numbers);
        System.out.println("Sum=" + sumArray(numbers,n));
        System.out.println("Product=" + productArray(numbers,n));
        System.out.println("Average=" + averageArray(numbers,n));
    }
    private static int productArray(int[] numbers, int n) {
        int product = 1;
        for(int i=0;i<n;i++){
            product *= numbers[i];
        }
        return product;
    }
    private static int sumArray(int[] numbers, int n) {
        int sum=0;
        for(int i=0; i<n;i++){
            sum += numbers[i];
        }
        return sum;
    }
    private static int averageArray(int[] numbers, int n) {
        int avg=0, sum=0;
        for(int i=0; i<n;i++){
            sum += numbers[i];
        }
        avg = sum/n;
        return avg;
    }
    private static void printArray(int[] numbers) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArray(int[] numbers, int n) {
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Enter the element: ");
            numbers[i] = scan.nextInt();
        }
    }
}
