package studentvm;

import java.util.ArrayList;

public class Student {

	private int code;
	private String fullName;
	private int year;
	private char letter;

	private ArrayList<Integer> grades;

	public Student(int code, String fullName, int year, char letter) {
		this.code = code;
		this.fullName = fullName;
		this.year = year;
		this.letter = letter;
	}
}
