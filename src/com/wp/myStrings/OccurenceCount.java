package com.wp.myStrings;

public class OccurenceCount {

	public static void main(String[] args) {
		String str="This is java and java is object oriented and java is powerful.I love java language";
		int count=0;
		int position=0;
		int index=0;
		do
		{
			index=str.indexOf("java",position);
			position=index+1;
			if(index!=-1)
			{
				count++;
				System.out.println(" "+index);
			}
		}
		while(index!=-1);
		System.out.println("No of times Java is present:"+count);
	}

}
