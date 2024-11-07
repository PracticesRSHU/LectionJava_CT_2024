package Lection9_Exceptions.example2_v2;

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
		double a=-5, b=-7;
		Methods m=new Methods(a,b);
		System.out.println("Division="+m.div(a, b));
		
			
	}
	
		

}
