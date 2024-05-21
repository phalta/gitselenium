package practiceproject;

import java.util.Scanner;

public class showarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("enter size");
	Scanner sc=new Scanner(System.in);
	int arraysize = sc.nextInt();
	int numbers[]=new int[arraysize];
	for(int i =0;i<arraysize;i++)
	{
		
		System.out.println("numbers are " +i);
	}
	
	}

}
