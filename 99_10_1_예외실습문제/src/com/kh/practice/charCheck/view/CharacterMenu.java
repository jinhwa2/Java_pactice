package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String input = sc.nextLine();
		CharacterController controller = new CharacterController();
		try {
			int count = controller.contAlpha(input);
			System.out.println(" ' "+input+" ' 에 포함된 영문자 개수:"+count);
		} catch(CharCheckException e) {
			e.printStackTrace();
		}finally {
		sc.close();
	}
	
	}
	
}
	
	
	
		
