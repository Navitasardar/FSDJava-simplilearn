package accessmodifiers;

public class TestN {
	
	protected long h = 2000 ;   //private variable
	
	public int j  = 29;       // default variable
	
	double d = 13.299 ;
	
	
	public void methodPublic(){     // public method
		methodPrivate();
	}
	
	protected void methodProtected(){   // protected method
		methodPrivate();
	}
	
	void methodDefault(){    //default method
		methodPrivate();
	}
	
	private void methodPrivate(){     // private method
		System.out.println("Class TestN: methodProtected");
		System.out.println("Value of protected long h"+ h);
		System.out.println("Value of public int j "+ j);
		System.out.println("Value of double d"+ d);
	}
}





