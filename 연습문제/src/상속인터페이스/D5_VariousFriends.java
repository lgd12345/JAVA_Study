package 상속인터페이스;

public class D5_VariousFriends {
	public static void main(String[] args) {
		// 객체 생성
		Friend kim = new Artist("뮤지션 김씨");
		Friend lee = new Architect("건축가 이씨");
		Friend park = new Developer("개발자 박씨");
		Friend choi = new Lawyer("변호사 최씨");

		// 그룹화: 인터페이스 기준
		Friend[] friends = { kim, lee, park, choi };
		for (Friend f : friends) {
			f.dearFriend();
		}
	}
}

/* 1. 해당 인터페이스를 완성하시오. dearFriend를 추상 메소드로 */
interface Friend {
	void dearFriend();
}

/* 2. 아래 모든 클래스를 Artist를 참고하여 완성하시오. */
class Artist implements Friend {
	private String name;

	public Artist(String name) {
		this.name = name;
	}

	@Override
	public void dearFriend() {
		System.out.printf("%s ~> 친구아이가!%n",name);
	}
}

class Architect implements Friend {
	private String name;

	public Architect(String name) {
		this.name = name;
	}

	@Override
	public void dearFriend() {
		System.out.printf("%s ~> 친구아이가!%n",name);

	}

}

class Developer implements Friend {
	private String name;

	public Developer(String name) {
		this.name = name;
	}

	@Override
	public void dearFriend() {
		System.out.printf("%s ~> 친구아이가!%n",name);

	}

}

class Lawyer implements Friend {
	private String name;

	public Lawyer(String name) {
		this.name = name;
	}

	@Override
	public void dearFriend() {
		System.out.printf("%s ~> 친구아이가!%n",name);
	}

}
