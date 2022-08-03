package gameObjects;

public class Food extends GameObject {
	public Food() {
		setId(1);
		setNameO("맛있는 풀");

		n1.add("맛있는 풀을 선택하셨습니다.");
		n1.add("맛있는 풀을 토끼가 맛있게 먹습니다.");

		n1.add("++++++++++++");
		n1.add("+      히히 +");
		n1.add("+   🥗🐇   +");
		n1.add("++++++++++++");
		n1.add("HP가 생성됩니다.");
		// n1.forEach(s ->System.out.println(s));

	}

}
