package gameObjects2;

import java.util.ArrayList;
import java.util.List;

public class GameObject2 {
	protected int id;
	protected String nameO;
	List<String> n1 = new ArrayList<String>();
	public static int count = 0;
	public static int count2 = 0;
	protected int HP;
	protected int MP;
	
	
	public static int getCount2() {
		return count2;
	}
	public static void setCount2(int count2) {
		GameObject2.count2 = count2;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		GameObject2.count = count;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public List<String> getN1() {
		return n1;
	}
	public void setN1(List<String> n1) {
		this.n1 = n1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameO() {
		return nameO;
	}
	public void setNameO(String nameO) {
		this.nameO = nameO;
	}
	@Override
	public String toString() {
		return "GameObject [id=" + id + ", nameO=" + nameO + "]";
	}
	
	
	
	

}
