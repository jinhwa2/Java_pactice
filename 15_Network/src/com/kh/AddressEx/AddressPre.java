package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	
	public static void main(String[] args) {
		//www.google.com ȣ��Ʈ���� IP�ּ� ��������
		try {
			InetAddress �����ּ� = InetAddress.getByName("www.google.com");
			System.out.println("���� �ּ�: "+�����ּ�.getHostAddress());
			System.out.println("ȣ��Ʈ�� :"+�����ּ�.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ���� ��ǻ�� �̸��� �ڸ���ȣ Ȯ���ϱ�
		//get localhost
		try {
			InetAddress �����ڸ� = InetAddress.getLocalHost();
			System.out.println("���� ��ǻ�� �̸��� �ڸ���ȣ:"+�����ڸ�);
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		}
	}
}