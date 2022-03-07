package memberInnerProgram;

public class Member_Inner {
	

	private int data = 30;
	
	void dispaly() 
	{
		System.out.println("i am inside the outer class method");
	}
	
	class Inner {
		private int data = 20 ;
		 void msg()
		 {
			 System.out.println("data is "+data);
		 }
	}

	public static void main(String[] args) {
		Member_Inner obj=new Member_Inner();     
		  
		  Member_Inner.Inner in=obj.new Inner();  
		  in.msg();  
	

	}

}


