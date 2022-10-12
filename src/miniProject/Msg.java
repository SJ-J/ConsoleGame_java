package miniProject;

public class Msg {
	
	String[] inventory = {"	[ 강화할 아이템을 선택해 주세요. ]	\n\n	< 내 인벤토리 >", "	① 다 벨 수 있는 검", "	② 다 뚫을 수 있는 창", "	③ 다 막을 수 있는 방패", "	④ 나가기\n"};
	
	String[] item = {"	① 50% 강화 주문서(+1강)", "	② 20% 강화 주문서(+2강)", 
			"	③ 5% 강화 주문서(+5강)", "	④ 뒤로가기", "	⑤ 나가기\n"};
	
	//게터세터로 View단에 inventory[], item[]값 넘겨줌
	public String[] getInventory() {
		return inventory;
	}

	public void setInventory(String[] inventory) {
		this.inventory = inventory;
	}

	public String[] getItem() {
		return item;
	}

	public void setItem(String[] item) {
		this.item = item;
	}

	
	public void topMsg() {	
		System.out.println("==========================================\n"
					+ "	★ 어서오세요! 강화상점입니다 ★\n"
					+ "==========================================\n");
	}
	
	public void menuMsg() {
		System.out.println("        ① 아이템 강화	②나가기\n");
	}
	
	public void invenMsg() {
		System.out.println("	[ 내 인벤토리를 확인합니다. ]");
		for (int i = 0; i < inventory.length; i++) {
			System.out.println(inventory[i]);
		}
	}
	
	public void levelMsg() {
		System.out.println("	[ 현재 아이템 강화 상태를 확인합니다. ]\n");
	}
	
	public void itemsInfo() {
		System.out.println("	[ 사용할 아이템을 선택해 주세요. ]\n	< 사용 가능한 강화 주문서 >");
	}
	
	public void itemUse() {
		System.out.println("	[ 강화에 사용할 아이템을 선택해 주세요. ]\n");
		for (int i = 0; i < item.length; i++) {
			System.out.println(item[i]);
		}
	}
	
	//continue 메시지
	public void mainMsg() {
		System.out.println("	[ 메인 메뉴로 이동합니다. ]\n");
	}
	
	//이상한 입력값
	public void backMsg() {
		System.out.println("	[ 올바른 메뉴를 입력해주세요 ]\n	[ 메뉴 선택으로 돌아갑니다. ]\n");
	}
	
	//break 메시지
	public void outMsg() {
		System.out.println("	[ 다음에 또 만나요! ]\n	[ 상점을 종료합니다. ]"
				+ "\n=====================================\n");
	}
}
