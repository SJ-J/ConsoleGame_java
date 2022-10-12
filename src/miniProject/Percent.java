package miniProject;

public class Percent {
	
	int level = 0;
	String failMsg = "	[ 강화에 실패했습니다… ]\n"
			+ "\n――――――――――――――――――――――――――――――――――――――――――――――――――\n";
	
	//① 50% 강화 주문서
	void percent50() {
		double pick50;
		pick50 = ((int)(Math.random() * 100)); 
		if (26 <= pick50 && pick50 <= 75) {
			level = 1;
			System.out.println("	<< 50% 확률로 +1강 성공! >>\n");
		}else {
			level = 0;
			System.out.println(failMsg);
		}
	}
	//② 20% 강화 주문서
	void percent20() {
		double pick20;
		pick20 = ((int)(Math.random() * 100));
		if (6 <= pick20 && pick20 <= 25) {
			level = 2;
			System.out.println("	<< 20% 확률로 +2강 성공!! >>\n");
		}else {
			level = 0;
			System.out.println(failMsg);
		}
	}
	//③ 5% 강화 주문서
	void percent05() {
		double pick05;
		pick05 = ((int)(Math.random() * 100));
		if (1 <= pick05 && pick05 <= 5) {
			level = 5;
			System.out.println("	<< 5% 확률로 +5강 성공!!! >>\n");
		}else {
			level = 0;
			System.out.println(failMsg);
		}
	}
}
