package game;

import java.util.Scanner;

public class Game {
	// 스캐너만들기
	Scanner scanner = new Scanner(System.in);

	public void A1() {
		
		//게임입장
		System.out.println("========🐇🐇===========깡총======");
		System.out.println("==깡총==========깡총===========🐇🐇");
		System.out.println("++++++ 당신의 이름은 무엇입니까? ++++++");
		
		//유저이름 적기
		User user = new User();
		System.out.println(user.getName() + "님 반갑습니다. 토끼나라입니다.");
		
		//게임시작 선택
		System.out.println("귀여운 토끼를 잘 키워주세요!!🐇뿅!!");
		System.out.println("토끼게임을 진행합니다.[y/n]선택하세요!");
		boolean a = false;
		
		do {
		String start = scanner.next();
	
			switch (start) {
		case "y":
			System.out.println("히히🐇 반가워! 난 니가 키워야 할 토끼야!");
			choiceStart();
			
			break;
		case "n":
			//choiceEnd();
			System.out.println("게임을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못 선택하셨습니다.");
			System.out.println("게임을 다시 진행합니다.");
			System.out.println();
			System.out.println("귀여운 토끼를 잘 키워주세요!!🐇뿅!!");
			System.out.println("토끼게임을 진행합니다.[y/n]선택하세요!");
			
			break;
		}
	
		}while(!a);

		

	}

	private void choiceStart() {
		// 게임을 시작할 때
		new GameO().run();
		
		
		
		
	}

}
