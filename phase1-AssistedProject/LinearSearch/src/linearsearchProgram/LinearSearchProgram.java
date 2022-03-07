package linearsearchProgram;

import java.util.Scanner;

public class LinearSearchProgram {
		
			 public static void main(String[] args){

			        int[] arr = {13,29,30,27,17,15,6,9,2,8};
			        System.out.println("Given array :13,29,30,27,17,15,6,9,2,8");
			        Scanner sc = new Scanner(System.in);
			        System.out.println("Enter the element to be searched");
			        int searchValue = sc.nextInt();
			        
			        int result = linearing(arr,searchValue);
			        if(result==-1){

			                System.out.println("Element not in the array");
			            } else {

			                System.out.println("Element found at "+result+" and the search key is "+arr[result]);
			            }
			        }

			public static int linearing(int arr[], int x) {

			    int arrlength = arr.length;
			    for (int i = 0; i < arrlength - 1; i++) {

			        if (arr[i] == x) {
			            return i;
			         }
			     }
			            return -1;
			   }
			


			
		}



