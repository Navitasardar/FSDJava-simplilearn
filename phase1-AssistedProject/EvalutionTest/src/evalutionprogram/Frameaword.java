package evalutionprogram;

public class Frameaword {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer ("Vital Information Resource Under Seize");
		   String word = "" + s.charAt(0);
		   int len = s.length();
		   
		   
		   for (int i=0 ; i<len ; i++) {
			   char ch = s.charAt(i);
			   if (ch ==' ')
				   word += s.charAt(i + 1);
			   
		   }
		   
		   System.out.println(word);
		   
				   
				   
			   
			
		}
		
		
		

	}


