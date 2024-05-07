package practice3.model.vo;

//동물 추상클래스 가져오기
public class Dog extends Animal{
//필드
	public static final String PLACE = "애견카페";
	//메서드
	//Setter
	private int weight;
public void setWeight(int weight) {
		this.weight = weight;
	}
	//게터
	public int getWeight() {
		return weight;
	}
	//생성자 : 기본
		 
	

public  Dog () {
	
	
	
	
}
	public Dog(String name, String kinds,int weight) {
		super(name,kinds);  //Animal 밑에 이미 있는 name kinds를 바라보게 하기 위해서
		this.weight = weight;
	}

	//
	public void speak() {
		System.out.println(super.toString()+ "몸무게는"+weight+"kg 입니다.");
	}







}