package application;

public class Cat {
	
	private String name;
	//스태틱상수는 final
	public static final String Food = "고양이사료";
	//스태틱변수는 공유해서 값을 사용가능 초기값0
	public static int count = 0;
	
	
	
	public Cat(String name) {
		this.name = name;
		count++;
	}
	
	//스테틱 메소드는 인스턴스변수 사용할 수 없다.
	public static int getCount() {
		//name = "이름";
		return count;
	}
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cat [name= " + name + "]";
	}

}
