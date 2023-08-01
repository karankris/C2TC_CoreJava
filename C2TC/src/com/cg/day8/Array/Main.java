package com.cg.day8.Array;
import java.util.*;
public class Main{
	
	public static void main(String[] args)
	{
		Scanner sc = new  Scanner(System.in);
		System.out.print("enter the rows: ");
 		   int r =sc.nextInt();
 		   System.out.print("enter the colums: ");
 		   int  c = sc.nextInt();         
	   int[][] arr1 = new int[10][10];
	   int[][] arr2 = new int[10][10];
	   int[][] arr3 = new int[10][10];
       Matrix_array.elements(arr1, arr2, r, c);//get the elements in the array 
       Matrix_array.matadd(arr1, arr2, arr3, r, c); // print the elements
       sc.close();
     }
	
}