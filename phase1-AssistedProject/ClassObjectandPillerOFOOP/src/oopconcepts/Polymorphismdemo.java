package oopconcepts;

public class Polymorphismdemo {
	
		public int Sub(int x, int y) {
			return (x - y);
		}

		public int Sub(int x, int y, int z) {
			return (x - y - z);
		}

		public double Sub(double x, double y) {
			return (x - y);
		}

		public static void main(String[] args) {
			Polymorphismdemo s = new Polymorphismdemo(); 
	        System.out.println(s.Sub(50, 10)); 
	        System.out.println(s.Sub(50, 10, 30)); 
	        System.out.println(s.Sub(13.29, 20.07)); 

		}

	}


