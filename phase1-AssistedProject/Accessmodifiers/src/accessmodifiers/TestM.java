package accessmodifiers;

 class TestM {
	
	
		private int y= 20;   //private variable
		
		long k = 3000;       // default variable
		
		protected float n = 13.29f ;
		
		
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
			System.out.println("Class TestM: methodProtected");
			System.out.println("Value of  private y"+ y);
			System.out.println("Value of  long k"+ k);
			System.out.println("Value of protected n "+ n);
		
		
		}
 }
	


