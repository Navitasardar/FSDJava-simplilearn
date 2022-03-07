package evalutionprogram;

public class UpperCase {

	public static void main(String[] args) {
		
		String s1= "SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE";
		
		
		
	  String str = s1.toUpperCase();
	  
		int count = 0 ;
		int len= str.length();
		
		for (int i = 0 ; i< len - 1; i++)
		{
			if ( str.charAt(i) == str.charAt(i + 1) )
				count++;
			
		}
		
		System.out.println("Double Letter Sequence Count = "+count);
		
		
		
		
				
		
	}

}
