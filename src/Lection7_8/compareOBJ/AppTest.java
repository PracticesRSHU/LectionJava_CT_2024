package Lection7_8.compareOBJ;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AppTest {

	public static void main(String[] args) {
		Student[] students=new Student[3];
		students[0]=new Student("Olga",21);
		students[1]=new Student("Igor",23);
		students[2]=new Student("Dmitro",19);
	System.out.println("Before sorting:");
		System.out.println(Arrays.toString(students));
		Arrays.sort(students);

		//Arrays.sort(students,new StudentNameComparator());
		//Arrays.sort(students,new StudentAgeComparator());
		System.out.println("After sorting:");
		System.out.println(Arrays.toString(students));
		
		
	}

}
