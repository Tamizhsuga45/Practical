package com.vowelexception;
import java.util.*;
public class StringException extends Exception{
	StringException(String msg){
		super(msg);
	}
	public static void main(String[] args) throws StringException{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a message:");
		String str=input.nextLine();
		input.close();
		try {
			boolean flag=false;
			for(int i=0;i<str.length();i++) {
				if(isVowel(str.charAt(i))) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				throw new StringException(" doesn't contains vowel");
			}
			else {
				System.out.println(str+" contains vowel");
			}
		}
		catch(Exception e){
			System.err.println(str+e.getMessage());
		}
	}
	public static boolean isVowel(char ch) {
		ch=Character.toLowerCase(ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		else {
			return false;
		}
	}

}
