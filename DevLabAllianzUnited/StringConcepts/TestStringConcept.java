package com.test.StringConcepts;

public class TestStringConcept {
	public static void main(String[] args) {
		  String str = "MoHaN";
		  String str2 = "DevLabsAllianz";
		  String Str3 =" Akshit ";
		  
		  String str4 = Str3.substring(1);
		  StringBuffer stringBuffer = new StringBuffer("Akshit");
		  stringBuffer.append("is great");
		  StringBuffer reverse = stringBuffer.reverse();
		  System.out.println("StringBuffer value is " +stringBuffer);
		  System.out.println("Reverse of String is" +reverse);
		  
		  
		  String replcaceString = Str3.replace(" ", ".");
		  System.out.println("Trimmed  case is" +str4 );
		  System.out.println("trimmed value is" +str2.trim());
		  String concatString = str.concat(" Add me here ");
		  String lowerString= str.toLowerCase();
		  String upperCaseString= str.toUpperCase();
		  System.out.println("Lower case is " +lowerString );
		  System.out.println("upper  case is " +upperCaseString );
		  System.out.println("Concatenated  case is " +concatString );
		 
		
		
	}

}

//Mohan Timfox -> tim
// Mohan  -> Arivu
// Mohan -> Not saying anything
