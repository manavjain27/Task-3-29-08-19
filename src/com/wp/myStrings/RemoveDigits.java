package com.wp.myStrings;

public class RemoveDigits {

	public static void main(String[] args) {
		
		String str= "jain.man123av277@gmail.com";
		
		str=str.replaceAll("[0-9]","");
		
		System.out.println(str);
		

	}

}
