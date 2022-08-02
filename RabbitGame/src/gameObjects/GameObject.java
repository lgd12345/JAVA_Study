package gameObjects;

import java.util.ArrayList;
import java.util.List;

public class GameObject {
	protected int id;
	protected String nameO;
	List<String> n1 = new ArrayList<String>();

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
