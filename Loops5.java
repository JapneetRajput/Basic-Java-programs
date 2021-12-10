import java.util.*;
public class Loops5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a=0, max=0, min=0;
        for(int i=1;a>=0;i++){
            a = scan.nextInt();
            if(i==1){
                max=a;min=a;
            }
            if(min>a&&a>0)
                min = a;
            if(max<a)
                max = a;
        }
        System.out.print("Max = " + max + " Min = " + min);
    }
}
