package com.kh.FileEx;

import java.io.File;

/*
 * write close exists mkdir
 File
  �����̳� / ����(���丮) �� �����ϴ� Ŭ����
  ���� ����, ����, �̸�, ũ��, ������ ������, ���翩�� ���� ����� ����
 �޼���
  	boolean mkdir()         : ���� ���� //make ���� ����ũ ���丮
  	boolean mkdirs()        : ��η� �������� ��� ���� ����
  	boolean createNewFile() : ���� ����
  	boolean delete          : �����̳� ���� ����
  	String getName()        : ���� �̸� ������
  	String parent()         : ������ ����� ������ �˷���
  	String getPath()        : ���� ��ü ��� Ȯ��
  	boolean imFile()        : ���� File ��ü�� �����ϴ°� �����̸� true
  	boolean isDirectory()   : ���� File ��ü�� �����ϴ°� �����̸� true
  	boolean exists()        : �����̳� ������ �����Ѵٸ� true, ���ٸ� false
  	long    length()        : ���� ũ�� �˷���
  	long    lastModified()  : ���� ������ ������ �˷���
  	String[] list           : ���� �� ���� ����� String[] �迭�� ������
  	File[] listFiles()      : ���� �� ���� ����� File[] �迭�� ������
 * */

/*
 [������ ���]
 
  os : ��ǻ�Ͱ� ���������� �ƺ����� ���������� ��Ÿ���� �ü��
  
  		������    |   ������ �ƺ�
  		����	     |  ���丮
  		         |
  		
- ��� ǥ�� ���(���� ���, ������ġ ǥ��)
          \      |       /
- Java ���� /,\ ������� ��� ��η� ǥ�� �����ϰ� ������ �Ǿ� ����

		�������� : C:/ ���� �����ؼ� ��� �ۼ����ִ� ���
        ��
���     ��
        ������� : ���� ��ġ�� ������ ���� �������� ������ �ۼ����ִ� ��
                  ./     : ���� �� ���� ��ġ�� ��Ÿ��
                  ../    : ���� �� �������� �Ѵܰ� �� ���������� �̵��ϴ� ���� �ǹ�
 * 
 * */
public class FileEx {
	public static void main(String[] args) {
		//       C:/Users/user1/Desktop ����ȭ�鿡 ���� �����
		File ��������� = new File("c:/Users/user1/Desktop/newFFF");
		
		//����ȭ�鿡 newFFF ��� ������ �����ϴ��� Ȯ��
		System.out.println("�����մϱ�? :"+���������.exists());
		
		//���࿡ ������ �����Ѵٸ� ������ �̹� ����ȭ�鿡 �����մϴ�. ��� �ֱ��ϰ�
		if(���������.exists()) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			//���� ����
			���������.mkdir();
			System.out.println(���������.getName()); //���� �̸� Ȯ��
			System.out.println(���������.getPath()); //���� �ּ� Ȯ��
		}
		//�������� �ʴ´ٸ� ������ �������� �ʽ��ϴ�. ���� ������ֱ�
	}
}