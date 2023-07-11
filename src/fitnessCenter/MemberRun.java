package fitnessCenter;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> mlist = new ArrayList<Member>();
		ArrayList<VIP> vlist = new ArrayList<VIP>();
		int menu = 0;
		int menu1 = 0;
		int menu2 = 0;

		end: while (true) {
			menu = printMenu();

			switch (menu) {
			case 1:
				System.out.println("=====================일반회원 정보관리=====================");
				System.out.println("1.일반회원 정보입력 | 2. 일반회원 정보삭제 | 3.일반회원 정보확인");
				System.out.println("======================================================");
				System.out.print("메뉴를 선택하세요. >>> ");
				menu1 = sc.nextInt();

				switch (menu1) {
				case 1:
					System.out.println("가입할 회원 수를 입력하세요>>");
					int insertNum = sc.nextInt();

					for (int i = 0; i < insertNum; i++) {
						System.out.println("회원정보를 입력하세요.");
						System.out.print("회원 아이디 :");
						String insertMID = sc.next();
						System.out.print("회원 이름 :");
						String insertMName = sc.next();
						System.out.print("회원 지역 :");
						String insertMArea = sc.next();

						mlist.add(new Member(insertMID, insertMName, insertMArea));
					}
					break;
				case 2:
					System.out.println("삭제할 회원번호를 입력하세요.");
					int removeNum = sc.nextInt();
					mlist.remove(removeNum - 1);

					System.out.println("=====================일반회원 정보=====================");
					for (int i = 0; i < mlist.size(); i++) {
						Member member = mlist.get(i);
						System.out.println("회원 번호" + (i + 1));
						System.out.println("회원 아이디" + member.getID());
						System.out.println("회원 이름" + member.getName());
						System.out.println("회원 지역" + member.getArea());
					}
					System.out.println("====================================================");
					break;
				case 3:
					System.out.println("등록된 회원수는 " + mlist.size() + "입니다.");
					for (int i = 0; i < mlist.size(); i++) {
						Member member = mlist.get(i);
						System.out.println("회원 번호" + (i + 1));
						System.out.println("회원 아이디" + member.getID());
						System.out.println("회원 이름" + member.getName());
						System.out.println("회원 지역" + member.getArea());
					}
					break;
				}
				break;
			case 2:
				System.out.println("=====================VIP회원 정보관리=====================");
				System.out.println("1.VIP회원 정보입력 | 2. VIP회원 정보삭제 | 3.VIP회원 정보확인");
				System.out.println("======================================================");
				System.out.print("메뉴를 선택하세요. >>> ");
				menu2 = sc.nextInt();

				switch (menu2) {
				case 1:
					System.out.println("가입할 vip회원 수를 입력하세요>>");
					int insertVipNum = sc.nextInt();

					for (int i = 0; i < insertVipNum; i++) {
						System.out.println("VIP회원정보를 입력하세요.");
						System.out.print("VIP회원 아이디 :");
						String insertVID = sc.next();
						System.out.print("VIP회원 이름 :");
						String insertVName = sc.next();
						System.out.print("VIP회원 지역 :");
						String insertVArea = sc.next();
						System.out.print("VIP회원 PT횟수 :");
						int insertVPT = sc.nextInt();

						vlist.add(new VIP(insertVID, insertVName, insertVArea, insertVPT));
					}
					break;
				case 2:
					System.out.println("삭제할 vip회원번호를 입력하세요.");
					int removeNum = sc.nextInt();
					vlist.remove(removeNum - 1);
					System.out.println("=====================VIP회원 정보=====================");
					for (int i = 0; i < vlist.size(); i++) {
						VIP vip = vlist.get(i);
						System.out.println("VIP회원 번호" + (i + 1));
						System.out.println("VIP회원 아이디" + vip.getVipID());
						System.out.println("VIP회원 이름" + vip.getVipName());
						System.out.println("VIP회원 지역" + vip.getVipArea());
						System.out.println("VIP회원 PT횟수" + vip.getVipPT());
					}
					System.out.println("====================================================");
					break;
				case 3:
					System.out.println("등록된 VIP회원수는 " + vlist.size() + "입니다.");
					for (int i = 0; i < vlist.size(); i++) {
						VIP vip = vlist.get(i);
						System.out.println("VIP회원 번호" + (i + 1));
						System.out.println("VIP회원 아이디" + vip.getVipID());
						System.out.println("VIP회원 이름" + vip.getVipName());
						System.out.println("VIP회원 지역" + vip.getVipArea());
						System.out.println("VIP회원 PT횟수" + vip.getVipPT());
					}
					break;
				}
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				break end;
			}
		}
	}

	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======헬스클럽 회원관리 프로그램=======");
		System.out.println("1.일반회원 정보관리 | 2.vip회원 정보관리| 3.프로그램 종료");
		System.out.println("================================");
		System.out.print("메뉴를 선택하세요. >>> ");
		int menu = sc.nextInt();
		return menu;
	}
}