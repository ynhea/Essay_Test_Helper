package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChoiceChoiceRandom extends TotalRandom{
	private int choice;
	private int[] choiceSentence;
	
	public ChoiceChoiceRandom (Map<Integer, String> StoryNum, String[] address, String[] korAddress, int choice, int[] choiceSentence) {
		super(StoryNum, address, korAddress);
		this.choice = choice;
		this.choiceSentence = choiceSentence;
	}
	
	public void start() {
		System.out.println();
		System.out.println("< " + StoryNum.get(choice + 1) + " >");
		List<String> Lines = this.storage(address[choice]);
		List<String> korLines = this.storage(korAddress[choice]);
		this.newbase(Lines, korLines);
	}
	
	// 지문을 1줄씩 암기하는 핵심 메서드
	public void newbase(List<String> that, List<String> it) {
		Scanner sc = new Scanner(System.in);
		List<String> Lines = that;
		List<String> korLines = it;
		
		// 지문전체 암기 시작
		for (int h = 0; h < choiceSentence.length; h += 1) {
			while (true) {
				// 랜덤으로 보여줌 (띄어쓰기를 기준으로 /처리해 보여줌) 
				String[] answers = Lines.get(choiceSentence[h]-1).split(" ");
				List<Integer> ranNums = new ArrayList<>();
				while (true) {
					int ranNum = (int)( Math.random() * answers.length );
					if (!ranNums.contains(ranNum)) ranNums.add(ranNum);
					if (ranNums.size() == answers.length) break;
				}
				
				System.out.print((h + 1) + "번째 문장 : ");
				for (int i = 0; i < answers.length; i += 1) {
					System.out.print(answers[ranNums.get(i)] + " / "); 
					if (i == 11) {System.out.println(); System.out.print("\t ");}
					if (i == 22) {System.out.println(); System.out.print("\t ");}
					if (i == 33) {System.out.println(); System.out.print("\t ");}
					if (i == 44) {System.out.println(); System.out.print("\t ");}
				}
				System.out.println("\n해석 : " + korLines.get(choiceSentence[h]-1));
				
				System.out.print((h + 1) + "번째 입력 : ");
				String write = sc.nextLine();
				String[] writes = new String[answers.length];
				String[] writess = write.split(" ");

				// 답안 저장
				if (writess.length < answers.length) {
					for (int j = 0; j < writess.length; j += 1) {
						writes[j] = writess[j];
					}
					for (int k = writess.length; k < writes.length; k += 1) {
						writes[k] =  "입력X";
					}
				}
				else writes = writess;
				
				// 채점
				int num = 0;
				System.out.println();
				System.out.println("※틀린 단어 ※\n<정답  - 답안>");
				
				if (writess.length > answers.length) {									// 초과
					for (int i = 0; i < answers.length; i += 1) {
						if (!answers[i].equals(writes[i])) {
							// 틀린 단어 출력
							System.out.print(answers[i] + " - " + writes[i] + "\n");
							num += 1;
							}
					}
					System.out.println("입력초과"); num += 1;
				}
				else {																	// 똑같 + 적게
					for (int i = 0; i < answers.length; i += 1) {
						if (!answers[i].equals(writes[i])) {
							// 틀린 단어 출력
							System.out.print(answers[i] + " - " + writes[i] + "\n");
							num += 1;
							}
					}
				}

				// 틀린 개수 출력
				if (num == 0) { System.out.println("없음"); System.out.println("틀린 개수 : " + num + " 개\n"); break; }
				else 		  { System.out.println("틀린 개수 : " + num + " 개\n"); }
			}
		}
	}
}
