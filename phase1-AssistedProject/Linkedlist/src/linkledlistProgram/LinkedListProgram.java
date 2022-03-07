package linkledlistProgram;

    import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.Vector;


	public class LinkedListProgram {

		public static void main(String[] args) {

	     	int a1=6;
			    	
			        LinkedList<String> ll = new LinkedList<String>();
			        ll.add("April");
			        ll.add("May");
			        ll.add("June");
			        ll.add("July");
			        ll.add("August");
			        ll.add("November");
			       
			                
			        ll.addLast("December");
			        ll.addFirst("January");
			        
			        ll.add(3, "March");
			        ll.add(2,"Febuary");
			        ll.add(9,"September");
			        ll.add(10,"October");
			        
			        
			        System.out.println(ll);
			        System.out.println("All even months are Febuary , April , June , August , October , December");
			        System.out.println("All odd months are January , March , May , July , September , November");
			        
			        Iterator itr=ll.iterator();
			        while(itr.hasNext()) {
			        System.out.println("list is"+ itr.next());
			        }
			        
			        System.out.println(ll.getFirst());
			        System.out.println(ll.getLast());
			        System.out.println(ll.remove("March"));
			        System.out.println(ll);
			     
			        
			        
			                 
			      
			       
			        System.out.println(ll);
			        System.out.println("Size of the linked list: "+ll.size());
			        System.out.println("Is LinkedList empty? "+ll.isEmpty());
			       
			               
			        
			        Vector<String> v = new Vector<String>();
			        v.add("Jaipur");
			        v.add("Delhi");
			        v.add("Mumbai");
			        
			        Iterator itr1=v.iterator();
			        while(itr1.hasNext()) {
			        System.out.println("Vector is"+ itr1.next());
			        }
			        
			    }
			


}
