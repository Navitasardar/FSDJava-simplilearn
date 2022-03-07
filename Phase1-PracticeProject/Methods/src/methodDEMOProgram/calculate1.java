package methodDEMOProgram;

public class calculate1 {
	
	 int cal (int a, int b)
			
			{
				return a + b ;
				
			}
			float cal(int radius)
			{
				return 3.14F*radius*radius;
				
			}
			int cal(int len,long bre)
			{
				return (int) (len*bre);
			}

		public static void main(String[] args) {
			calculate1 s1 = new calculate1();
			int d1 = s1.cal(4,3);
			float d2 = s1.cal(9);
			int d3= s1.cal(5,8);
			
			System.out.println(d1);
			System.out.println(d2);
			System.out.println(d3);
		

		}

	}

