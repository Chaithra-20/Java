package com.kodnest.pattern.assignment2;

public class PatternA222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==3 || i==5 || (i==2 & j==1) || (i==4 & j==5))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}

	}

}