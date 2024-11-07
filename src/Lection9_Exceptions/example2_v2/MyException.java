package Lection9_Exceptions.example2_v2;

public class MyException extends Exception {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	MyException() {
		super("a>0 and b>0");
	}
	
	MyException(String s) {
		super(s);
	}

}
