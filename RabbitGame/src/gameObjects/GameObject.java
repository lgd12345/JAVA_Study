package gameObjects;

public class GameObject {
	protected int id;
	protected String nameO;
	
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
