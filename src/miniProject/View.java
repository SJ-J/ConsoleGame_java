package miniProject;

import java.util.Scanner;

public class View {
	
	Msg m = new Msg();
	Index idx = new Index();
	static Percent p = new Percent();
	
	Items sword = new Items("다 벨 수 있는 검");
	Items spear = new Items("다 뚫을 수 있는 창");
	Items shield = new Items("다 막을 수 있는 방패");
	
	//< 내 인벤토리 >
	void inventoryview(){
		m.invenMsg();
		
		while (true) {
			//<내 인벤토리>에서 선택값 입력(choice1)
			Scanner sc = new Scanner(System.in);
			int choice1 = sc.nextInt();
			
			//잘못된 값, ④뒤로가기, ⑤나가기
			if (!(choice1 >= 1 && choice1 <= 4)) { m.backMsg(); m.invenMsg(); continue; }	//메인메뉴가 main 메서드에 있는데 Index class로 넘기는 법을 모르겠음
			else if (choice1 == 4) { m.outMsg(); break; }
			
			//① 다 벨 수 있는 검 선택
			if (choice1 == 1) {
				//강화에 사용할 아이템 리스트 출력
				m.itemUse();
				
				//[ 강화에 사용할 아이템을 선택해 주세요. ]에서 선택값 입력(choice2)
				int choice2 = sc.nextInt();
				//잘못된 값 입력, ④뒤로가기, ⑤나가기
				if (!(choice2 >= 1 && choice2 <= 5)) { m.backMsg(); m.invenMsg(); continue; }
				else if (choice2 == 4) { m.invenMsg(); continue; }
				else if (choice2 == 5) { m.outMsg(); break; }
				
				//① 50% 강화 주문서(+1강) 선택
				else if (choice2 == 1) { grade50(); }
				//② 20% 강화 주문서(+2강) 선택
				else if (choice2 == 2) { grade20(); }
				//③ 5% 강화 주문서(+5강) 선택
				else if (choice2 == 3) { grade05(); }
				
				sword.level += p.level;
				
				//강화 성공 시 현재 아이템 강화 상태 출력
				if (p.level != 0) {checkMsg();}
				m.invenMsg();
				continue;
			}
			
			//② 다 뚫을 수 있는 창 선택
			if (choice1 == 2) {
				//강화에 사용할 아이템 리스트 출력
				m.itemUse();
				
				//[ 강화에 사용할 아이템을 선택해 주세요. ]에서 선택값 입력(choice2)
				int choice2 = sc.nextInt();
				//잘못된 값 입력, ④뒤로가기, ⑤나가기
				if (!(choice2 >= 1 && choice2 <= 5)) { m.backMsg(); m.invenMsg(); continue; }
				else if (choice2 == 4) { m.invenMsg(); continue; }
				else if (choice2 == 5) { m.outMsg(); break; }
				
				//① 50% 강화 주문서(+1강) 선택
				else if (choice2 == 1) { grade50(); }
				//② 20% 강화 주문서(+2강) 선택
				else if (choice2 == 2) { grade20(); }
				//③ 5% 강화 주문서(+5강) 선택
				else if (choice2 == 3) { grade05(); }
				
				spear.level += p.level;
				
				//강화 성공 시 현재 아이템 강화 상태 출력
				if (p.level != 0) {checkMsg();}
				m.invenMsg();
				continue;
			}
			
			//③ 다 막을 수 있는 방패 선택
			else if (choice1 == 3) {
				//강화에 사용할 아이템 리스트 출력
				m.itemUse();
				
				//[ 강화에 사용할 아이템을 선택해 주세요. ]에서 선택값 입력(choice2)
				int choice2 = sc.nextInt();
				//잘못된 값 입력, ④뒤로가기, ⑤나가기
				if (!(choice2 >= 1 && choice2 <= 5)) { m.backMsg(); m.invenMsg(); continue; }
				else if (choice2 == 4) { m.invenMsg(); continue; }
				else if (choice2 == 5) { m.outMsg(); break; }
				
				//① 50% 강화 주문서(+1강) 선택
				else if (choice2 == 1) { grade50(); }
				//② 20% 강화 주문서(+2강) 선택
				else if (choice2 == 2) { grade20(); }
				//③ 5% 강화 주문서(+5강) 선택
				else if (choice2 == 3) { grade05(); }
				
				shield.level += p.level;

				//강화 성공 시 현재 아이템 강화 상태 출력
				if (p.level != 0) {checkMsg();}
				m.invenMsg();
				continue;
			}
			sc.close();
		}	//while
	}	//inventoryview

	

	//확률 강화 적용 메서드
	void grade50(){
		//① 50% 강화 주문서(+1강)
		System.out.println("	[ 50% 강화 주문서(+1강)를 사용했습니다. ]");
		try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println("	[ 50% 강화 주문서(+1강)를 사용하여 강화를 진행합니다. ]\n		.");
		try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); } System.out.println("		.");
		try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }	System.out.println("		.\n");
		p.percent50(); 
	}
	
	void grade20(){
		//② 20% 강화 주문서(+2강)
		System.out.println("	[ 20% 강화 주문서(+2강)를 사용했습니다. ]");
		try { Thread.sleep(500); } catch (InterruptedException e2) { e2.printStackTrace(); }
		System.out.println("	[ 20% 강화 주문서(+2강)를 사용하여 강화를 진행합니다. ]\n		.");
		try { Thread.sleep(500); } catch (InterruptedException e1) { e1.printStackTrace(); }	System.out.println("		.");
		try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }	System.out.println("		.\n");
		p.percent20();
	}
	
	void grade05(){
		//③ 5% 강화 주문서(+5강)
		System.out.println("	[ 5% 강화 주문서(+5강)를 사용했습니다. ]");
		try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println("	[ 5% 강화 주문서(+5강)를 사용하여 강화를 진행합니다. ]\n		.");
		try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }	System.out.println("		.");
		try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }	System.out.println("		.\n");
		p.percent05();
	}
	
	 void checkMsg() {
		m.levelMsg();
		System.out.println("	① " + sword.name + "	  + " + sword.level + " 강");
		System.out.println("	② " + spear.name + "	  + " + spear.level + " 강");
		System.out.println("	③ " + shield.name + "	  + " + shield.level + " 강");
		System.out.println("\n--------------------------------------------------");
	}
}
