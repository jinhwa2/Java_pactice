package com.kh.oop.method;

public class MethodEx {
	/*
	�޼���
	Ŭ���� ���ο� ����
	Ư�� ����� �ϴ� �ڵ带 ��� ��Ÿ�� ��
	
	 1. ���θ޼���
	 �ڹ� ���α׷��� ������ �� ����ϴ� �޼���
	 �ۼ��� �޼��峪 ������ ȣ���ؼ� �������� �����ϴ� �޼���
	 public static void main(String[] args){
	 
	 }
	 
	 2. �����ڸ޼��� 
	 �����ڴ� �޼����� �̸��� �ٿ��� ���� ��������� ������ �޼����� �� ����
	 Ŭ�������� ���ϸ��� �����ڸ��� �����ؾ���                                                                                   
	 
	 3. void�޼���
	 ��ȯ�ϴ� ���� ���� �޼���
	 �޼��尡 ������ ������ ���� �� � ���� ��ȯ���� ����
	 	1) �Ű������� ���� void �޼���
	 	public void method() {
	 		System.out.println("hi~");
	 	}
	 	2) �Ű�����(�߸��߰��� ���ϴ¼���)�� �ִ� void �޼���
	 		public void method(�ڷ��� �Ű�����) {
	 			System.out.println("���� a : "+a);
	 	}
	 
	 4. return�޼���
	 	 ���� ��ȯ�ϴ� �޼���
	 	 �޼��尡 ����Ǹ� ����� ��ȯ�ϰ�, 
	 	 �޼��带 ȣ���� ���� ��ȯ�� ���� ����
	 	 
	 	 public �ڷ���  method(�ڷ��� �Ű�����) {
	 	 	return �ڷ����� �ش��ϴ� ������;
	 	 
	 	 }
	 	
	 	1) ruturn ���� String �� �� 
	 	public String method(String str) {
	 		return str;
	 	}
	 	
	 	2) return ���� int �� ��
	 	public int method(int num) {
	 		int abc = num;
	 		rdturm abc;
	 	}
	 	
	 	3) return ���� �ʵ忡 ���� �ְų� ���� ���� ���� ���� ��
	 	String str;
	 	public String method() {
	 		return str;
	 
	 * */	
	//�⺻������
	public MethodEx() {
		
	}
	//�޼���
	public void ������1��(int a, int b) {
		int ���ǰ�� = a +b;
		System.out.println("�������� : "+���ǰ��+"�Դϴ�.");
	}
	
	public int ������2��(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		MethodEx met =new MethodEx();
		
		met.������1��(5,3);
		
		
		
		
		int ��� = met.������2��(7,4);
		System.out.println("����� :"+ ���);
	}

}