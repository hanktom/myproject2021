package com.fju;

public class Scoring {

	public static void main(String[] args) {
		Student stu1 = new Student("Jack", 40, 81);
		int average = stu1.average();
		if (average <= 60) {
			System.out.println("I am sorry");
		} else {
			System.out.println("Congradulation");
		}
		System.out.println(stu1);
//		stu1.print();
	}

}
