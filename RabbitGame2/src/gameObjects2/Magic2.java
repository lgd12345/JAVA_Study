package gameObjects2;

public class Magic2 extends GameObject2 {
	public Magic2() {
		setId(2);
		setNameO("마법");

		n1.add("마법스킬을 발견하셨습니다.");
		n1.add("MP가 생성됩니다.");
		n1.add("지금부터 마법스킬을 사용할 수 있습니다.");
		n1.add("++++++++++++");
		n1.add("+ 깔깔   💫 +");
		n1.add("+ ✨ 🐇    +");
		n1.add("++++++++++++");
		// n1.forEach(s ->System.out.println(s));
	}

}
