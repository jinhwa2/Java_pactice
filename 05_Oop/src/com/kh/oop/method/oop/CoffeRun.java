package com.kh.oop.method.oop;

public class CoffeRun {
//���� ��� ���� �޼���
	public static void main(String[] args) {
		//Ŀ�� �����ϱ�
		CoffeeMaker cm = new CoffeeMaker("�Ƹ޸�ī��",1,false);
		
		//Ŀ�� ���� �ۼ�
		CoffeeStore cs = new CoffeeStore(cm,"�����","����� ������");
		
		//�ֹ� �� ����
			cs.orderCoffee();	
	}
}