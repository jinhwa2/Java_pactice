package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		//��ȭ ��ü�ڴ� ���� �� �ּҿ� �츮���� ��� ������ ���(��Ʈ��ȣ)����
		
		//���� ���� ��Ʈ ��ȣ�� �����ؼ� ServerSocket ����
		
		try {
			ServerSocket s = new ServerSocket (12352);
			//System.out.println("������ �� ��ȣ�� ���Ƚ��ϴ�.");
			System.out.println("party chat open"); 
			
			
			// �츮���� �湮�ϴ� �մ��� ������ ����
			
			Socket b = s.accept();
			System.out.println("client success"); //�� �� �������� Ȯ��
			
			
						
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
												
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			
			out.println(" hi server !");
			
			// �����ڿ��� ���� �޼��� ���� �� ���
			String m ;// = in.readLine();
			
			while( (  m = in.readLine() )    != null) {
				System.out.println("send success : " + m);
				
				out.println("ccccc hhhhh eeeee cccc kkk");
				
			}
			
			
			
			
			
			
			
			b.close();
			s.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}