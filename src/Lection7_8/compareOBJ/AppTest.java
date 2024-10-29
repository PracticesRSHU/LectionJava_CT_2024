package Lection7_8.compareOBJ;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AppTest {

	public static void main(String[] args) {
		Student[] students=new Student[4];
		System.out.println(students.getClass());
		students[0]=new Student("Olga",21);
		students[1]=new Student("Igor",23);
		students[2]=new Student("Dmitro",19);
		students[3]=new Student("Dmitro",19);
		int a=Integer.valueOf("345"); //int
		System.out.println(a);
		System.out.println(++a);
		System.out.println(students[2]==students[3]);
		System.out.println(students[2].equals(students[3]));
	System.out.println("Before sorting:");
//		System.out.println(Arrays.toString(students));
//		Arrays.sort(students);

		Arrays.sort(students,new StudentNameComparator());
		Arrays.sort(students,new StudentAgeComparator());
		System.out.println("After sorting:");
		System.out.println(Arrays.toString(students));
		for (Student student : students) {
			System.out.println(student.hashCode());
		}
		
	}

}
