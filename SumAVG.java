// ASSIGHNMENT 1(Q5)
import java.util.*;
class SumAVG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO. OF ELEMENTS: ");
        int num = sc.nextInt();
        int[] a = new int[num];
        int sum=0;
        float avg = 0.0f, count = 0.0f;
        System.out.println("ENTER "+num+" ARRAY ELEMNTS: ");
        for(int i=0; i<num; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("");

        //System.out.println("For odd indexes:");
        for(int i=1; i<num; i+=2)
        { 
            sum = sum + a[i];
            count++;
        }
        System.out.println("FOR ODD INDEXES: ");
        for(int i=1;i<num; i+=2)
        {
            sum = sum+a[i];
            count++;
        }
        avg = sum/count;
        System.out.println("SUM IS: "+sum+" AND AVERAGE IS: "+avg+"");
        sum=0;
        count=0;
        System.out.println("FOR EVEN INDEXES:");
        for(int i=0;i<num; i+=2)
        {
            sum = sum+a[i];
            count++;
        }
        avg = sum/count;
        System.out.println("SUM IS: "+sum+" AND AVERAGE IS:"+avg+"");
    }
}