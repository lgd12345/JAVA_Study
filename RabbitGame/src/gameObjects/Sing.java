package gameObjects;



public class Sing extends GameObject{
	public Sing() {
		setId(2);
		setNameO("노래");

		n1.add("노래를 선택하셨습니다.");
		n1.add("토끼가 노래를 듣기 싫어합니다.");
		n1.add("토끼 사망");
		n1.add("++++++++++++");
		n1.add("+          +");
		n1.add("+    ☠    +");
		n1.add("++++++++++++");
		n1.add("게임을 종료 합니다.");
		// n1.forEach(s ->System.out.println(s));
	
	}

}
