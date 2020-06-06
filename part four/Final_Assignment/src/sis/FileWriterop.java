package sis;

import java.io.*;

public class FileWriterop {

	public void writefile(int id, String name, double avg) {
		try {
			FileWriter student = new FileWriter("Student.txt",true);
			BufferedWriter out = new BufferedWriter(student);
			out.write( id+","+ name+","+ avg+ "\n");
			out.close();
		}catch (Exception e) {
			System.out.println("You have an error talk to Jalal");
		
	}
}
}
