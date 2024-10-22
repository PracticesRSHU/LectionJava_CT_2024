package Lection2.statmant_block_if_switch;

import java.lang.Math;
import java.util.Scanner;

public class Expresion_is_switch_enum {

	int k = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = 7;
		double d = 56.986;
		System.out.println(Math.round(d));
		{
			int h = 7;
			t = 8;
			System.out.println(t + " " + h);
		}
		// System.out.println(h);// error compile => not access
		int age = 24;
		if (age < 21) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		//
		int l = 8;
		int k = 8;
		if (l > k) {
			System.out.println("l>k");
		} else if (l < k) {
			System.out.println("l<k");
		} else {
			System.out.println("l=k");
		}
		if (l > k) {
			System.out.println("l>k");
		}
		if (l < k) {
			System.out.println("l<k");
		}
		if (l == k) {
			System.out.println("l=k");
		}
		System.out.println(10/0.0); //infinity
//		System.out.println(10/0); //divizion by zero
		// Задача: Чи входить змінна х в проміжок -1<=x<=3 [-1;3] або (5;infinity)
		double x = 2.8575;
		if (x >= -1 && x <= 3) { // ||
			System.out.println("Yes!");
		} else if (x > 5) {
			System.out.println("Yes!");
		} else {
			System.out.println("No");
		}
		System.out.printf("Rezult x=%.2f", x);

		int k1 = 2;
		int k2 = 5;
		int rez1 = 2 & 5;// 010*101 => 000
		boolean rez2 = ((2 > 4) && (k1 < k2));
		System.out.println("k1=" + k1 + " k2=" + k2 + " rez1=" + rez1 + " rez2=" + rez2);
		d = (t + t) * t;
		System.out.println(d);
		int t1 = 8;
		String t2 = "Java";
		System.out.printf("\nEducation %s '\t' version %d\n", t2, t1);

		// Statment switch
		Scanner in=new Scanner(System.in);
		System.out.println("Input value day");
		String day = "Monday";
		day=in.next();
	    
		switch (day) {
			case "Monday":
			case "Tuesday": { // t4==2
				System.out.println("C++");
				System.out.println("Java");
				break;
			}
			case "Wednsday": {
				System.out.println("C");
				System.out.println("JavaScript");
				break;
			}
			default:
				System.out.println("Holliday!");
			}
//
		
		Days day1 = Days.WEDNESDAY;
//		day1=Days.valueOf(day.toUpperCase());
		switch (day1) {
		case MONDAY:
		case TUESDAY: { // t4==2
			System.out.println("C++");
			System.out.println("Java");
			break;
		}
		case WEDNESDAY: {
			System.out.println("C");
			System.out.println("JavaScript");
			break;
		}
		default:
			System.out.println("Holliday!");
		}
		float number=in.nextFloat();
		// System.out.println(day1);
		in.close();
	}

}

enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THUESDAY, FRIDAY, SATURDAY, SUNDAY
}
