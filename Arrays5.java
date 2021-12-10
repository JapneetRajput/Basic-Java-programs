import java.util.*;
public class Arrays5{
    public static void main(String args[]){
        System.out.print("Enter how many elements you want to enter: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] numbers = new int[n];
        fillArray(numbers, n);
        printArray(numbers);
        oddbeforeeven(numbers, n);
        System.out.print(Arrays.toString(numbers));
    }
    private static void oddbeforeeven(int[] numbers, int n) {
        int[] numbers1 = new int[n];
        int m=0, k=n-1;
        for(int i=0, j=0; i<n; i++){
            if(numbers[i]%2==1)
                numbers1[j++] = numbers[i];
            else
                numbers1[k--] = numbers[i]; 
        }
        copyArray(numbers1, numbers);
    }
    private static void copyArray(int[] numbers1, int[] numbers) {
        for(int i=0; i<numbers.length; i++){
            numbers[i] = numbers1[i];
        }
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
