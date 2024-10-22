package Lection7_8.compareOBJ;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
	if (st1.getName().compareToIgnoreCase(st2.getName())>0)
		return 1;
	else if (st1.getName().compareToIgnoreCase(st2.getName())<0)
		return -1;
				
	return 0;
	}

}
