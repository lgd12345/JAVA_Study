package 클래스;

public class C8_HeroTest {

	public static void main(String[] args) {

		// 두 싸움꾼 객체 생성
		Monster arthas = new Monster("아서스");
		Monster leona = new Monster("레오나");

		// 격투 시작
		Monster.battle(arthas, leona);
	}
}

class Monster {
	// 필드
	String name;
	int hp;

	// 생성자
	public Monster(String str) {
		name = str;
		hp = 30;
	}

	// 메소드(인스턴스 메소드)
	public void punch(Monster enemy) {
		/* 1.(1-10)사이 랜덤 데미지를 입혀 상대의 hp를 줄인다. */
		int damage = (int) (Math.random() * 10) + 1;
		enemy.hp -= damage;
	}

	// 메소드(클래스 메소드)
	public static void battle(Monster a, Monster b) {
		/* 2. 전투를 시작한다. */
		boolean firstAttack = true; // firstAttack이 참이면 a가 펀치를 날린다.
		while ((a.hp > 0) && (b.hp > 0)) {
			if (firstAttack) {
				a.punch(b);
				System.out.printf("[%s]의 펀치%n", a.name);
				System.out.printf("%s: %d/30%n", b.name, b.hp);

			} else {
				b.punch(a);
				System.out.printf("[%s]의 펀치%n", a.name);
				System.out.printf("%s: %d/30%n", b.name, b.hp);

			}
			firstAttack = !firstAttack;
		}
		if(a.hp > 0) {
			System.out.println(a.name+"가 이겼다");
		}else {
			System.out.println(b.name+"가 이겼다");
		}
		
	}
}
