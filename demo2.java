public class demo2 {
    public static void main (String args[]){
        char[] source = {'H', 'A', 'P', 'P', 'Y' , 'N', 'E', 'w'};
        char[] destination = new char[8];
        destination[0]='a';
        System.arraycopy(source,2,destination,2,4);
        System.out.println((destination) );
    }
}
