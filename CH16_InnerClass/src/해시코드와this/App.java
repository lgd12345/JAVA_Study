package 해시코드와this;

public class App {

	public static void main(String[] args) {
		Fox fox1 = new Fox();
		System.out.println(fox1);
		System.out.println(fox1.toString());
		//16진수로변환하면 저렇게 됨
		System.out.printf("%x\n",fox1.hashCode());
		
		Fox fox2 = fox1;
		System.out.println(fox2);
		System.out.println(fox2.name);
	}

}
