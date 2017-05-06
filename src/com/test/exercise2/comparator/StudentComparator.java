package com.test.exercise2.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.test.exercise2.model.Student;

/**
 * Define how student object should be sorted
 * @author nglek
 *
 */
public class StudentComparator implements Comparator<Student>{

	private List<Comparator<Student>> listComparator;
	
	public StudentComparator(Comparator<Student>... comparators) {
		this.listComparator = Arrays.asList(comparators);
	}
	
	@Override
	public int compare(Student o1, Student o2) {
		for (Comparator<Student> comparator: this.listComparator) {
			int compare = comparator.compare(o1, o2);
			if (compare != 0) {
				return compare;
			}
		}
		
		return 0;
	}

}
