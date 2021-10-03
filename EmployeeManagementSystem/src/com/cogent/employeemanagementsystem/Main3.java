package com.cogent.employeemanagementsystem;

public class Main3 {
	
	public static void main(String[] args) {
		
//		String s = "Cogent University";
//		StringBuffer buffer = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
//		
//		buffer.delete(0, 5);
//		//buffer.compareTo(buffer);
//		
//		System.out.println(buffer);
		/////////////////////////////////////////////////
//		StringBuffer buffer = new StringBuffer();
//		//DC: by default it is capable to hold 16 chars
//		//if you put a int inside the StringBuffer(); then it will change the size
//		//append will add characters at the end
//		//10 char
//		buffer.append("abhinandan");
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
//		//5 char
//		buffer.append("advik");
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
//		//1 char
//		buffer.append(" ");
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
//		//1 char
//		buffer.append("a");
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
		//////////////////////////////////////////////////////
		//.length is a method of string but it is property of array
		//System.out.println(s.length());
		///////////////////////////////////////
		//s.isBlank();
		//System.out.println(s.isEmpty());
		
		////////////////////////////////////////////////
//		System.out.println("abi".codePointAt(0));
//		System.out.println("ABI".codePointAt(0));
//		//the momment it gets a difference it will stop at that char.
//		//so it stopped at b cause there is a difference between b and D
//		System.out.println("abi".compareTo("aDI"));
//		System.out.println("a".compareTo("a"));
//		System.out.println("b".compareTo("D"));
		///////////////////////////////////////
//		String s = "Cogent University";
//		int a = 10;
//		int b = 10;
//		System.out.println(a==b);
//		//will grab the chars from the number specified onwards
//		//we can also have a startpoint print up to the endpoint(it has to be end + 1 to work)
//		//endpoint is normally 5 but we add 1
//		//String result = s.substring(0, 6);
//		//System.out.println(result);
//		
//		System.out.println(s==new String("Cogent University"));
//		//== is used to check that whether s and other 
//		//ref is reffering to same object or not
//		
//		//if we compare s to a new string they will not equal since the s is stored in 
//		//the spool and the new string is stored in the heap
//		
//		//equals method used to check the content
//		// == operator is used to check location in case of reference
//		//in case of primitive ==> value would be the expectation
		/////////////////////////////////////////////////
//		String ip  = "192.168.1.1";
//		//this belongs to class c
//		//but we need to split this class according to the dot
//		//split returns a string array
//		//basis of .
//		//0 to 255
//		
//		// \\.
//		// \\ => \.
//		// \. is escape sequence
//		// the "." is a regex character so it needs a \\ 
//		String [] ipAddress = ip.split("\\.");
//		for (String string : ipAddress) {
//			//turn string variable into an int and formate it back into a number
//			int a = Integer.parseInt(string);
//			if (a>=0 && a<=255) {
//				System.out.println("Within Range");
//			}else {
//				//to leave the for loop you can use either a break, return, or system.exit(0);
//				break;
//			}
//			
//			//System.out.println(string);
//		}
//		try {
//			int classCell = Integer.parseInt("abc");
//			if(classCell>0 && classCell<128) {
//				System.out.println("IP belongs to class A");
//			}else if(classCell>127 && classCell<192) {
//				System.out.println("IP belongs to class B");
//			}else if(classCell>191 && classCell<224) {
//				System.out.println("IP belongs to class C");
//			}else if(classCell>223 && classCell<240) {
//				System.out.println("IP belongs to class D");
//			}else if(classCell>239 && classCell<252) {
//				System.out.println("IP belongs to class E");
//			}
//		} catch (NumberFormatException e) {
//			int classCell = Integer.parseInt(ipAddress[0]);
//			if(classCell>0 && classCell<128) {
//				System.out.println("IP belongs to class A");
//			}else if(classCell>127 && classCell<192) {
//				System.out.println("IP belongs to class B");
//			}else if(classCell>191 && classCell<224) {
//				System.out.println("IP belongs to class C");
//			}else if(classCell>223 && classCell<240) {
//				System.out.println("IP belongs to class D");
//			}else if(classCell>239 && classCell<252) {
//				System.out.println("IP belongs to class E");
//			}
//		}
		/*A	0-127	xxx . xxx . xxx
		  B	128-191	xxx . xxx
		  C	192-223*/
		
		
		
		//////////////////////////////////////////////////
//		String s = "levi";
//		String s2 = "cogent";
//		String s3 = new String("university");
//		//Class Name ref = RT Allocation
//		
//		//since these string variables are already made it will take the 
//		//vales from the spool rather than create a new reference
//		String s4 = "levi";
//		String s5 = "cogent";
//		
//		System.out.println(s4.concat(" "+s5));
//		//concat is the only one solution where we can trust
//		System.out.println(s4);
//		//because string object are immuble
//		
//		//at least 3-4 methods except concat
//		//ToUpperCase, ToLowerCase,valueof, rplace?/
//		//which are returning new string object?
//		//levi's response: charAt, codePointAt
//		System.out.println(s4.toUpperCase());
//		System.out.println(s4.toLowerCase());
//		System.out.println(s4.valueOf(true));
	}
}
