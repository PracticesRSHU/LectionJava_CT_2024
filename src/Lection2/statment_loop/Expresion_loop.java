package Lection2.statment_loop;

public class Expresion_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Створіть програму, що виводить на екран перші 55 елементів послідовності 1 3
		 * 5 7 9 11 13 15 17 ...
		 */
		for(int i=1,j=1; i<=5; i+=2,j-- )
			{
				System.out.println("\nHello");
				System.out.print(i+" "+j);
			}
		
		for(int i=1,j=1; i<=5; )
		{
			System.out.println("\nHello");
			System.out.print(i+" "+j);
			i++;
			j--;
		}
//		int i;
		for(int i=1;i<2;i++)
		{System.out.println("\nHello!");
		}
		int n = 55;
		int x=1;
		while (x<=n) //1<=55
		{
	    	System.out.print(x+" ");
			x+=2;
		}
//		
		System.out.println(x);//57
		x=1;
		do {
			System.out.println(x);
			x+=2;
		}while(x<=n);

//		int i;
		int j=1;
		for (int i = 1; i <= n/2; i++) {
			System.out.print(j + " ");
			j+=2;
		}

//		System.out.println("Java");
//		i=1;
//		int S=0;
//		while(i<=10) {
//			S+=i; //S=S+i;
//			System.out.print("S="+S);
//			if (i==5) break;
//			i++;
//			System.out.println(" i="+i);
//		}
//		
//		System.out.println("S="+S);
//		i=0;
//		S=0;
//		do {
//			i++;
//			//System.out.print(" i="+i);
//			S+=i;
//			//System.out.println("S="+S);
//		}while(i<10);
//		
//		System.out.println("S="+S);	

//		for (int i = 1; i < 10; i++) {
//			if (i  == 5)
//				break;
//			System.out.println(i + " ");
//			System.out.println(i * i + " ");
//
//		}
//
//		for (int i = 1; i < 10; i++) {
//			if (i % 2 == 1)
//				continue;
//			System.out.println(i + " ");
//			System.out.println(i * i + " ");
//
//		}
	}

}
