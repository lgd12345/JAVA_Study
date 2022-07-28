package arrayList;

public class Person implements Comparable<Person>{
	private String name;

    public Person(String name) {
	this.name = name;
}
    @Override
    public String toString() {
    	return name;
    }
	@Override
	public int compareTo(Person o) {
		// 비교기준 name이 문자열이니 문자열에 compareTo메소드 원래 있는데 그걸 가져와서 이름으로 비교해라
		return name.compareTo(o.name);
	}
}
