package practiceproject;

public class largestsmallestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int number[]= {1,2,3,4,5,6,7,8};
  int max=number[0];
  int min=number[0];
  for(int i=0;i<number.length;i++)
  {
	  if(max<= number[i])
		  {
			  max= number[i];
		  } 
	 /* else if (min>=number[i]) 
	  {
		  min=number[i];
	  }*/
		  
	}
	
	System.out.println("largest no is :"+max);
	}

}
