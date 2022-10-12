package miniProject;

import java.util.Scanner;

public class Index {
	public static void main(String[] args){
		
		Msg m = new Msg();
		View v = new View();
		
		//topMsg + menuMsg 출력
		m.topMsg(); m.menuMsg();
		

		//메뉴 선택(입력)
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int choice = sc.nextInt();
			
			//잘못된 값 입력
			if (!(choice >= 1 && choice <= 2)) {
				m.backMsg(); m.topMsg(); m.menuMsg();
				continue;
			}
			
			//① 아이템 강화 선택
			switch (choice) {
			case 1: v.inventoryview(); break;
				
			//② 나가기 선택
			case 2: m.outMsg(); break; 
			}break;
			
		}	//while
		sc.close();
	}	//main
}
