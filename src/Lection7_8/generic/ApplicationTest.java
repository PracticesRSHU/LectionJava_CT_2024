package Lection7_8.generic;

public class ApplicationTest {

	public static void main(String[] args) {
		Account<String, Float> accountBank1=new Account<String,Float>("34567", 20000.00f);
		String accountBank1Id=accountBank1.getId();
		System.out.println(accountBank1Id);
		
		//Account<Integer, Double> acc2=new Account<Integer, Double>(35687, 45677.98);
		Account<Integer,Double> accountBank2=new Account<Integer,Double>(34567, 20000.00);
		Integer accountBank2Id=accountBank2.getId();
		System.out.println(accountBank2Id);

		
	}

}
