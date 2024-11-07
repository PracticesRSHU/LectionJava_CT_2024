package Lection9_Exceptions.example1;

public class AppTest {

	public static void main(String[] args) {
		int i=0;
		String data="kjkjk";
		try {
		i=Integer.parseInt(data);
		}catch(NumberFormatException ex) {
			System.err.println(ex.getMessage());
		}
		System.out.println("i="+i);

	}

}
