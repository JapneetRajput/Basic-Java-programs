// ASSIGNMENT 1 (Q3)

class EvenOddComline {
    static int i;
    public static void main (String[] args) {
        int n;
        n = Integer.parseInt(args[1]);
        System.out.println("EVEN NUMBERS: ");
        for(i=0; i<n; i++)
        {
        if(i%2 == 0)
            {
                System.out.println(i+"");
            }
        }
        System.out.println();
        System.out.println("ODD NUMBERS: ");
        for(i=0; i<n; i++)
        {
            if(i%2 != 0)
            {
                System.out.println(i+" ");
            }
        }
    }
}