package com.kh.oop.method.ex;

public class PizzaStore {
//필드
	public String pizzaName;
	public int pizzaPrice;

//메서드
	// Setter
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}

	// Getter
	public String getPizzaName() {
		return pizzaName;
	}

	public int getPizzaPrice() {
		return pizzaPrice;
	}

//생성자 : 기본
	public PizzaStore() {

	}

//생성자: 필수
	public PizzaStore(String pizzaName, int pizzaPrice) {
		this.pizzaName = pizzaName;
		this.pizzaPrice = pizzaPrice;
	}

//void
	public void info() {
		System.out.println("피자이름은: " + pizzaName);
		System.out.println("피자가격은: " + pizzaPrice);
	}

//main
	public static void main(String[] args) {
	//객체생성
		PizzaStore 피자1 = new PizzaStore();
		
		피자1.setPizzaName("고사리피자");
		피자1.setPizzaPrice(600000);
		피자1.info();
		System.out.println("=========================");
		
		PizzaStore 피자2 = new PizzaStore();
		피자2.setPizzaName("양파피자");
		피자2.info();
		System.out.println("=========================");
		
	    PizzaStore 피자3 = new PizzaStore("감자피자",200000);
	    피자3.info();
	    
	}
}
 















