package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	// 가위 바위 보 객체를 오브젝츠 배열에 저장
	GameObject[] objects = { new Scissors(), new Rock(), new Paper() };
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	boolean a = false;

	public void run() {
		System.out.println("게임시작 ...");

		System.out.print("가위(0)바위(1)보(2) 중 숫자로 선택 : ");
		// 랜덤

		do {
			String line = scanner.nextLine();
			try {
				int rum = Integer.parseInt(line);

				GameObject ob1 = objects[rum]; // 0~2
				GameObject ob2 = objects[random.nextInt(objects.length)]; // 0~2
				System.out.println("당신의 선택은 : " + objects[rum].getName());
				System.out.println("컴퓨터의 선택은 : " + ob2.getName());

				int wins = ob1.compareTo(ob2);
				if (wins > 0) {
					System.out.println("당신의 승리!");
				} else if (wins < 0) {
					System.out.println("당신의 패배!");
				} else {
					System.out.println("비겼습니다.");
				}

				scanner.close();
				a = true;
			} catch (Exception e) {
				System.out.println();
				System.out.println("잘못 입력하셨습니다.");
				run();
				continue;

			}
		} while (!a);

	}

}
