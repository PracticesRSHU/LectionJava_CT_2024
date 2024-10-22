package Lection6_OOP.project_lec_OOP_part4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestApllicationCollection {

	public static void main(String[] args) {
		List list1=new ArrayList();
		list1.add("Andriy");
		list1.add(34);
		System.out.println(list1.toString());
		List<String>  list2=new ArrayList<>();
		list2.add("3");
		list2.add("Hello");
		System.out.println(list2.equals(list1));
		
		ArrayList<Student> grupa1=new ArrayList<>();
		grupa1.add(new Student("Andriy","Sokil",20));
		grupa1.add(new Student("Olga","Titarento",21));
		grupa1.add(new Student("Andriy1","Sereda",22));
		grupa1.add(new Student("Andriy2","Nesterenko",22));
		System.out.println(grupa1);
		System.out.println(grupa1.size());
		for(int i=0; i<grupa1.size();i++) {
			
			System.out.println((i+1)+"-�" +grupa1.get(i).getSecondname()+" you has "+grupa1.get(i).getAge());
		}
		
		for (Student student : grupa1) {
			System.out.println(student.getSecondname()+" "+ student.getFirstname());
		
		}
		Iterator<Student> iter1=grupa1.iterator();
//		System.out.println(iter1.next());
//		System.out.println(iter1.next());
//		System.out.println(iter1.next());	
		System.out.println("\n using iterator:");
		while (iter1.hasNext()) {
//			System.out.println("�� � ���� hasNext �");
			Student student=iter1.next();
			System.out.println(student.getSecondname()+" "+ student.getFirstname());
		}
		
		Map<String,List<Student>> mapGroup= new HashMap<>();
		mapGroup.put("I4",grupa1);
		mapGroup.put("KT4",new ArrayList<Student>());
		Student student1= new Student("Maksim","Nesterenko",21);
		Iterator<Entry<String,List<Student>>> iter2= mapGroup.entrySet().iterator();
		while(iter2.hasNext()) {
			Entry<String,List<Student>> grupa=iter2.next();
			System.out.println(grupa);
			if (grupa.getKey().equalsIgnoreCase("KT4")){
				List<Student> value=grupa.getValue();
				value.add(student1);
				value.add(new Student("Olga","Feschuk",21));
				grupa.setValue(value);
			}
		}
		System.out.println("\n-------------------------------------------------------");
		System.out.println(mapGroup);
		

	}

}
