package DeQueueProgram;

import java.util.ArrayList;
import java.util.List;


public class DequeueProgram {
	
	 private List<Integer> deque = new ArrayList<Integer>();
			     
			    public void insertFront(int item){
			       
			        System.out.println("adding at front: "+item);
			        deque.add(0,item);
			        System.out.println(deque);
			    }
			     
			    public void insertRear(int item){
			       
			        System.out.println("adding at rear: "+item);
			        deque.add(item);
			        System.out.println(deque);
			    }
			     
			    public void removeFront(){
			        if(deque.isEmpty()){
			            System.out.println("Deque underflow!! unable to remove.");
			            return;
			        }
			       
			        int rem = deque.remove(0);
			        System.out.println("removed from front: "+rem);
			        System.out.println(deque);
			    }
			     
			    public void removeRear(){
			        if(deque.isEmpty()){
			            System.out.println("Deque underflow!! unable to remove.");
			            return;
			        }
			        
			        int rem = deque.remove(deque.size()-1);
			        System.out.println("removed from rear: "+rem);
			        System.out.println(deque);
			    }
			     
			    public int peakFront(){
			      
			        int item = deque.get(0);
			        System.out.println("Element at first: "+item);
			        return item;
			    }
			     
			    public int peakRear(){
			        
			        int item = deque.get(deque.size()-1);
			        System.out.println("Element at rear: "+item);
			        return item;
			    }
			     
			    public static void main(String a[]){
			         
			        DequeueProgram deq = new DequeueProgram();
			        
			        deq.insertFront(34);
			        deq.insertRear(45);
			        deq.removeFront();
			        deq.removeFront();
			        deq.removeRear();
			        deq.removeFront();
			        deq.insertFront(21);
			        deq.insertFront(98);
			        deq.insertRear(5);
			        deq.insertFront(99);
			        deq.insertFront(23);
			        deq.insertFront(43);
			        deq.removeRear();
			        deq.insertRear(49);
			        deq.insertRear(56);
			        deq.removeRear();
			        deq.insertRear(11);
			        deq.insertRear(39);
			        deq.insertFront(89);
			        deq.insertFront(23);

			    }
			

		}



