package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}

}
public class App {

	public static void main(String[] args) {
		//정렬까지 해주는 것 treeSet 근데 오류나니깐 위에 Comparable<Person>넣어줌
		//정렬해주는 거니깐 String인데 이름값으로 바꿔주기위해서 Comparable<Person>해주고 밑에
		//return값에 this.name.compareTo(other.name)로 해서 이름값으로

		TreeSet<Person> people = new TreeSet<Person>();
		

		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));

		for (Person p : people) {
			System.out.println(p);
		}
	}

}
