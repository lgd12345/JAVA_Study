package game;

import java.util.Random;
import java.util.Scanner;

import gameObjects.Food;
import gameObjects.GameObject;
import gameObjects.Magic;
import gameObjects.Sing;
import gameObjects.Water;
import mag.CageEscape;
import mag.DoNotEscape;
import mag.DoNotEscape2;
import mag.MagicS;
import mag.UserEscape;

public class GameO {
	GameObject[] objects = { new Water(), new Food(), new Sing(), new Magic() };
	MagicS[] MS = { new CageEscape(), new UserEscape(), new DoNotEscape(), new DoNotEscape2() };
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	boolean a = false;

	public void run() {
		System.out.println("💖나를 잘 키워줘💖");
		System.out.println("++++++++++++");
		System.out.println("+          +");
		System.out.println("+    🐇    +");
		System.out.println("++++++++++++");

		System.out.print("물# 음식# 노래# [0,1,2] 입력해주세요");
		System.out.println();

		do {
			String line = scanner.nextLine(); // 문자열로 받는다.
			try {
				int rum = Integer.parseInt(line); // 정수로 바꿔준다.

				if (!(rum == 0 || rum == 1 || rum == 2 || rum == 3)) {
					System.out.println("[0,1,2]중 선택하세요");

					run();
				} else if (rum == 3) {
					System.out.println("마법스킬을 발견하셨습니다.");
					System.out.println("MP가 생성됩니다.");
					System.out.println("생성된 MP는 20");
					System.out.println("지금부터 마법스킬을 사용할 수 있습니다.");
					System.out.println("++++++++++++");
					System.out.println("+ 깔깔   💫 +");
					System.out.println("+ ✨ 🐇    +");
					System.out.println("++++++++++++");
					runMagic();
				} else if (rum == 2) {

					System.out.println("노래를 선택하셨습니다.");
					System.out.println("토끼가 노래를 듣기 싫어합니다.");
					System.out.println("토끼 사망");
					System.out.println("++++++++++++");
					System.out.println("+          +");
					System.out.println("+    ☠    +");
					System.out.println("++++++++++++");
					System.out.println("게임을 종료합니다.");
				} else if (rum == 0) {

					System.out.println("물을 선택하셨습니다.");
					System.out.println("갈증이 해소 됩니다.");
					System.out.println("++++++++++++");
					System.out.println("+      헤헤 +");
					System.out.println("+   🥛🐇   +");
					System.out.println("++++++++++++");

				} else {
					System.out.println(objects[rum].getNameO() + "을 선택하셨습니다.");
					System.out.println(objects[rum].getNameO() + "을 토끼가 맛있게 먹습니다.");
					System.out.println("HP가 생성됩니다.");
					System.out.println("++++++++++++");
					System.out.println("+      히히 +");
					System.out.println("+   🥗🐇   +");
					System.out.println("++++++++++++");

				}
			} catch (NumberFormatException e) {
				System.out.println("잘못선택하셨습니다.");
				System.out.print("게임을 다시 시작합니다.");
				System.out.println();
				run();
				continue;

			}
		} while (!a);

		scanner.close();
	}

	public void runMagic() {
		System.out.println("마법을 발동한다.");
		System.out.println();

		int rum2 = random.nextInt(MS.length);

		if (rum2 == 0) {
			System.out.println(MS[rum2].getNameS());
			System.out.println("토끼가 탈출했습니다.");
			System.out.println("++  +   ++++++");
			System.out.println("      아싸     +");
			System.out.println("🐇💨 💨💨💨++");
			System.out.println("+++++++++++++++");
			System.out.println("게임이 종료 됩니다.");
		} else if (rum2 == 1) {
			System.out.println(MS[rum2].getNameS());
			System.out.println("당신에게 토끼토끼 마법을 시전했습니다.");
			System.out.println("당신이 철장에 갖혔습니다.");
			System.out.println("++++++++++++");
			System.out.println("+      ㅠㅠ +");
			System.out.println("+    🤦‍♂️    +");
			System.out.println("++++++++++++");
			
			System.out.println("게임이 종료 됩니다.");
		} else if (rum2 == 2) {
			System.out.println(MS[rum2].getNameS());
			System.out.println("게임이 종료 됩니다.");
		} else {
			System.out.println(MS[rum2].getNameS());
			System.out.println("게임이 종료 됩니다.");
		}

		// MagicS ma1 = MS[rum2];

	}

}
