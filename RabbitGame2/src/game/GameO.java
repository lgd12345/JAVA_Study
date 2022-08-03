package game;

import java.util.Random;
import java.util.Scanner;

import fight.Monster;
import gameObjects.Food;
import gameObjects.GameObject;
import gameObjects.Magic;
import gameObjects.Sing;
import gameObjects.Water;
import gameObjects2.Food2;
import gameObjects2.GameObject2;
import gameObjects2.Magic2;
import gameObjects2.Water2;
import mag.CageEscape;
import mag.DoNotEscape;
import mag.DoNotEscape2;
import mag.MagicS;
import mag.UserEscape;

public class GameO {
	GameObject[] objects = { new Water(), new Food(), new Sing(), new Magic() };
	MagicS[] MS = { new CageEscape(), new UserEscape(), new DoNotEscape(), new DoNotEscape2() };
	GameObject2[] objects2 = { new Water2(), new Food2(), new Magic2() };
	// 두 싸움꾼 객체 생성
	Monster cat = new Monster("고양이닌자");
	Monster rabbit = new Monster("토끼");
	Scanner scanner = new Scanner(System.in);
	Scanner scanner2 = new Scanner(System.in);
	Scanner scanner3 = new Scanner(System.in);
	Scanner scanner4 = new Scanner(System.in);

	Random random = new Random();
	User user;
	public GameO(User user) {
		this.user = user;
	}

	boolean a = false;

	public void run() {
		System.out.println("💖 "+user.getName()+"! 나를 잘 키워줘 💖");
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
				} else if (rum == 3) { // 숨은 효과
					objects[rum].getN1().forEach(s -> System.out.println(s));
					runMagic();
				} else if (rum == 2) {
					objects[rum].getN1().forEach(s -> System.out.println(s));
					System.exit(0);
				} else if (rum == 0) {
					objects[rum].getN1().forEach(s -> System.out.println(s));
					System.out.println();
					System.out.println("토끼가 신나서 폴짝 뛰었어요!");
					System.out.println("토끼가 "+user.getName()+"님에게 물과 음식을 내놓으라 합니다.");
					System.out.print("물# 음식# [0,1] 선택 해주세요");
					System.out.println();
					runWF();
				} else {
					objects[rum].getN1().forEach(s -> System.out.println(s));
					System.out.println();
					System.out.println("토끼가 신나서 폴짝 뛰었어요!");
					System.out.println("토끼가 "+user.getName()+"님에게 물과 음식을 내놓으라 합니다.");
					System.out.println();
					System.out.print("물# 음식# [0,1] 선택 해주세요");
					runWF();
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
		System.out.println("마법을 발동하시겠습니까?[y/n]");
		do {
			String line2 = scanner2.next();

			switch (line2) {
			case "y":
				// y누르면 랜덤 마법 효과 적용
				System.out.println("마법을 발동한다.");
				System.out.println();

				int rum2 = random.nextInt(MS.length);

				if (rum2 == 0) {
					System.out.println(MS[rum2].getNameS());
					MS[rum2].getN1().forEach(s -> System.out.println(s));
					System.exit(0);
				} else if (rum2 == 1) {
					System.out.println(MS[rum2].getNameS());
					MS[rum2].getN1().forEach(s -> System.out.println(s));
					System.exit(0);
				} else if (rum2 == 2) {
					System.out.println(MS[rum2].getNameS());
					MS[rum2].getN1().forEach(s -> System.out.println(s));
					System.exit(0);
				} else {
					System.out.println(MS[rum2].getNameS());
					MS[rum2].getN1().forEach(s -> System.out.println(s));
					System.exit(0);
				}
				break;
			case "n":
				System.out.println("마법 시전을 취소하셨습니다.");
				System.out.println("토끼가 충격! 상태이상에 빠집니다.");
				System.out.println("토끼 사망!");
				System.out.println("++++++++++++");
				System.out.println("+          +");
				System.out.println("+    ☠    +");
				System.out.println("++++++++++++");
				System.out.println("게임을 종료 합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("잘못 선택하셨습니다.");
				System.out.println("마법을 발동한다.");
				System.out.println("[y/n]다시 선택해주세요");

				break;
			}
		} while (!a);

	}

	public void runWF() {

		do {
			System.out.println("🐰🐾🐰🐾🐰🐾");
			String line3 = scanner3.nextLine(); // 문자열로 받는다.
			try {
				int rum3 = Integer.parseInt(line3); // 정수로 바꿔준다.

				if (!(rum3 == 0 || rum3 == 1 || rum3 == 2)) {
					System.out.println("잘못선택했습니다.");
					System.out.println("[0,1]중 선택하세요");
					runWF();
				} else if (rum3 == 2) { // 숨은 효과
					objects2[rum3].getN1().forEach(s -> System.out.println(s));
					runMagic();
				} else if (rum3 == 0) {
					System.out.println();
					objects2[rum3].getN1().forEach(s -> System.out.println(s));
					System.out.println("토끼가 신나서 폴짝 뛰었어요!");
					System.out.println("토끼가 "+user.getName()+"님에게 음식을 내놓으라 합니다.");
					System.out.println();
					System.out.print("물# 음식# [0,1] 선택 해주세요");
					runWF2();

				} else {
					System.out.println();
					objects2[rum3].getN1().forEach(s -> System.out.println(s));
					int hp = 1;
					for (int i = 0; i < hp; i++) {
						if (hp == 31) {
							break;
						}
						hp += 5;
						System.out.println("Hp = " + (hp - 1));

					}
					runfight();

				}
			} catch (NumberFormatException e) {
				System.out.println("잘못선택했습니다.");
				System.out.println("[0,1]중 선택하세요");
				runWF();
				continue;

			}
		} while (!a);

		scanner3.close();

	}

	public void runWF2() {

		do {
			System.out.println("🐰🐾🐰🐾🐰🐾");
			String line3 = scanner3.nextLine(); // 문자열로 받는다.
			try {
				int rum3 = Integer.parseInt(line3); // 정수로 바꿔준다.

				if (!(rum3 == 0 || rum3 == 1 || rum3 == 2)) {
					System.out.println("잘못선택했습니다.");
					System.out.println("[0,1]중 선택하세요");
					runWF2();
				} else if (rum3 == 2) { // 숨은 효과
					objects2[rum3].getN1().forEach(s -> System.out.println(s));
					runMagic();
				} else if (rum3 == 0) {
					System.out.println("토끼가 물을 너무 많이 마셨습니다.");
					System.out.println("토끼가 배탈을 시작합니다.");
					System.out.println("심한 탈수 증세로 인한 죽음!");
					System.out.println("토끼 사망!");
					System.out.println("++++++++++++");
					System.out.println("+          +");
					System.out.println("+   ☠  💩 +");
					System.out.println("++++++++++++");
					System.exit(0);

				} else {
					System.out.println();
					objects2[rum3].getN1().forEach(s -> System.out.println(s));

					int hp = 1;
					for (int i = 0; i < hp; i++) {
						if (hp == 31) {
							break;
						}
						hp += 5;
						System.out.println("Hp = " + (hp - 1));

					}
					System.out.println();
					runfight();

				}
			} catch (NumberFormatException e) {
				System.out.println("잘못선택했습니다.");
				System.out.println("[0,1]중 선택하세요");
				runWF2();
				continue;

			}
		} while (!a);

		scanner3.close();

	}

	public void runfight() {
		System.out.println("몬스터가 나타났다🐱‍👤!!");
		System.out.println("[내 이름은 고양이 닌자다냥!]");
		System.out.println("[배가 고프다냥! 맛있는 걸 내놓아라!]");
		System.out.println(user.getName()+"님!! 몬스터와 싸우시겠습니까?[y/n]");

		do {
			String line4 = scanner4.nextLine();
			switch (line4) {
			case "y":
				System.out.println("공격한다.");
				// 격투 시작
				battle(cat, rabbit);

				break;
			case "n":
				System.out.println("토끼와 함께 도망칩니다!!💨💨");
				System.out.println("토끼가 도망치다가 발목부상을 입었습니다! 상태이상에 빠집니다.");
				System.out.println("토끼 사망!");
				System.out.println("++++++++++++");
				System.out.println("+          +");
				System.out.println("+    ☠    +");
				System.out.println("++++++++++++");
				System.out.println("게임을 종료 합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("잘못 선택하셨습니다.");
				System.out.println("몬스터와 싸우시겠습니까?");
				System.out.println("[y/n]다시 선택해주세요");

				break;
			}
		} while (!a);

	}

	public void battle(Monster b, Monster a) {
		/* 2. 전투를 시작한다. */
		boolean firstAttack = true; // firstAttack이 참이면 a가 펀치를 날린다.
		while ((a.getHp() > 0) && (b.getHp() > 0)) {
			if (firstAttack) {
				a.punch(b);
				System.out.printf("[%s]의 펀치%n", a.getName());
				System.out.printf("%s: %d/30%n", b.getName(), b.getHp());
				System.out.println();

			} else {
				b.punch(a);
				System.out.printf("[%s]의 펀치%n", b.getName());
				System.out.printf("%s: %d/30%n", a.getName(), a.getHp());

			}
			firstAttack = !firstAttack;
		}//결과
		if (a.getHp() > 0) {
			System.out.println(a.getName() + "가 이겼다!!");
			System.out.println("축하합니다.");
			System.out.println("보상을 지급합니다.");
			System.out.println("🐰🐾🐰🐾🐰🐾");
			objects[3].getN1().forEach(s -> System.out.println(s));
			runMagic();

		} else {
			System.out.println(b.getName() + "가 이겼다!!");
			System.out.println("토끼가 비상식량을 모두 빼앗겼습니다.");
			System.out.println("토끼가 충격! 상태이상에 빠집니다.");
			System.out.println("토끼 사망!");
			System.out.println("++++++++++++");
			System.out.println("+          +");
			System.out.println("+    ☠    +");
			System.out.println("++++++++++++");
			System.out.println("게임을 종료 합니다.");
			System.exit(0);
		}
	}
}
