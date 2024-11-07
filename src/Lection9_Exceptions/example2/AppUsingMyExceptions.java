package Lection9_Exceptions.example2;

import java.lang.System.Logger;
import java.util.logging.Level;
/*
 * ЗАВДАННЯ 4. Створити свій Exception (MyException). 
 * Створити клас Methods та описати в ньому методи, 
 * які б виконували додавання, віднімання, множення, ділення двох змінних. 
 * При цьому врахувати :
   якщо a<0 і b<0 викидаємо IllegalArgumentException
   якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
   якщо a=0 і b=0 викидаємо IllegalAccessException
   якщо a>0 і b>0 викидаємо MyException
   Протестувати всі можливі варіанти, і вивести все на консоль.
 * */

public class AppUsingMyExceptions {

	public static void main(String[] args) {
		double a=5, b=-7;
		try {
			if(a<0 && b<0)
				throw new IllegalArgumentException(a+"<0 and "+b+"<0");
			if(a>0 && b>0) 
				throw new MyException(a+">0 and "+b+">0");
			
			System.out.println(a+"+"+b+"="+sum(a,b));
		}catch(IllegalArgumentException ex) {
			//Logger.getLogger(this.getClass().getName()).log(Level.SEVERE,null, ex);
			System.out.println(ex.getMessage());
		}catch(MyException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
	
	//variant1
	public static double sum(double first, double second) {
		return first+second;
	}
	
	public static double div(double first, double second) {
		return first/second;
	}

}
