package Lection7_8.compareOBJ;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
//		if (st1.getAge() > st2.getAge()) 
//			return 1;
//		else if (st1.getAge() < st2.getAge())
//			return -1;
//		return 0;
		return st1.getAge() - st2.getAge();
	}
}
