package Lection9_Exceptions.example2_v2;

public class Methods {
	private double a;
	private double b;
	public Methods() {
		this.a = 0;
		this.b = 0;
	}
	public Methods(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double div(double first, double second) {
		test_exception(a,b);
		return first/second;
	}
	
	public void test_exception(double a, double b) {
		try {
			if(a<0 && b<0)
				throw new IllegalArgumentException(a+"<0 and "+b+"<0");
			if(a>0 && b>0) 
				throw new MyException(a+">0 and "+b+">0");
		}catch(IllegalArgumentException ex) {
			//Logger.getLogger(this.getClass().getName()).log(Level.SEVERE,null, ex);
			System.out.println(ex.getMessage());
		}catch(MyException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	
	
	
//	public double sum(double first, double second)  {
//	try {
//		test_exception1(first, second);
//	} catch (IllegalArgumentException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (MyException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	return first+second;
//}
//
//public double div(double first, double second) {
//	try {
//		test_exception1(first, second);
//	} catch (IllegalArgumentException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (MyException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	return first/second;
//}	
//	public void test_exception1(double a, double b) throws IllegalArgumentException,MyException  {
//		
//			if(a<0 && b<0)
//				throw new IllegalArgumentException(a+"<0 and "+b+"<0");
//			if(a>0 && b>0) 
//				throw new MyException(a+">0 and "+b+">0");
//	}
	
	
	

}
