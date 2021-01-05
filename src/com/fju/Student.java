package com.fju;

public class Student {
	
	String name;
	int english;
	int math;
	
	public Student(String n, int english, int math) {
		this.name = n;
		this.english = english;
		this.math = math;
	}
	
	public int average() {
		return (english+math)/2;
	}
	
	public void print() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + average());
	}

	@Override
	public String toString() {
		int avg = average();
		String grades = "AABCDFFFFF";
		char grading = grades.charAt(10 - avg/10);
		
		/*
		String grading = "F";
		switch(avg/10) {
		case 10:
		case 9:
			grading = "A";
			break;
		case 8:
			grading = "B";
			break;
		case 7:
			grading = "C";
			break;
		case 6:
			grading = "D";
			break;
		default:
			grading = "F";
			break;
		}
		*/
		/*
		if (avg >= 90 && avg <= 100) {
			grading = "A";
		} else if (avg >= 80 && avg <= 89) {
			grading = "B";
		} else if (avg >= 70 && avg <= 79) {
			grading = "C";
		} else if (avg >= 60 && avg <= 69) {
			grading = "D";
		}
		*/
		
		return name + "\t" + english + "\t" + math + "\t" + average() 
		+ "\t" + grading;
	}
	
	
}
