package hashsetProgram;

import java.util.HashSet;

class HashSetProgram{
	public static void main(String[] args){
		
		
		HashSet<String> hs = new HashSet<String>()	;	
		hs.add("n");
		hs.add("s");
		hs.add("a");
		hs.add("d");
		hs.add("c");
		hs.add("g");
		hs.add("r");
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("Does hashset contains this m element  " + hs.contains("u"));		
		System.out.println("is hashset empty  " + hs.isEmpty());
		System.out.println("remove the element "+hs.remove("a"));
		
		
	    hs.clear();
	    System.out.println("get class  " +hs.getClass());
		
	    System.out.println("is hashset empty  " +hs.isEmpty());
	    
	    
		
	}
}


