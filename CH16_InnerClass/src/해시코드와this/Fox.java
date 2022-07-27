package 해시코드와this;

public class Fox {
	
	public String name;
	
	public Fox() {
		//Fox로 만든 객체를 this
		System.out.println(this);
		this.name = "폭스";
	}
}
