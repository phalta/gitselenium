package practiceproject;

import java.util.Scanner;

public class contiueword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int a[]=new int [5];
	Scanner sc= new Scanner(System.in);
	System.out.println("enter no");
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
		
	}
	for(int i=0;i<5;i++)
	{
	
    	for(int j=i+1;j<5;j++)
 	       {
		      if(a[i]>a[j])
		      {
		    	  int temp=0;
		    	 temp=a[i];
		    	 a[i]=a[j];
		         a[j]=temp;
		      }
	       }
	
    }
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i] +"" );
		
	}
	
	}

}
