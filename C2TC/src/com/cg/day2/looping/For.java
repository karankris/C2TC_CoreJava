package com.cg.day2.looping;
// for loop and nested for loop
// pattern printing program's
public class For {

	public static void main(String[] args) {
		int n =5,a=1;
		System.out.println("Floyd_Triangle_pattern");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a++*3+" ");//multiples of three
			}
			 System.out.print("\n");
	   }
		System.out.println(" ");
		System.out.println("Box_pattern");
		System.out.println(" ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==0||i==n-1)
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			
			}
			System.out.print("\n");
		}
 }
  }
