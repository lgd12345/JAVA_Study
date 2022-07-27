package overridingMethod;

public class HouseCat extends Cat {
    @Override
	public void vocal() {
		System.out.println("미야우~~");
	}
    
    @Override
    public String toString() {
    	
    	return "집고양이";
    }
}
