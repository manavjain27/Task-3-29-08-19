package com.wp.myStrings;

import java.util.Scanner;

public class PalindromeWithoutSB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=sc.next();
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		
		if(str.equals(reverse))
			System.out.println("Input string "+str+" is palindrome");
		
		else
			System.out.println("Input string "+str+" is not a palindrome");
		sc.close();

	}

}
