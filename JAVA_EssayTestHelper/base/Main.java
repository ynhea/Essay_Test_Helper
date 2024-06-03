package base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import random.ChoiceChoiceRandom;
import random.ChoiceTotalRandom;
import random.TotalRandom;
import service.ChoiceChoice;
import service.ChoiceTotal;
import service.Total;
// 스트림 : 실제의 입력이나 출력이 표현된 데이터의 이상화된 흐름

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 영어 문장 파일 경로
		String[] address = {
				"C:/Users/PC/Desktop/Eng/ThreeOne.txt",			// 3
				"C:/Users/PC/Desktop/Eng/ThreeTwo.txt",
				"C:/Users/PC/Desktop/Eng/ThreeThree.txt",
				"C:/Users/PC/Desktop/Eng/ThreeFour.txt",
				"C:/Users/PC/Desktop/Eng/FourOne.txt",			// 4
				"C:/Users/PC/Desktop/Eng/FourTwo.txt",
				"C:/Users/PC/Desktop/Eng/FourThree.txt",
				"C:/Users/PC/Desktop/Eng/FourFour.txt",
				"C:/Users/PC/Desktop/Eng/FiveOne.txt",			// 5
				"C:/Users/PC/Desktop/Eng/FiveTwo.txt",
				"C:/Users/PC/Desktop/Eng/FiveThree.txt",
				"C:/Users/PC/Desktop/Eng/FiveFour.txt",
				"C:/Users/PC/Desktop/Eng/SixOne.txt",			// 6
				"C:/Users/PC/Desktop/Eng/SixTwo.txt",
				"C:/Users/PC/Desktop/Eng/SixThree.txt",
				"C:/Users/PC/Desktop/Eng/SixFour.txt",
				"C:/Users/PC/Desktop/Eng/SevenOne.txt",			// 7
				"C:/Users/PC/Desktop/Eng/SevenTwo.txt",
				"C:/Users/PC/Desktop/Eng/SevenThree.txt",
				"C:/Users/PC/Desktop/Eng/SevenFour.txt",
				"C:/Users/PC/Desktop/Eng/NineOne.txt",			// 9
				"C:/Users/PC/Desktop/Eng/NineTwo.txt",
				"C:/Users/PC/Desktop/Eng/NineThree.txt",
				"C:/Users/PC/Desktop/Eng/NineFour.txt",
				"C:/Users/PC/Desktop/Eng/ElevenOne.txt",		// 11
				"C:/Users/PC/Desktop/Eng/ElevenTwo.txt",
				"C:/Users/PC/Desktop/Eng/ElevenThree.txt",
				"C:/Users/PC/Desktop/Eng/ElevenFour.txt",
				"C:/Users/PC/Desktop/Eng/TwentyOne.txt",		// 20
				"C:/Users/PC/Desktop/Eng/TwentyTwo.txt",
				"C:/Users/PC/Desktop/Eng/TwentyThree.txt",
				"C:/Users/PC/Desktop/Eng/TwentyoneOne.txt",		// 21
				"C:/Users/PC/Desktop/Eng/TwentyoneTwo.txt",
				"C:/Users/PC/Desktop/Eng/TwentyoneThree.txt",	
				"C:/Users/PC/Desktop/Eng/TwentytwoOne.txt",		// 22
				"C:/Users/PC/Desktop/Eng/TwentytwoTwo.txt",
				"C:/Users/PC/Desktop/Eng/TwentytwoThree.txt",
				"C:/Users/PC/Desktop/Eng/TwentythreeOne.txt",		// 23
				"C:/Users/PC/Desktop/Eng/TwentythreeTwo.txt",
				"C:/Users/PC/Desktop/Eng/TwentythreeThree.txt",
				"C:/Users/PC/Desktop/Eng/TwentyfourOne.txt",		// 24
				"C:/Users/PC/Desktop/Eng/TwentyfourTwo.txt",
				"C:/Users/PC/Desktop/Eng/TwentyfourThree.txt",
				"C:/Users/PC/Desktop/Eng/TwentyfiveOne.txt",		// 25
				"C:/Users/PC/Desktop/Eng/TwentyfiveTwo.txt",
				"C:/Users/PC/Desktop/Eng/TwentyfiveThree.txt"};
		// 한글 해석 파일 경로
		String[] korAddress = {
							"C:/Users/PC/Desktop/Kor/ThreeOne.txt",			// 3
							"C:/Users/PC/Desktop/Kor/ThreeTwo.txt",
							"C:/Users/PC/Desktop/Kor/ThreeThree.txt",
							"C:/Users/PC/Desktop/Kor/ThreeFour.txt",
							"C:/Users/PC/Desktop/Kor/FourOne.txt",			// 4
							"C:/Users/PC/Desktop/Kor/FourTwo.txt",
							"C:/Users/PC/Desktop/Kor/FourThree.txt",
							"C:/Users/PC/Desktop/Kor/FourFour.txt",
							"C:/Users/PC/Desktop/Kor/FiveOne.txt",			// 5
							"C:/Users/PC/Desktop/Kor/FiveTwo.txt",
							"C:/Users/PC/Desktop/Kor/FiveThree.txt",
							"C:/Users/PC/Desktop/Kor/FiveFour.txt",
							"C:/Users/PC/Desktop/Kor/SixOne.txt",			// 6
							"C:/Users/PC/Desktop/Kor/SixTwo.txt",
							"C:/Users/PC/Desktop/Kor/SixThree.txt",
							"C:/Users/PC/Desktop/Kor/SixFour.txt",
							"C:/Users/PC/Desktop/Kor/SevenOne.txt",			// 7
							"C:/Users/PC/Desktop/Kor/SevenTwo.txt",
							"C:/Users/PC/Desktop/Kor/SevenThree.txt",
							"C:/Users/PC/Desktop/Kor/SevenFour.txt",							
							"C:/Users/PC/Desktop/Kor/NineOne.txt",			// 9
							"C:/Users/PC/Desktop/Kor/NineTwo.txt",
							"C:/Users/PC/Desktop/Kor/NineThree.txt",
							"C:/Users/PC/Desktop/Kor/NineFour.txt",
							"C:/Users/PC/Desktop/Kor/ElevenOne.txt",		// 11
							"C:/Users/PC/Desktop/Kor/ElevenTwo.txt",
							"C:/Users/PC/Desktop/Kor/ElevenThree.txt",
							"C:/Users/PC/Desktop/Kor/ElevenFour.txt",
							"C:/Users/PC/Desktop/Kor/TwentyOne.txt",		// 20
							"C:/Users/PC/Desktop/Kor/TwentyTwo.txt",
							"C:/Users/PC/Desktop/Kor/TwentyThree.txt",
							"C:/Users/PC/Desktop/Kor/TwentyoneOne.txt",		// 21
							"C:/Users/PC/Desktop/Kor/TwentyoneTwo.txt",
							"C:/Users/PC/Desktop/Kor/TwentyoneThree.txt",		
							"C:/Users/PC/Desktop/Kor/TwentytwoOne.txt",		// 22
							"C:/Users/PC/Desktop/Kor/TwentytwoTwo.txt",
							"C:/Users/PC/Desktop/Kor/TwentytwoThree.txt",
							"C:/Users/PC/Desktop/Kor/TwentythreeOne.txt",		// 23
							"C:/Users/PC/Desktop/Kor/TwentythreeTwo.txt",
							"C:/Users/PC/Desktop/Kor/TwentythreeThree.txt",
							"C:/Users/PC/Desktop/Kor/TwentyfourOne.txt",		// 24
							"C:/Users/PC/Desktop/Kor/TwentyfourTwo.txt",
							"C:/Users/PC/Desktop/Kor/TwentyfourThree.txt",
							"C:/Users/PC/Desktop/Kor/TwentyfiveOne.txt",		// 25
							"C:/Users/PC/Desktop/Kor/TwentyfiveTwo.txt",
							"C:/Users/PC/Desktop/Kor/TwentyfiveThree.txt" };
		// 중요문장 번호
		int[][] Star = {
				{ 1,2,5 }, { 2,3,10 }, { 2,6,7 }, { 2,7,10 },		// 3
				{ 3,6,9 }, { 2,4,5 }, { 3,5,6 }, { 1,3,6 },		// 4
				{ 5,7,12 }, { 1,4,6 }, { 2,5,7 }, { 1,2,3 },		// 5
				{ 2,4,7 }, { 2,3,5 }, { 1,6,8 }, { 2,5,6 },		// 6
				{ 2,4,6 }, { 3,4,5 }, { 3,4,5 }, { 2,5,6 },		// 7
				{ 0,0,0 }, { 0,0,0 }, { 0,0,0 }, { 0,0,0 },		// 9
				{ 1,7,8 }, { 2,6,7 }, { 1,2,7 }, { 3,5,6 },		// 11
				{ 5,7,9 }, { 2,5,6 }, { 1,6,8 },			// 20
				{ 1,3,5 }, { 2,5,6 }, { 2,3,6 },			// 21
				{ 2,3,5 }, { 2,3,7 }, { 1,3,6 },			// 22
				{ 1,5,6 }, { 2,4,6 }, { 1,3,4 },			// 23
				{ 2,6,9 }, { 1,4,8 }, { 3,4,5 },			// 24
				{ 2,5,7 }, { 2,5,6 }, { 1,2,6 },			// 25
		};
		// 지문과 해당 번호
		Map<Integer, String> StoryNum = new HashMap<Integer, String>() {{
			put(1, "3강 1번");	put(2, "3강 2번");	put(3, "3강 3번");	put(4, "3강 4번");
			put(5, "4강 1번");	put(6, "4강 2번");	put(7, "4강 3번");	put(8, "4강 4번");
			put(9, "5강 1번");	put(10, "5강 2번");	put(11, "5강 3번");	put(12, "5강 4번");
			put(13, "6강 1번");	put(14, "6강 2번");	put(15, "6강 3번");	put(16, "6강 4번");
			put(17, "7강 1번");	put(18, "7강 2번");	put(19, "7강 3번");	put(20, "7강 4번");
			put(21, "9강 1번");	put(22, "9강 2번");	put(23, "9강 3번");	put(24, "9강 4번");
			put(25, "11강 1번");	put(26, "11강 2번");	put(27, "11강 3번");	put(28, "11강 4번");
			put(29, "20강 1번");	put(30, "20강 2번");	put(31, "20강 3번");
			put(32, "21강 1번");	put(33, "21강 2번");	put(34, "21강 3번");
			put(35, "22강 1번");	put(36, "22강 2번");	put(37, "22강 3번");
			put(38, "23강 1번");	put(39, "23강 2번");	put(40, "23강 3번");
			put(41, "24강 1번");	put(42, "24강 2번");	put(43, "24강 3번");
			put(44, "25강 1번");	put(45, "25강 2번");	put(46, "25강 3번");
		}};
		
		while (true) {
			// 메뉴 선택
			System.out.println("\n<서술형 암기 프로그램 종류>");
			System.out.println("1. 전체 지문 암기");
			System.out.println("2. 선택 지문 전체 암기");
			System.out.println("3. 선택 지문 선택 문장 암기");
			System.out.println("4. 전체 지문 중요 문장 암기 (참조 : 스승의 날 분석지)");
			System.out.println("-------------------------------------------");
			System.out.println("5. 전체 지문 재배열");
			System.out.println("6. 선택 지문 전체문장 재배열");
			System.out.println("7. 선택 지문 선택 문장 재배열");
			System.out.println("8. 전체 지문 중요 문장 재배열");
			System.out.println("-------------------------------------------");
			System.out.println("9. 종료");
			System.out.print("선택번호 입력 > ");
			int menu = sc.nextInt();
			
			// 선택메뉴 입장
			if 		(menu == 1) { Total T = new Total(StoryNum, address); T.start(); }
			else if (menu == 2) { ChoiceTotal CT = new ChoiceTotal(StoryNum, address, choices(StoryNum)); CT.start(); }
			else if (menu == 3) {
				while (true) {
					// 지문 나열해 출력하기
					for (Entry<Integer, String> SN : StoryNum.entrySet()) {
						System.out.print(SN.getKey() + " : " + SN.getValue() + "\t");
						if 		(SN.getKey() < 29 && SN.getKey() % 4 == 0) System.out.println();
						else if (SN.getKey() > 29 && SN.getKey() % 3 == 1) System.out.println();
					}
					System.out.println("0 : 메뉴로 이동");
					
					// 선택할 지문번호 입력받기
					System.out.print("암기할 지문번호 : ");
					int choice = sc.nextInt();
					
					// 예외처리 & 선택할 문장개수 & 문장번호 입력받기
					if 		(choice == 0) 							  break;
					else if (choice > StoryNum.size() || choice < 0)  System.out.println("범위에 없는 지문입니다! 다시 입력해주세요");
					else {	 System.out.print("암기할 문장개수 : ");
							 int choiceNum = sc.nextInt();
							 int[] choiceSentence = new int[choiceNum];
							 System.out.print("암기할 문장번호 : ");
							 for (int i = 0; i < choiceNum; i += 1) choiceSentence[i] = sc.nextInt();
						
							 ChoiceChoice CC = new ChoiceChoice(StoryNum, address, choice, choiceSentence);
							 CC.start();
					}
				}
			}
			else if (menu == 4) {
				for (int i = 0; i < StoryNum.size(); i += 1)
					{ ChoiceChoice CC = new ChoiceChoice(StoryNum, address, i, Star[i]); CC.start(); }
			}
			else if (menu == 5) { TotalRandom T = new TotalRandom(StoryNum, address, korAddress); T.start(); }
			else if (menu == 6) { ChoiceTotalRandom T = new ChoiceTotalRandom(StoryNum, address, korAddress, choices(StoryNum)); T.start(); }
			else if (menu == 7) {
				while (true) {
					// 지문 나열해 출력하기
					for (Entry<Integer, String> SN : StoryNum.entrySet()) {
						System.out.print(SN.getKey() + " : " + SN.getValue() + "\t");
						if 		(SN.getKey() < 29 && SN.getKey() % 4 == 0) System.out.println();
						else if (SN.getKey() > 29 && SN.getKey() % 3 == 1) System.out.println();
					}
					System.out.println("0 : 메뉴로 이동");
					
					// 선택할 지문번호 입력받기
					System.out.print("암기할 지문번호 : ");
					int choice = sc.nextInt();
					
					// 예외처리 & 선택할 문장개수 & 문장번호 입력받기
					if 		(choice == 0) 							  break;
					else if (choice > StoryNum.size() || choice < 0)  System.out.println("범위에 없는 지문입니다! 다시 입력해주세요");
					else {	 System.out.print("암기할 문장개수 : ");
							 int choiceNum = sc.nextInt();
							 int[] choiceSentence = new int[choiceNum];
							 System.out.print("암기할 문장번호 : ");
							 for (int i = 0; i < choiceNum; i += 1) choiceSentence[i] = sc.nextInt();
						
							 ChoiceChoiceRandom CCR = new ChoiceChoiceRandom(StoryNum, address, korAddress, choice -1, choiceSentence);
							 CCR.start();
					}
				}
			}
			else if (menu == 8) {
				for (int i = 0; i < StoryNum.size(); i += 1) 
					{ ChoiceChoiceRandom CCR = new ChoiceChoiceRandom(StoryNum, address, korAddress, i, Star[i]); CCR.start(); }
			}
			else if (menu == 9) { System.out.println("서술형 암기 프로그램을 종료합니다."); break; }
			else				System.out.println("입력하신 번호에 해당하는 메뉴가 없습니다.\n");
		}
	}
	

	// 지문 선택 메서드
	// 정적 메서드(static 메서드) : Main클래스의 객체생성 없이 사용가능함
	public static int[] choices(Map<Integer, String> StoryNum) {
		Scanner sc = new Scanner(System.in);
		// 선택할 지문개수 입력받기
		System.out.print("선택할 지문 개수 : ");
		int choiceNum = sc.nextInt();
		
		// 지문 나열해 출력하기
		for (Entry<Integer, String> SN : StoryNum.entrySet()) {
			System.out.print(SN.getKey() + " : " + SN.getValue() + "\t");
			if 		(SN.getKey() < 29 && SN.getKey() % 4 == 0) System.out.println();
			else if (SN.getKey() > 29 && SN.getKey() % 3 == 1) System.out.println();
		}

		// 선택할 지문번호 입력받기
		int[] choices = new int[choiceNum];
		for (int i = 0; i < choiceNum; i += 1) {
			System.out.print((i+1) + "번째로 암기할 지문번호 : ");
			choices[i] = sc.nextInt();
		}
		return choices;
	}

}
