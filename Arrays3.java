import java.util.*;
public class Arrays3 {
    public static void main(String args[]){
        System.out.print("Enter how many elements you want to enter: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] numbers = new int[n];
        fillArray(numbers, n);
        printArray(numbers);
        System.out.print("Enter the element whose number of occurences you wanna check: ");
        int element = scan.nextInt();
        System.out.print(element + " occurs " + getOccurences(numbers,element,n) + " times.");
    }
    private static int getOccurences(int[] numbers, int element, int n) {
        int occ=0;
        for(int i=0; i<n; i++){
            if(element == numbers[i])
                occ++;
        }
        return occ;
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
