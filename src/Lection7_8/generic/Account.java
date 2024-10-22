package Lection7_8.generic;

public class Account<T,V> implements Accountable<T> {
	private T id;
	private V suma;
	
	Account(T id, V suma){
		this.id=id;
		this.suma=suma;
	}
	
	public V getSuma() {
		return suma;
	}
	
	public void setSuma(V suma) {
		this.suma = suma;
	}
	
	@Override
	public T getId() {
		return id;
	}
	
	
	
}
//public class Account<T> implements Accountable<T>{
//	private T id;
//	private float suma;
//	
//	Account(T id, float suma){
//		this.id=id;
//		this.suma=suma;
//	}
//
//	@Override
//	public T getId() {
//		
//		return id;
//	}
//
//	@Override
//	public float getSuma() {
//		
//		return suma;
//	}
//
//	@Override
//	public void setSuma(float suma) {
//		this.suma=suma;
//		
//	}
//	
//	
//	
//}
