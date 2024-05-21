package practiceproject;

public class largestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String str="PriyaNIkhil";
	 int upper=0;
	 int lower=0;
	 
	 for(int i=0;i<str.length();i++)
	 {
		char ch=str.charAt(i); 
		 if((ch>=65) && (ch<=90))
		 {
			 upper++;
		 }
		 else
		 {
			 lower++;
		 }
	       
	 }
	 System.out.println("upper count is" +upper);
	 System.out.println("lower count is" +lower);
	 

	}

}
