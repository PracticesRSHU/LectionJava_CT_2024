package Lection7_8.exampleLambda;

import java.util.function.BinaryOperator;

public class LambdaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operationable operation;
//		operation=(x,y)->x+y;
//		double result=operation.calculate(12.5, 5.5);
//		System.out.println("Result="+result);
		Operationable operation1=new Operationable() {

			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x+y;
			}
			
		};
		System.out.println(operation1.calculate(12.5, 5.5));
		
		Operationable operationMultiply=(double x, double y)->x*y;
		Operationable operationDiv=(double x, double y)->{ 
			if(y==0) return 0;
			return x/y;
			};
		System.out.println(operationMultiply.calculate(2,3));
		System.out.println(operationDiv.calculate(2,3));
		System.out.println(operationDiv.calculate(2,0));
		
		Operation	operation4 =(text)->"Return "+text;
		System.out.println(operation4.calc("using lambda func"));
		Operationable1<Integer> op1=(x,y)->x*y;
		Operationable1<Double> op2=(x,y)->x-y;
		Operationable1<String> op3=(x,y)->x+y;
		System.out.println(op1.calculate(23, 45));
		System.out.println(op3.calculate("Test 1 ", "Test 2"));
	    /*
		Predicate<T>
		Consumer<T>
		Function<T>
		Supplier<T>
		UnaryOperator<T>
		BinaryOperator<T>
			*/
		
		BinaryOperator<Integer> multiply=(x,y)->x*y;
		System.out.println(multiply.apply(2,3));
	}
	
	interface Operationable{
		double calculate(double x, double y);
	}
	interface Operationable1<T>{
		T calculate(T x, T y);
	}
	
	interface Operation{
		String calc(String text);
	}
	
}
