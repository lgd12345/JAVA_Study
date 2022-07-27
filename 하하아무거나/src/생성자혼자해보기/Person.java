package 생성자혼자해보기;

public class Person {
	
	private String name;
	private double height;
	
	//기본생성자 꼭 x
	public Person() {
		System.out.println("새로운 사람을 생성해보세요!");
	}
	
	//매개변수가 있는 생성자 soure로 만들면됨
	public Person(String name,double height) {
		this.name = name;
		this.height = height;
	}

	//게터세터 만들기 soure로 만들면됨
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
