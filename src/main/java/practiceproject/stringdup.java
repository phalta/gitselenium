package practiceproject;

public class stringdup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "priya";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev + str.charAt(i);
			
		}
		System.out.println("reverse string is " +rev);

	if(str.equals(rev))
	{
		System.out.println("string is palindrome");
	}
	else
	{
		System.out.println("string is not palindrome");
	}
	}

}
