package accessmodifiers;

public class TestY {
	
		public static void main(String args[]) {
			new TestM().methodPublic();
			new TestM().methodProtected();
			new TestM().methodDefault(); 
			new TestN().methodPublic();
			new TestN().methodProtected();
			new TestN().methodDefault(); 
			
			
		
		System.out.println("Value of long: "+ new TestX().z);
		System.out.println("Value of Float: "+ new TestX().o);
		System.out.println("Value of Char: "+ new TestX().a);
}
		public void methodPublic() {
			System.out.println("Class TestM: methodPublic");
			System.out.println("Class TestN: methodPublic");
		}

		protected void methodProtected() {
			System.out.println("Class TestM: methodProtected");
			System.out.println("Class TestN: methodProtected");
		}

		void methodDefault() {
			System.out.println("Class TestM: methodDefault");
			System.out.println("Class TestN: methodDefault");
		}

		private void methodPrivate() {
			System.out.println("Class TestM: methodPrivate");
			System.out.println("Class TestN: methodPrivate");
		}
}

