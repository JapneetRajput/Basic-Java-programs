/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int withdraw_amt=s.nextInt();
		float balance=s.nextFloat();
		if(withdraw_amt<=balance -0.5&&withdraw_amt%5==0){
		    balance = balance -withdraw_amt-0.5f;
		}
        // else if(withdraw_amt%5!=0){

        // }
		System.out.printf("%.2f",balance);
		
	}
}
