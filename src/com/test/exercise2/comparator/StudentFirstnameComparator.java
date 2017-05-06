package com.test.exercise2.comparator;

import java.util.Comparator;

import com.test.exercise2.model.Student;

/**
 * Compare and sort student's firstname in ascending order
 * @author nglek
 *
 */
public class StudentFirstnameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
