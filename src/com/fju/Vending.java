package com.fju;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Vending {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("data1.txt");
			System.out.println("file opened");
			
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println("End");
	}

}
