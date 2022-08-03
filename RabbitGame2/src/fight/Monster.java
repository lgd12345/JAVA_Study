package fight;

public class Monster {
	String name;
	int hp;

	// 두 싸움꾼 객체 생성
	public Monster(String str) {
		name = str;
		hp = 30;
	}

	public void punch(Monster enemy) {
		/* 1.(1-10)사이 랜덤 데미지를 입혀 상대의 hp를 줄인다. */
		int damage = (int) (Math.random() * 10) + 1;
		enemy.hp -= damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}


}
