package accessmodifiers;

public class TestZ {
	
	public static void main(String args[]) {
		new TestM().methodPublic();
		new TestM().methodProtected();
		new TestM().methodDefault(); 
		new TestN().methodPublic();
		new TestN().methodProtected();
		new TestN().methodDefault(); 
		new TestP().methodPublic();
		new TestP().methodProtected();
		new TestP().methodDefault(); 
		
	
	System.out.println("Value of long: "+ new TestX().z);
	System.out.println("Value of Float: "+ new TestX().o);
	System.out.println("Value of Char: "+ new TestX().a);
}
	public void methodPublic() {
		System.out.println("Class TestM: methodPublic");
		System.out.println("Class TestN: methodPublic");
		System.out.println("Class TestP: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class TestM: methodProtected");
		System.out.println("Class TestN: methodProtected");
		System.out.println("Class TestP: methodProtected");
	}

	void methodDefault() {
		System.out.println("Class TestM: methodDefault");
		System.out.println("Class TestN: methodDefault");
		System.out.println("Class TestP: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("Class TestM: methodPrivate");
		System.out.println("Class TestN: methodPrivate");
		System.out.println("Class TestP: methodPrivate");
	}

}
