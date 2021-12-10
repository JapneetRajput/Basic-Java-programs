import java.util.*;
public class Arrays2d1 {
    public static void main(String args[]){
        System.out.print("Enter n and m of n*m Array: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt(), m= scan.nextInt();
        int[][] numbers = new int[n][m];
        fillArray(numbers, n, m);
        printArray(numbers);
        sumOfArray(numbers, n, m);
    }
    private static void printArray(int[][] numbers) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.deepToString(numbers));
    }

    private static void fillArray(int[][] numbers, int n, int m) {
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("Enter the element: ");
                numbers[i][j] = scan.nextInt();
            }
        }
    }
    private static void sumOfArray(int[][] numbers, int n, int m) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sum += numbers[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " = " + sum);
        }
    }
}