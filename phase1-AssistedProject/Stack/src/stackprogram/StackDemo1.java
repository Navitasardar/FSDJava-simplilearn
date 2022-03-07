package stackprogram;


	
	import java.io.*; 
	import java.util.*; 

	public class StackDemo1 { 
	 public static void main(String[] args) 
	 { 
	     
	     Stack country = new Stack(); 

	    
	     Stack<String> fruit = new Stack<String>(); 

	     // pushing the elements 
	     country.push("India"); 
	     country.push("Japan"); 
	     country .push("USA"); 
	     country.push("Australia"); 
	     country.push("China"); 
	     country .push("Russia"); 
	     country.push("Shrilanka"); 
	     country.push("France"); 
	     country .push("Germany"); 
	     country.push("Canada"); 
	     
	     
	     System.out.println("index of elemtn All inside the stack"+ country.indexOf("All"));
	     
	     System.out.println("Popped element from country : " +country.pop()); 
	     System.out.println("Popped element from country : " +country.pop()); 
	     System.out.println("Popped element from country : " +country.pop());
	     // Fetching the element at the head of the Stack 1
	     System.out.println("The element at the top of the"+ " stack-1 is: " + country.peek()); 

	     fruit.push("Grapes"); 
	     fruit.push("mango"); 
	     fruit.push("Apple"); 
	     
	     System.out.println("The element at the top of the"+ " fruit is: " + fruit.peek()); 

	     // Priniting the Stack Elements 
	     System.out.println(country); 
	     System.out.println(fruit); 
	     
	     // Removing elements using pop() method 
	     System.out.println("Popped element from country: " + country.pop()); 
	     System.out.println("Popped element from fruit: " + fruit.pop()); 
	     System.out.println("Popped element from country: " + country.pop()); 
	     System.out.println("Popped element from fruit: " + fruit.pop()); 
	 } 
	}



