import java.util.*;

class InvalidMarks extends Exception{
	public InvalidMarks (String str){
		super(str);
	}
}

public class MarksOutOfBound{
	 static void check (int n) throws InvalidMarks{
		 if(n<0 || n>100){
			 throw new InvalidMarks("Marks Out Of Bound");
		 }
		 else{
			System.out.println("Entered marks: "+n); 
		 }
	 }


public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
        String name=sc.nextLine();
		
		System.out.println("Enter your Seat no:");
        int x=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter date");
        String date=sc.nextLine();
		
		System.out.println("Enter your Center no:");
        int c=sc.nextInt();
		
		System.out.println("Enter your Marks of Sem 1:");
        int m1=sc.nextInt();
		
		try{
			check(m1);
		}
		catch(InvalidMarks ex){
			 System.out.println("Caught the exception");
			 System.out.println("Exception occured: " + ex); 
		}
		
		System.out.println("Enter your Marks of Sem 2:");
        int m2=sc.nextInt();
		
		try{
			check(m2);
		}
		catch(InvalidMarks ex){
			 System.out.println("Caught the exception");
			 System.out.println("Exception occured: " + ex); 
		}
		
		System.out.println("Enter your Marks of Sem 3:");
        int m3=sc.nextInt();
		
		try{
			check(m3);
		}
		catch(InvalidMarks ex){
			 System.out.println("Caught the exception");
			 System.out.println("Exception occured: " + ex); 
		}
	
		if(m1>=0 && m1<=100 && m2>=0 && m2<=100 && m3>=0 && m3<=100 ){
		    System.out.println("Name: "+name);
		    System.out.println("Seat no. :"+x);
		    System.out.println("Date: "+date);
		    System.out.println("Center no. : " +c);
		    System.out.println("Sem 1 marks =" +m1+" Sem 2 marks ="+m2+ "Sem 3 marks ="+m3);
        }
       else{
		   System.out.println("invalid marks");
	   }		   
    }
}