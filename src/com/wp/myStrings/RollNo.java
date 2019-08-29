package com.wp.myStrings;

public class RollNo {

	public static void main(String args[]) {
		String sroll[] = new String[10];
		sroll[0] = "125674";
		sroll[1] = "340001";
		sroll[2] = "562341";
		sroll[3] = "127891";
		sroll[4] = "125893";
		sroll[5] = "345201";
		sroll[6] = "780001";
		sroll[7] = "782563";
		sroll[8] = "564123";
		sroll[9] = "784125";

		int cs = 0, it = 0, mech = 0, civil = 0;

		for (int i = 0; i < sroll.length; i++) {
			String substr = sroll[i].substring(0, 2);

			if (substr.equals("12")) {
				cs++;
			} else if (substr.equals("34")) {
				it++;
			} else if (substr.equals("56")) {
				mech++;
			} else if (substr.equals("78")) {
				civil++;
			}
		}
		System.out.println("Total CS Students :" + cs);
		System.out.println("Total IT Students :" + it);
		System.out.println("Total MECHANICAL Students :" + mech);
		System.out.println("Total CIVIL Students :" + civil);

	}

}
