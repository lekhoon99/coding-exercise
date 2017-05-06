package com.test.exercise2.comparator;

import java.util.Comparator;

import com.test.exercise2.model.Student;

/**
 * Compare and sort student's Id in ascending order
 * @author nglek
 *
 */
public class StudentIdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getId().compareTo(o2.getId());
	}

}
