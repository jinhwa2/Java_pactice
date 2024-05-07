package com.kh.ExceptionEx;

import java.util.*;

/*
 Exception = ����
  ���ܴ� �ڵ�� ó�������� ����
 
 try {
 	
 	//���� ���ܸ� �߻���ų �� ������
 	 �ۼ��ؼ� �õ��ϰ����� �ڵ带 �ۼ�
 } catch(Exception e) {
 	���ܰ� �߻����� �� ������ �ڵ峪 ������ �ۼ���
 }
  
  catch���� ���������� �ۼ��� �� ����
  catch �� ������ �� ���
                  catch(�迭Exception e)
                        ....
                  
  		�� �������� catch(Exception e) �� �������� �ۼ��� ���ְ�
 * */
public class ExceptionEx {
	private Scanner sc = new Scanner(System.in);

	// �⺻������
	public ExceptionEx() {

	}

	// �޼��� 2�� �����
	public void method1() {
		// index 0 1 2 3
		int[] �迭 = { 10, 20, 30, 40 }; // ������ �ε���3

		// for length = 4
		for (int i = 1; i <= �迭.length; i++) {

			try {//�õ��ϴ�

				System.out.println(�迭[i]);
			
			} catch (ArrayIndexOutOfBoundsException e) {//RuntimeException����
				System.out.println("1�� ���ܻ���.");

			} catch (Exception e) {
				System.out.println("�迭�� �ε����� ������ϴ�.");
			
			}
		}
	}

	// ���θ޼���
	public static void main(String[] args) {
		ExceptionEx ���ܹ߻� = new ExceptionEx();
		���ܹ߻�.method1();
	}

}