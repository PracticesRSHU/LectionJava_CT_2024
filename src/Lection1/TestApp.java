package Lection1;
import java.lang.Math;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("Byte: min=" + Byte.MIN_VALUE + ", max=" + Byte.MAX_VALUE);
		System.out.println("Short: min=" + Short.MIN_VALUE + ", max=" + Short.MAX_VALUE);
		System.out.println("Integer: min=" + Integer.MIN_VALUE + ", max=" + Integer.MAX_VALUE);
		System.out.println("Long: min=" + Long.MIN_VALUE + ", max=" + Long.MAX_VALUE);
		System.out.println("Float: min=" + Float.MIN_VALUE + ", max=" + Float.MAX_VALUE);
		System.out.println("Double: min=" + Double.MIN_VALUE + ", max=" + Double.MAX_VALUE);
		int x=300000;
		System.out.println(x*x);
		System.out.println(1f / 0f);
		System.out.println(0.0/ 0.0);
		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		i=3;
		System.out.println(++i);
		i=3;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(45/8.0);
		int x1=5; //101.   >>2 =>  1
		System.out.println(x1>>2); // => 1
		System.out.println(x1<<2); //10100
		i = 10;
		int n = i++% 5;
		System.out.println(n);
		System.out.println(Math.ceil(4.5));
		System.out.println(Math.ceil(4.2));
		System.out.println(Math.floor(4.5));
		System.out.println(Math.floor(4.2));
		System.out.println(Math.round(4.2));
		System.out.println(Math.round(4.5));
	}

}
