import java.util.*;
public class Arrays4 {
    public static void main(String args[]){
        System.out.print("Enter how many elements you want to enter: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] numbers = new int[n];
        fillArray(numbers, n);
        printArray(numbers);
        System.out.println("max = " + maxArray(numbers,n));
        System.out.print("min = " + minArray(numbers,n));
    }
    private static int maxArray(int[] numbers, int n) {
        int max= numbers[0];
        for(int i=1; i<n; i++){
            if(max<numbers[i])
                max = numbers[i];
        }
        return max;
    }
    private static int minArray(int[] numbers, int n) {
        int min= numbers[0];
        for(int i=1; i<n; i++){
            if(min>numbers[i])
                min = numbers[i];
        }
        return min;
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
