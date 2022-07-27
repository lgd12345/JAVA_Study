package 다형성;

public class HouseCat extends Cat {
    @Override
	public void vocal() {
		System.out.println("미야우~~");
	}
    
    @Override
    public String toString() {
    	
    	return "집고양이";
    }
    //집고양이기능적어줌
    public void callMaster() {
    	System.out.println("집사 부르기~");
    }
}
