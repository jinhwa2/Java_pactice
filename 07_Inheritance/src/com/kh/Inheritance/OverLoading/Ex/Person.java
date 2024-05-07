package com.kh.Inheritance.OverLoading.Ex;

public class Person {
 
	
	//�ʵ� : �������� �ۼ����ִ� ��
	private String name;
	private int age;
	
	//Getter  //�� �޼ҵ� ���� ���Ѵ�. �׷��� �޼��尡 �װŶ�� �� ȥ���� ���⸦ �Ѵ�
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//�޼��� : Ư�� �ൿ�� �ϱ� ���� ���� �ڵ�
	//setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//������ : �⺻ �����ε�(�Ȱ��� �޼��� �̸��ε� �ȿ� �ִ� �Ű������� �ٸ� �� ���)
	public Person() {
		
		
	}
	//������ : �ʼ� �����ε�(�Ȱ��� �޼��� �̸��ε� name�� �ʼ��� ���� ���ϴ� �޼���
	public Person(String name) {
		this.name = name;
		
	}
	//������ : �ʼ� �����ε�(�Ȱ��� �޼��� �̸��ε� name age�� �ʼ��� ���� ���ϴ� �޼���)
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//void
	public void displayInfo() {
		System.out.println("�̸� :"+name+ ", ����: "+age);
	}
}