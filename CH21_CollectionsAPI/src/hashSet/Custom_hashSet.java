package hashSet;

import java.util.HashSet;

class Creature{
	private int id;
	private String name;
	
	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  id + " : " + name ;
	}
}

public class Custom_hashSet {

	public static void main(String[] args) {
		HashSet<Creature> creatures = new HashSet<Creature>();
		// 헤시코드이퀄 설정시 id name 넣으면 둘다 값이 같아야 같다고 인식 id name 똑같아야
		//id 값만넣으면 id로만 판단
		creatures.add(new Creature(0, "고양이"));
		creatures.add(new Creature(1, "개"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(3, "소"));
		creatures.add(new Creature(4, "말"));
		creatures.add(new Creature(4, "비둘기"));
		
		for(Creature c : creatures) {
			System.out.println(c);
		}

	}

}
