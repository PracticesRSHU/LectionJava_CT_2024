package Lection7_8.example_String;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthStyleFactory;

public class AppTest {

	public static void main(String[] args) {
		String  name="Andriy";
		String  name2="Andriy";
		
		
		String name3=new String(); //empty string
		String name4=new String(name);
		String name5=new String(new char[] {'P','e','t','r','o'}); 
		String name6=new String(new char[] {'P','e','t','r','o'},0,3); //0 - start index 3 -count symbol
		
		String name7=null;
//		System.out.println(name==name2);
//		name="andriy";
//		System.out.println(name==name2);
//		System.out.println(name3.isEmpty());
//		if (name7==null || name7.length()==0) System.out.println("name7 is empty");
//		System.out.println(name4);
//		System.out.println(name5);
//		System.out.println(name6.length());
//		String value=String.valueOf(5);
//		System.out.println(value);
//		value=String.valueOf(0.5);
//		System.out.println(value);
//		value=String.valueOf(true);
//		System.out.println(value);
		String rezult=String.format("%s has %d years old", name,21) ;
		System.out.println(rezult);
//	
//		/*
//		 * %a HEX with .
//		 * %b  => boolean
//		 * %c  => char
//		 * %d => int
//		 * %h  => hashCode
//		 * %e  => 2.6e-7
//		 * %f => double, float
//		 * %o => Oct
//		 * %n => \n
//		 * %s => String
//		 * %t => date and time
//		 * %x => HEX
//		 * %% => ������� %
//		  */
//		double number=34.0/45.0;
//		System.out.println(number);
//		System.out.println(String.format("Number=%.8f",number));
//		System.out.println(name.concat(name2).length());
//		System.out.println(name.isEmpty());
		name="Andriy";
		System.out.println(name.charAt(2));
		System.out.println(name.contains("dr"));
		System.out.println("Andriy has 21 years old".startsWith("And"));
		System.out.println("Andriy has 21 years old".endsWith("Old"));
		System.out.println("  Andriy has 21 years old  ".trim());
		System.out.println("Andriy has 21 years old".toLowerCase());
		System.out.println("Andriy has 21 years old".toUpperCase());
		System.out.println("Andriy has 21 years old".indexOf("21",10));
		System.out.println("Andriy has 21 years old".substring(7, 14));
		String[] arrayWord =rezult.split(" ");
		System.out.println(Arrays.toString(arrayWord));
		System.out.printf("Дійсне число %f. Та вставка рядка \\n\"%s\" ", 12.5,"Я РЯДОК");
    	System.out.println();
    	System.out.println("Today %n \"Hello\"");
		 String name1 = "Петро";
		    int $age1 = 10;
		    float height = 0.72f;
		    System.out.printf("Ім\'я: %s  Вік: %d  Ріст: %.2f\n", name1, $age1++*2, 2*++height);
		    System.out.println($age1++);
		  
		 //StringBuffer sb="test"; //������� ���������
		    StringBuffer sb0=new StringBuffer(20);
		 StringBuffer sb=new StringBuffer("test"); //������� ���������
		 sb.append('-').append("test");
		 System.out.println(sb);
		 sb.append(true);
		 sb.append(1);
		 System.out.println(sb);
		 sb.insert(4, " info!!!");
		 System.out.println(sb);
		 System.out.println(sb.toString());
		 StringBuffer sb2=new StringBuffer(sb);
		 sb2.reverse();
		 System.out.println(sb2);
//		 
		 StringBuffer b3=new StringBuffer("PilIp");
		 StringBuffer b4=new StringBuffer(b3);
		 b4.reverse();
		 System.out.println(b3);
		 System.out.println(b4);
//		 if (b3.toString().equals(b4.toString())) {
//			 System.out.println("polindrom");
//		 }
//		 else {
//			 System.out.println("not polindrom");
//		 }
		 if(b3.toString().toUpperCase().equals(b4.toString().toUpperCase())) {
			 System.out.println("polindrom");
		 }
		 else{
			 System.out.println("no polindrom");
		 }
//		 
		 
//		String name = "Andriy";
//	    int age = 10;
//	    float height = 0.72f;
//	    if (--age<30) {
//	      age = 2*age++;
//	      height = 2*++height;
//	    }
//	    else {
//	      age = 2*++age;
//	      height = 2*height++;
//	    }
//	    System.out.printf(" %s  вік: %d  висота: %.2f\\n", name, age, height);
//	   
		    
		    
	}

}
