package example;

public class Split_String예제1 {

	public static void main(String[] args) {
		
		String text1 = "South Korea's finance minister said Thursday the US Federal Reserve's latest rate hike is expected to have a limited impact on the domestic financial market as the outcome is in line with market expectations.\r\n"
				+ "\r\n"
				+ "Finance Minister Choo Kyung-ho made the remarks during his meeting with the central bank chief and heads of the country's financial regulators to discuss the fallout of the Fed's \"giant step\" rate increase on the market and economic situations.";
		String text2 = "일본에서 신종 코로나바이러스 감염증(코로나19) 일일 확진자수가 20만명선까지 늘면서 사상 최고치를 위협하고 있다. 감염 확산으로 자가 격리자 수도 크게 늘면서 일상생활의 불편도 커지고 있다.\r\n"
				+ "\r\n"
				+ "27일 NHK, 아사히신문 등 일본 언론에 따르면 전날 일본 소방청은 '구급이송 곤란 사안'이 최근 일주일새 6035건이나 발생했다고 밝혔다.\r\n"
				+ "\r\n"
				+ "구급이송 곤란 사안은 코로나 환자를 받아줄 병원을 확보하지 못해 구급대가 30분 이상 대기하는 것을 말한다. 이는 전주 1896건보다 46%나 늘어난 숫자다. 오미크론 변이 확산으로 확진자수가 크게 늘었던 지난 2월 14일부터 20일까지의 6064건에 이어 주간 기준으로 역대 두번째로 많다.";
		String[] words = text2.split("[^가-힣]+"); //한글 가부터 힣까지 분리
		String[] words2 = text1.split("[^a-zA-Z]+"); //한글 가부터 힣까지 분리
		
		
		for(String w : words) {
			if(w.length() < 2)continue; //한글자뺀다
			System.out.println(w);
		}
		for(String w : words2) {
			if(w.length() < 2)continue; //한글자뺀다
			System.out.println(w);
		}
		

	}

}
