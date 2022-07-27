package 클래스;

public class C1_CylinderTest {

	public static void main(String[] args) {
	    // 객체 생성
	    Cylinder c = new Cylinder();
	    
	    // 속성 값 입력
	    c.radius = 4; //반지름
	    c.height = 5;  //높이
	    
	    // 출력
	    System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
	    System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());
	  }
	}

	class Cylinder {

		public int height;
		public int radius; 
		
		public double getVolume() {
			 
			return Math.PI *radius*radius*height;
		}
		public double getArea() {
			
			return 2*Math.PI*radius*radius+2*Math.PI*radius* height;
		}
	  
	}
	


