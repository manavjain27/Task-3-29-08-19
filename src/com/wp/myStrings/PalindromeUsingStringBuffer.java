package com.wp.myStrings;
import java.util.*;
public class PalindromeUsingStringBuffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=sc.next();
		
		
		StringBuffer sb=new StringBuffer(str);
		
		String reverse=sb.reverse().toString();
		
		if(str.equals(reverse))
		{
			System.out.println("Given string "+str+" is a palindrome");
		}
		else
			System.out.println("Given string "+str+" is not a palindrome");
		
		sc.close();
		
		
	}

}
