package inheritanceasssignment;



	class Product {
		int id = 78;
		String name = "Amul";
		void amul()
		{
			System.out.println(id+" "+name);
		}
	}

	class A extends Product {
		int count = 50;
		String category = "butter";
		void butter()
		{
			System.out.println(id+" "+name+" "+count+" "+category);
		}
	}
		class B extends Product {
			int count = 90;
			String category = "Milk";
			void milk()
			{
				System.out.println(id+" "+name+" "+count+" "+category);
		}
	}
		
		class C extends Product {
			int count = 56;
			String category = "choco";
			void choco()
			{
				System.out.println(id+" "+name+" "+count+" "+category);
			}
		}
		class subA extends A
		{
			int price = 30;
			int total = count*price ;
			void total1()
			{
				System.out.println(id+" "+name+" "+count+" "+category);
			}
		}
		class subB extends B
		{
			int price = 10;
			int total = count*price ;
			void total2 ()
			{
				System.out.println(id+" "+name+" "+count+" "+category);
			}
		}
	public class Assignment {

		public static void main(String[] args) {
			
			Product p=new Product();
			A a=new A();
			B b=new B();
			C c=new C();
			subA sa=new subA();
			subB sb=new subB();
			
			p.amul();
			a.butter();
			b.milk();
			c.choco();
			sa.total1();
			sb.total2();
			System.out.println(" sub a total"+sa.total);
			System.out.println(" sub b total"+sb.total);
			
		}
		
	}
			

