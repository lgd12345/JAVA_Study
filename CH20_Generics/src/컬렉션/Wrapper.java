package 컬렉션;
//Generic타입 E결정이 안된 타입<E> Element
public class Wrapper<E> {
	//오브젝트는 모든타입의 부모
	private E object;
	
	public void set(E object) {
		this.object = object;
	}
	
	public E get() {
		return object;
		
	}
	

}
