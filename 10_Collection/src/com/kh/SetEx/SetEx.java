package com.kh.SetEx;

import java.util.HashSet;

/*
 set(����, �ָӴ�)
 	������ �������� ����
 	�ߺ� ������ ����X(������ ������ �����)
 	
set�� HashSet(��ǥ)  : ó�� �ӵ��� ���� set
   �� LinkedHashSet :������ �����ϴ� set
   �� TreeSet       : �ڵ����ĵǴ� set
   
   HashSet ��� ����
   		��� ���� 1: ��ü�� equals() �����ε� �Ǿ� �־�� ��
   		��� ���� 2: ��ü�� hashCode() �����ε� �Ǿ� �־�� ��
   		
	Set<�ڷ���> �� = new HashSet<>();
	HashSet<�ڷ���> �ؽü� = new HashSet<>();
	
 * */
public class SetEx {

	public static void main(String[] args) {
		//�ߺ��� ������� �ʰ� �� ���� �����ϴ� ���� �����ؼ�
		//������ �ߺ� Ȯ�� ���� ���
		HashSet<String> set = new HashSet<>();
		//�����͸� �߰�             add
		set.add("�θǽ�");
		set.add("����");
		set.add("�׼�");
		set.add("������");
		System.out.println(set);
		/*�ڸ� ������ Ȯ��           get
		System.out.println(set.get(1));
		set �ڸ��� �����̰� Ư���ϰ� �ڸ���ȣ�� ������ �ڸ��� ����. set�� ȣ�ָӴ� ����
		*/
		//������ ����               remove
		set.remove("�θǽ�");
		System.out.println(set);
		//������ ũ�� Ȯ��           size
		System.out.println(set.size());
		//������ ��� ����           clear
		set.clear();
		//Ư�� �����Ͱ� �����ϴ��� Ȯ�� contains ,����Ʈ,��̸���Ʈ ��𼭵� ��밡��
		System.out.println(set.contains("������"));
		//Ŭ���� ���༭ ã���� ����
		
		//������ ����	���� ���� �ڸ����� ��� �Ұ�			  set
		

	}

}