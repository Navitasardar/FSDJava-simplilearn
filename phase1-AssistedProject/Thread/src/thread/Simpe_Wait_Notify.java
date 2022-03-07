package thread;

class Customer
{
int amount=10000;  
  
	synchronized void withdraw(int amount){  
	System.out.println("  going to withdraw...");
	  
		if(this.amount<amount)
		{  
		System.out.println("Less balance; waiting for deposit...");  		
		try{
			wait();
		   }
		catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw completed...the remain over amount is"+ this.amount);  
	}  
  
	synchronized void deposit(int amount){  
		System.out.println("  going to deposit...");  
		this.amount+=amount;  
		
		System.out.println("deposit completed... " + this.amount);  
		notify();  //unlocking of thread
	}  
}  
  
public class Simpe_Wait_Notify{  
	public static void main(String args[]){  
		final Customer t1=new Customer();
	    
		int t;
		new Thread(){                 // anonymous class
		  public void run()
		  {
			t1.withdraw(5000);
		  }  
		}.start();  
		
		new Thread(){                 // anonymous class
			  public void run()
			  {
				t1.withdraw(4000);
			  }  
			}.start();  
			
			new Thread(){                 // anonymous class
				  public void run()
				  {
					t1.withdraw(10000);
				  }  
				}.start();  
		new Thread(){  
		  public void run()
		   {
			 t1.deposit(20000);
		   }  
		}.start();    
	

	}

}
