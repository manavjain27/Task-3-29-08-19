package com.wp.myStrings;

public class SeperateCountries {

	public static void main(String[] args) {
		
		String str= "India,Australia,England,Canada,Bangladesh";
		
		int position=0,start=0,end=0;
		int index=0;
		int last=str.lastIndexOf(',');
		do
		{
			index=str.indexOf(",",position);
			position=index+1;
			end=index;
			
			String sub=str.substring(start,end);
			if(index!=-1)
			{
			
				System.out.println(sub);
			}
			
			start=position;
			
			if(index==last) {
				break;
			}
		}
		while(index!=-1);
		
		System.out.println(str.substring(last+1));
	}

}
