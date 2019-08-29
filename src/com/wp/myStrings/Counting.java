package com.wp.myStrings;

public class Counting {

	public static void main(String[] args) {
		
		String str= "jain.man  av277@gmail.com";
		int character=0,digits=0,space=0,special=0;
		
		for(int i=0;i<str.length();i++)
		{
			int asci=(int) str.charAt(i);
			
			if(asci >= 97 && asci <= 123)
				character++;
			
			else if(asci >= 48 && asci <= 57)
				digits++;
			
			else if(asci == ' ')
				space++;
			
			else
				special++;
		

	}
		
		System.out.println("No of occurences of characters "+character);
		System.out.println("No of occurences of digits "+digits);
		System.out.println("No of occurences of spaces "+space);
		System.out.println("No of occurences of special chars "+special);
	}

}
