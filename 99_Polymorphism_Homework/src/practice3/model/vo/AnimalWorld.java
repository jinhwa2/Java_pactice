package practice3.model.vo;

import java.util.Random;

//true �� �䳢
//false �� ���� ��
public class AnimalWorld {
	public static void main(String[] args) {
	//5��¥�� Animal Ÿ���� ��ü �迭 ����
	Animal[] animals = new Animal[5];
	//������
	Random random = new Random();
	
	for(int i=0; i <animals.length; i++) {
		if(random.nextBoolean()) {
//	        public Rabbit(String name, String kinds,      int weight, String color
			animals[i] = new Rabbit("�����"+i ,"�䳢",random.nextInt(20)+1,"����");
		} else {
//          String name, String kinds, String location, String color
			animals[i] = new Horse("������"+i, "��踻", "�츮��", "��&������");
		}
	
		}
	//for = each ���� ����ؼ�
	for(Animal a : animals) {
		a.speak();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
