package com.wp.myStrings;
import java.util.StringTokenizer;

public class ConstructTokens {

	public static void main(String[] args) {
	
		String str="1.Java,2.Oracle,3.Python,4.PHP,5.MySql,6.Linux......";
		
		StringTokenizer st=new StringTokenizer(str,"0123456789,.");
		
		while(st.hasMoreTokens())
		{
		System.out.println(st.nextToken());
		}

	}

}
