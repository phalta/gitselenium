package practiceproject;

public class duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size[]= {1,2,3,4,5,1,2,3};
		for(int i=0;i<size.length;i++)
		{
			for(int j=i+1;j<size.length;j++)
			{
				if(size[i]==size[j])
				{
					System.out.println("duplicate elements are " +size[i]);
				}
			}
			
		}

	}

}
