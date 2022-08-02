package mag;

import java.util.ArrayList;
import java.util.List;

public class MagicS {

	protected int idS;
	protected String nameS;
	List<String> n1 = new ArrayList<String>();

	public List<String> getN1() {
		return n1;
	}

	public void setN1(List<String> n1) {
		this.n1 = n1;
	}

	public int getIdS() {
		return idS;
	}

	public void setIdS(int idS) {
		this.idS = idS;
	}

	public String getNameS() {
		return nameS;
	}

	public void setNameS(String nameS) {
		this.nameS = nameS;
	}

	@Override
	public String toString() {
		return "MagicS [idS=" + idS + ", nameS=" + nameS + "]";
	}

}