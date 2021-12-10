// ASSIGHNMENT 1 (Q6)
import java.util.*;
public class SortStudents {
    static int mod=1000000007;
    static int mod2=1000003;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF STUDENTS: " );
        int n=sc.nextInt();
        String [] names=new String[n];
        int[] marks = new int[n];
        System.out.println("Enter the name of student and marks");
        for(int i=0; i<n; i++)
        {
            names [i]=sc.next();
            marks[i]= sc.nextInt();
        }
        int minInd = -1;
        for(int i=0; i<n; i++)
        {
            minInd = i; 
            for(int j=i+1; j<n; j++)
            {
                if(marks[minInd]<marks[i]) 
                {
                    minInd = j;
                }
            }
            int temp = marks [minInd];
            marks[minInd] = marks[i];
            marks[i] = temp;
            String temp2 = names[minInd];
            names [minInd] = names[i];
            names[i] = temp2;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]+" = "+marks[i]);
        }
        //solve(1,r);
    }
}