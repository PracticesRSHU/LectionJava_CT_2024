package lection3;

public class AppTestFunctions {

	public static void main(String[] args) {

		hello();
		hello();
		int s=suma(3,4);
		System.out.println("s="+s);
		
		float s1=suma(3.0f,4.0f);
		System.out.println("s="+s1);
		
		System.out.println("suma="+suma("masiv: ",3,4,5,6));
	}

	static void hello() {
		System.out.println("hello");
	}
	
	static int suma(int a, int b) {
		return a+b;
	}
	
	static float suma(float a, float b) {
		return a+b;
	}
	//функція із параметром змінної довжини
	//перевантаження функції suma
	static int suma(String message, int ...number) {
		System.out.println(message);
		int s=0;
		for (int n : number) {
			s+=n;
		}
		return s;
	}
	
}
