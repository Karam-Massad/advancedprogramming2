package sis;

import java.util.ArrayList;
import java.util.Scanner;

public class OperationStudents {
	Student student = new Student();
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> stu = new ArrayList<>();
	FileRead fr = new FileRead();
	Deleteline dl = new Deleteline();
	FindStudent fd = new FindStudent();

	public void studentadd() {
		System.out.print("Please enter student ID: ");
		student.setId();
		System.out.print("Please enter student Name: ");
		student.setName();
		System.out.print("Please enter student Avg: ");
		student.setAvg();

		FileWriterop addstudent = new FileWriterop();
		addstudent.writefile(student.getId(),student.getName(),student.getAvg());

		System.out.println("====================");

	}

	public void studentfind() {
		System.out.println("Please enter the ID you wan find:");
		String t = scan.nextLine();
		System.out.println("======================");
		fd.studentfind(t,"Student.txt");
	}

	public void studentdelete() {
		System.out.println("Please enter the ID you wanna delete:");
		String a = scan.nextLine();
		System.out.println("======================");
		dl.filedelete("Student.txt", a, 1,",");
	}

	public void showstudent() {
		fr.readfile();
	}
}
