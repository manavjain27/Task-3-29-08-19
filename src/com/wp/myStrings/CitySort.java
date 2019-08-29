package com.wp.myStrings;

public class CitySort {

	public static void main(String[] args) {
		
		String cities[]= new String[] {"bhopal","agra","mumbai","chennai","pune","delhi"};
		
		for(int i=0;i<cities.length;i++)
		{
			for(int j=i+1;j<cities.length;j++)
			{
				if(cities[i].compareTo(cities[j])>0)
				{
					String t=cities[i];
					cities[i]=cities[j];
					cities[j]=t;
							
				}
			}
		}
		
		for(int i=0;i<cities.length;i++)
			System.out.println(cities[i]);
		

	}

}
