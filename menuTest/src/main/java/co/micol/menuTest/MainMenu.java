package co.micol.menuTest;

import java.util.Scanner;

public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	
	private void mainMenu() {
		boolean b = true;
		do {
		menuTitle();
		System.out.println("원하는 작업을 선택하세요?");
		int choise = sc.nextInt();
		switch (choise) {
		case 1:
			subTitle();
			break;
		case 2:
			b = false;
			break;
		default:
			break;
		}
		} while(b);
		sc.close();
		
	}
	
	private void menuTitle() {
		System.out.println("============");
		System.out.println("= 1.입  력  =");
		System.out.println("= 2.종  료  =");
		System.out.println("============");
		
	}
	
	private void subTitle() {
		System.out.println("============");
		System.out.println("= 이  름  =");
		System.out.println("= 1. 돌아가기  =");
		System.out.println("============");
		int ll = sc.nextInt();
			
		}

	
	public void run() {
		mainMenu();
	}
	

}
