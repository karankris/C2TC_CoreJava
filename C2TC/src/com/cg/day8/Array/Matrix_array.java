package com.cg.day8.Array;
import java.util.*;
public class Matrix_array {
static void elements(int arr1[][], int arr2[][], int r ,int c)
{ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array 1 element");
	 for(int i=0;i<r;i++)
	   {
		   for(int j=0;j<c;j++)
		   {
			   arr1[i][j] = sc.nextInt();		   
			   }
	   }
	 System.out.println("Enter array 2 element");
	 for(int i=0;i<r;i++)
	   {
		   for(int j=0;j<c;j++)
		   {
			   arr2[i][j] = sc.nextInt();		   
		   }
	   }
 
	   for(int i=0;i<r;i++)
	   {
		   for(int j=0;j<c;j++)
		   {
			 System.out.println("The elements of M1: "+arr1[i][j]);  
		   }
	   }
	   System.out.println("\n");
	   for(int i=0;i<r;i++)
	   {
		   for(int j=0;j<c;j++)
		   {
			 System.out.println("The elements of M2: "+arr2[i][j]);  
		   }
	   }	
	   System.out.println("\n");
}
static void matadd(int arr1[][],int arr2[][],int arr3[][],int r, int c )
{
	 
	System.out.println("enter the values for the array");
 
   for(int i=0;i<r;i++)
   {
	   for(int j=0;j<c;j++)
	   {
		    arr3[i][j]=arr1[i][j]+arr2[i][j]; 
	   }
   }
   for(int i=0;i<r;i++)
   {
	   for(int j=0;j<c;j++)
	   {
		   System.out.println("The addition of the matrix are:"+arr3[i][j]); 
	   }
   }
}
}
