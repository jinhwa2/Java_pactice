package com.kh.javaAPIEx;

/*
 String : ���ڿ��� ��Ÿ���� Ŭ����
  		  ���ڿ��� �����ϰ� �����ϴµ� ���
  		  
  String str = new String(); -String���� �� ����� ������� ����
  String str = "";
  
  �ڵ��׽�Ʈ�� ���ڸ� �ڸ��� ������ �� ����ϴ� �޼��带 �ۼ�
  substring : ���� �����ϰ� ���� ���ں��� ������ ���� ���ڰ��� �����ؼ� ������ �� ����
  substring(���ۼ���,�����¼���) = �ε���
  substring(���ۼ���)          = ���ۼ��ں��� ������ ���ڱ��� ��� �����ϰų� ���
  
  toUpperCase() = ���ϴ� ���ڿ��� ��� �빮�ڷ� ��ȯ
  toLowerCase() = ���ϴ� ���ڿ��� ��� �ҹ��ڷ� ��ȯ
         trim() = ���ϴ� ���ڿ��� �� �� ������ ��� �����ؼ� ����	
        split() = ���ڿ��� Ư�� �����ڸ� �������� �����Ͽ� ���ڿ� �迭�� ��ȯ
      replace() = ���ڿ����� Ư�� ���ڿ��� ���ο� ���ڿ��� ��ü
       charAt() = ���ڿ����� �־��� �ε����� �ش��ϴ� ���ڸ� ��ȯ
         
         
 */

public class StringEx {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + " " + str2;
		System.out.println(str3);

		
		//������ �÷���
		//�ڵ����� ����ϰ� '������ �ʴ�' ���� �ڵ����� ���ִ� ��
		//Garbage ������ -> ������ �ʾ� �׷� �ʿ䰡����?
		//������!
		String phone = "010";
		phone += "1234-5678";
		System.out.println(phone);
		//              0 1 2 3 4 5 6 7 8 9 10 11
		String ���ڿ� = "Hello World";
		//1.subString()
		String ���꽺Ʈ�� = ���ڿ�.substring(6);
		System.out.println(���꽺Ʈ��);
		  //6���� 7������ �����شٴ� �ǹ�//8�������� ������� ����
		String ���꽺Ʈ��1 = ���ڿ�.substring(6,8);
		System.out.println(���꽺Ʈ��1);
		
		//2.toUpperCase()
		String �빮�� = ���ڿ�.toUpperCase();
		System.out.println("�빮�� �³��� :"+�빮��);
		//3.toLowerCase
		String �ҹ��� = ���ڿ�.toLowerCase();
		System.out.println("�ҹ��� �³���:"+�ҹ���);
		//4.trim() = ������ ���� ����
		String ���鰡�� = "     Hello world     ";
		String �������� = ���鰡��.trim();
		System.out.println("�������� �Ƴ���:"+��������);
	
		// 5.split ���ڿ��� Ư�� �����ڸ� �������� �����ؼ� ���ڿ� �迭�� ��ȯ
		String ���ϵ� = "apple,banana,grape";
		String[] ���Ϲ迭 = ���ϵ�.split(",");
		
		for(String ���� : ���Ϲ迭) {
			System.out.println(����);
		}
		// 6.replace Ư�����ڿ��� ���ο� ���ڿ��� ��ü
		String ��ο���� = "Hello, World!";
		String ���� = ��ο����.replace("Hello","Hi");
		System.out.println(����);
		
		// 7.charAt ���ڿ����� �־��� �ε����� �ش��ϴ� ���� �ϳ��� ��ȯ
		String ���̿��� = "Hi, World";
		char ch = ���̿���.charAt(8);
		System.out.println(ch);
	}

}