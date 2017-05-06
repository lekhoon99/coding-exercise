package com.test.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.test.exercise2.comparator.StudentComparator;
import com.test.exercise2.comparator.StudentFirstnameComparator;
import com.test.exercise2.comparator.StudentGPAComparator;
import com.test.exercise2.comparator.StudentIdComparator;
import com.test.exercise2.model.Student;

public class StudentGPASorter {

	static List<Student> studentList = new ArrayList<Student>();
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Read the data file
		String currentPath = Paths.get("").toAbsolutePath().toString();
		BufferedReader bfReader = null;
		
		try {
			
			File dataFile = new File(currentPath + "/data/studentgpa.txt");
			bfReader = new BufferedReader(new FileReader(dataFile));
			String readLine = "";
	
			//Read each line from data file
			while((readLine = bfReader.readLine()) != null) {
				
				//Split comma delimiter line of data
				String[] dataArr = readLine.split(",");
				if (dataArr.length==3) {
					Student student = new Student();
					student.setId(Long.parseLong(dataArr[0]));
					student.setFirstName(dataArr[1]);
					student.setGpa(Double.parseDouble(dataArr[2]));
					studentList.add(student);
					
				} else {
					continue;
				}
			}
			
			//Sort the list of students
			Collections.sort(studentList, new StudentComparator(
				new StudentGPAComparator(), 
				new StudentFirstnameComparator(),
				new StudentIdComparator()));
			
			//Print out the sorted list
			for(Student student: studentList) {
				System.out.println(student.getFirstName());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				bfReader.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
