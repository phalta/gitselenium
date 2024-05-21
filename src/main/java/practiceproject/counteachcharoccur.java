package practiceproject;

import java.util.Scanner;

public class counteachcharoccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  System.out.println("Emter string");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int count=0; 
	for (int i=0;i<str.length();i++)
	{  
		count=0;
		char ch=str.charAt(i);
		for (int j=0;j<str.length();j++)
		{
			char ch1=str.charAt(j);
			if(ch==ch1)
			{
				count++;
			}
			
		}
		
		System.out.println("char "+ch+"  found no of times  "+count);
	}
	}

}
