package accessmodifiers;

 class TestX {
	

	private int t= 40;   //private variable
	
	long z = 1997;       // default variable
	
	protected float o = 13.29f ;
	
	public char a = 's';
	
	public void methodPublic(){     // public method
		methodPrivate();
	}
	
	protected void methodProtected(){   // protected method
		methodPrivate();
	}
	
	void methodDefault(){    //default method
		methodPrivate();
	}
	private void methodPrivate(){
	
		
	
	System.out.println("Class TestX: methodProtected");
	System.out.println("Value of  private int t"+ t);
	System.out.println("Value of  long z"+ z);
	System.out.println("Value of protected float o "+ o);
	System.out.println("Value of public char a "+ a);

	

}
}