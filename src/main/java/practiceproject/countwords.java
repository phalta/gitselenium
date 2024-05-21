package practiceproject;

import java.util.Scanner;

public class countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.out.println("enter string");
	Scanner sc= new Scanner(System.in);
	String s= sc.nextLine();
	int count=1;
	 for(int i=0;i<s.length()-1;i++)
	 {
		 
		 if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
         {
			 
	      count++;
	     } 
	 
	}
	 System.out.println("no of words in string "  + count);
	}
}
