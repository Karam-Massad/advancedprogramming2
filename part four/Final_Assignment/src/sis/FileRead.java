package sis;

import java.io.*;


public class FileRead {
	public void readfile(){

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"Student.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			System.out.println("====================");
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
