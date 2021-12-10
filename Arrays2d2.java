import java.util.*;
public class Arrays2d2 {
    public static void main(String args[]){
        System.out.print("Enter n and m of n*m Array: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt(), m= scan.nextInt();
        int[][] numbers = new int[n][m];
        fillArray(numbers, n, m);
        printArray(numbers);
        maxOfEachRowOfArray(numbers, n, m);
        minOfEachRowOfArray(numbers, n, m);
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
    private static void maxOfEachRowOfArray(int[][] numbers, int n, int m) {
        int max = numbers[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(max < numbers[i][j])
                    max = numbers[i][j];
            }
            System.out.println("Max of row " + (i+1) + " = " + max);
        }
    }
    private static void minOfEachRowOfArray(int[][] numbers, int n, int m) {
        int min = numbers[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(min > numbers[i][j])
                    min = numbers[i][j];
            }
            System.out.println("Min of row " + (i+1) + " = " + min);
        }
    }
}