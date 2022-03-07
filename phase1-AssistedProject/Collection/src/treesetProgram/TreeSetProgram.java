package treesetProgram;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
  TreeSet<String> treeSet = new TreeSet<String>();
        
        System.out.println("Enter the 6 programming languages");
        
        Scanner input = new Scanner(System.in); 
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();
        String s4 = input.nextLine();
        String s5 = input.nextLine();
        String s6 = input.nextLine();
        
        
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add(s6);
        
        treeSet.remove(s1);
        treeSet.remove(s2);
        
        System.out.println("TreeSet is : " + treeSet);
        System.out.println("TreeSet is : " + treeSet);
        System.out.println("Check if TreeSet is empty : " + treeSet.isEmpty());
        
        System.out.println(treeSet.contains("Java"));
        
        treeSet.add(s4);
        System.out.println("After removing element : " + s2 + " TreeSet is : " + treeSet);
    }

		
	}


