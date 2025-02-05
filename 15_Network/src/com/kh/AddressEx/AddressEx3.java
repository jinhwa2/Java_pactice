package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx3 {
	public static void main(String[] args) {
		try {
			InetAddress 주소이름 = InetAddress.getByName("www.google.com");
			System.out.println("getByName으로 구글을 가져온 이름 : "+주소이름);
			
			// getLocalHost 를 이용해서 내 집주소를 가져오고 집주소에대한 상세 정보 확인
			// 내 집주소에 대한 영어주소이름 내 컴퓨터 숫자 주소
			InetAddress 내집주소 = InetAddress.getLocalHost();
			System.out.println("나의 집 주소 : "+내집주소);
			
			// 멀티캐스트 주소 여부 확인
			
			// 한 컴퓨터에서 2개 이상의 컴퓨터에 동시로 파일 전송하는 방법
			// byte[] 주소를 활용한 객체 가져오기
			// 루프백 주소 현재 컴퓨터 자체를 가리키고 외부 연결을 하지 않고 내 컴퓨터 사용
			byte[] ipAddress = {127, 0, 0, 1}; //숫자가 어떻게 왔는지 아는게 아니라 전세계가 동일하게 사용
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println(byAddress);
			
			
			
			
			//System.out.println(내집주소);
			
			
			//getByName 영어주소와 숫자주소를 한 번에 가져옴
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//www.facebook.com 페이스북 호스트이름 호스트주소
		//www.instagram.com 인스타그램 호스트이름 호스트주소 검색
		try {
			InetAddress 페이스북 = InetAddress.getByName("www.facebook.com");
			System.out.println("페이스북 호스트이름: "+페이스북.getHostName());
			System.out.println("페이스북 호스트주소: "+페이스북.getHostAddress());
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		}
		
		try {
			InetAddress 인스트그램 = InetAddress.getByName("www.instagram.com");
			System.out.println("인스트그램 호스트이름 :"+인스트그램.getHostName());
			System.out.println("인스트그램 호스트주소 :"+인스트그램.getHostAddress());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	
	}

}
