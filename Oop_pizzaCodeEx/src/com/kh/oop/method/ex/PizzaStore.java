package com.kh.oop.method.ex;

public class PizzaStore {
//�ʵ�
	public String pizzaName;
	public int pizzaPrice;

//�޼���
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

//������ : �⺻
	public PizzaStore() {

	}

//������: �ʼ�
	public PizzaStore(String pizzaName, int pizzaPrice) {
		this.pizzaName = pizzaName;
		this.pizzaPrice = pizzaPrice;
	}

//void
	public void info() {
		System.out.println("�����̸���: " + pizzaName);
		System.out.println("���ڰ�����: " + pizzaPrice);
	}

//main
	public static void main(String[] args) {
	//��ü����
		PizzaStore ����1 = new PizzaStore();
		
		����1.setPizzaName("���縮����");
		����1.setPizzaPrice(600000);
		����1.info();
		System.out.println("=========================");
		
		PizzaStore ����2 = new PizzaStore();
		����2.setPizzaName("��������");
		����2.info();
		System.out.println("=========================");
		
	    PizzaStore ����3 = new PizzaStore("��������",200000);
	    ����3.info();
	    
	}
}
 














