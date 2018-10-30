/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysortsquared;

// Java program to Sort square of the numbers 
// of the array 
import java.util.*; 
import java.io.*; 
  
class ArraySortSquared  
{ 
   // Function to sort an square array 
    public static void sortSquares(int arr[]) 
    { 
        int n = arr.length; 
          
        // First convert each array elements 
        // into its square 
        for (int i = 0 ; i < n ; i++) 
            arr[i] = arr[i] * arr[i]; 
   
        // Sort an array using "inbuild sort function" 
        // in Arrays class. 
        Arrays.sort(arr); 
    } 
      
    // Driver program to test above function 
    public static void main (String[] args) 
    { 
        int arr[] = { -6 , -3 , -1 , 2 , 4 , 5 }; 
        int n = arr.length; 
      
        System.out.println("Before sort "); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
          
        sortSquares(arr); 
        System.out.println(""); 
        System.out.println("After Sort "); 
        for (int i = 0 ; i < n ; i++) 
            System.out.print(arr[i] + " "); 
  
    } 
}
