package com.test.exercise2.comparator;

import java.util.Comparator;

import com.test.exercise2.model.Student;

/**
 * Compare and sort student's GPA in descending order
 * @author nglek
 *
 */
public class StudentGPAComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getGpa().compareTo(o1.getGpa());
	}

}
