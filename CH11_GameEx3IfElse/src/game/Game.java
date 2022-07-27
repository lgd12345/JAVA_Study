package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	// 가위 바위 보 객체를 오브젝츠 배열에 저장
	GameObject[] objects = { new Scissors(), new Rock(), new Paper() };
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	public void run() {
		System.out.println("게임시작 ...");

		System.out.print("가위(0)바위(1)보(2) 중 숫자로 선택 : ");
		// 랜덤
		
		int rum = scanner.nextInt();
		
		if (!(rum == 0 || rum == 1 || rum == 2)) {
			System.out.println("다시 0,1,2 중 선택하세요!");
			run();
			
		}else{
			System.out.println("당신의 선택은 : "+ objects[rum].getName());
			
			GameObject ob1 = objects[rum]; // 0~2
			
			GameObject ob2 = objects[random.nextInt(objects.length)]; // 0~2
			
			System.out.println("컴퓨터의 선택은 : " + ob2.getName());
			
			//누가 이겼는지 표시한다.
			//System.out.println(ob1.compareTo(ob2));
			// 누가 이겼는지 비교해주는 compareTo메소드를 만든다
			//ob1.compareTo(ob2);
			int wins = ob1.compareTo(ob2);
			if(wins > 0) {
				System.out.println("당신의 승리!");
			} else if (wins < 0) {
				System.out.println("당신의 패배!");
			} else {
				System.out.println("비겼습니다.");
			}
			
			scanner.close();
		}
	}
			
		};
		
			
		

	
