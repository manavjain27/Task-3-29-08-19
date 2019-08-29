package com.wp.myStrings;
public class EmailCount {
	
		public static void main(String[] args) {
			
			
			String semail[]=new String[8];
			semail[0]="jain.manav277@gmail.com";
			semail[1]="ajay@gmail.com";
			semail[2]="akash@yahoo.com";
			semail[3]="ak@gmail.com";
			semail[4]="santosh@gmail.com";
			semail[5]="sunny@yahoo.com";
			semail[6]="jain.manav277@rediffmail.com";
			semail[7]="manav27@rediffmail.com";
			
			int gmail=0,yahoo=0,rediffmail=0;
			
			for(int i=0;i<semail.length;i++)
			{
				int pos=semail[i].indexOf("@");
				String substr=semail[i].substring(pos+1);
				
				if(substr.equals("gmail.com"))
				{
					gmail++;
				}
				
				else if(substr.equals("yahoo.com"))
				{
					yahoo++;
				}
				
				else if(substr.equals("rediffmail.com"))
				{
					rediffmail++;
				}
			}
			
			System.out.println("Gmail Account :"+gmail);
			System.out.println("Yahoo Account :"+yahoo);
			System.out.println("Rediffmail Account :"+rediffmail);

		}

	}


