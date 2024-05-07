package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 IP �ּ� : ��ǻ�Ϳ��� ��Ʈ��ũ�� Ư�� ��ġ�� Ȯ���ϴµ� ����ϴ� ���� 
 
 ���� �⺻ �ּ� 
 �츮���ּ� = 192.168.0.1 localhost 127.0.0.1
 
 ���߿� �� ��ǻ�� ���� �ּҸ� �˰� �ʹٸ� ���̹� �˻�â�� ip�ּ� Ȯ��
 
 port = ��ũ��ũ ���� �����͸� �ְ� ���� �� �ִ� ��� 
 Ÿ���� ��ǻ�ͳ� ������, �Ǵ� Ư����ġ�� �� �� �ִ� ��ȣ 2�ڸ� 4�ڸ�  //���� �п����ǽ� �����µ� ��ΰ� ������� ���������ͷ�
 
 InetAddress : Java���� IP �ּҸ� ��Ÿ���µ� ���
 	ȣ��Ʈ���� IP�ּҰ��� ��ȯ, �����ο� ���� ���� �˻� ���� �����ϰ� ����
 	
 �޼���� :
 getByName(String host) : host ���� ���� ������ ��ȯ
 
 getHostName() : ȣ��Ʈ ���� ������
 
 getHostAddress() : IP�ּҸ� ������
  *
ȣ��Ʈ��: www.google.com
IP �ּ�:  142.251.130.4

����� �� �̸� �ּҿ� ���ڷ� �� �ּҰ� �ٸ������ �˻����� ���� ���� �˻����� �� ���� �ּҰ�
�ٸ��� ������ ���� ����� �� �̸��ּ� ������ ��¥ ������ ���� ���� �ּҸ� ��ȣ�ϱ� ����
�ӽ÷� �����ִ� ���� �ּ��̱� ������ ������ �ٸ��� �������� ����

  *
  *
  *
  *
  **/
public class AddressEx {
	//���� ���� main �޼���
	public static void main(String[] args) {
		//1. naver �� ���� �˾ƺ���
		try { // ������ �������� �𸣳� �ϴ� �õ��غ��� ���� try
			InetAddress �ּ� = InetAddress.getByName("www.naver.com");
			System.out.println("ȣ��Ʈ�� :"+ �ּ�.getHostName());
			System.out.println("IP �ּ� :"+ �ּ�.getHostAddress());
		
		} catch (UnknownHostException e) { // �õ����� �� ���ܰ� �߻��ϸ� ���� ����
		
			e.printStackTrace();
		}
		//2. daum �� ���� �˾ƺ���
		try {
			InetAddress �����ּ� = InetAddress.getByName("www.daum.net");
			System.out.println("ȣ��Ʈ�� :"+ �����ּ�.getHostName());
			System.out.println("IP �ּ� :"+ �����ּ�.getHostAddress());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	
	
		// 3. IP�ּҷ� daum.net �˻��ϱ�
		try {
			InetAddress ����IP = InetAddress.getByName("211.249.220.24");
			System.out.println("ȣ��Ʈ�� :"+ ����IP.getHostName());
			System.out.println("IP �ּ� :"+ ����IP.getHostAddress());
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	

	



}