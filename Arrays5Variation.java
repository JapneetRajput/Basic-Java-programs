import java.util.*;
public class Arrays5Variation {
    public static void main(String args[]){
        System.out.print("Enter how many elements you want to enter: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] numbers = new int[n];
        fillArray(numbers, n);
        printArray(numbers);
        oddBeforeEvenIndex(numbers, n);
    }
    private static void oddBeforeEvenIndex(int[] numbers, int n) {
        int[] numbers1 = new int[n];
        if(n%2==1){
            for(int i=0, j=0; i<n/2+1; i++, j+=2){
                numbers1[i] = numbers[j];
            }
            for(int i=n/2+1, j=1; i<n; i++, j+=2){
                numbers1[i] = numbers[j];
            }
        }
        else{
            for(int i=0, j=0; i<n/2; i++, j+=2){
                numbers1[i] = numbers[j];
            }
            for(int i=n/2, j=1; i<n; i++, j+=2){
                numbers1[i] = numbers[j];
            }
        }
        System.out.print(Arrays.toString(numbers1));
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
