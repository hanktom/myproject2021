package com.fju;

public class VendingMachine {

	public static void main(String[] args) {
		String s = "abc";
		String s2 = new String("abc");
		System.out.println(s2.length());
		System.out.println(s2.startsWith("a"));
		System.out.println(s2.substring(1));
		s = null;
		
		System.out.println(s.length());
	}

}
