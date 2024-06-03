package service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChoiceChoice extends Total{
	private int choice;
	private int[] choiceSentence;
	
	public ChoiceChoice(Map<Integer, String> StoryNum, String[] address, int choice, int[] choiceSentence) {
		super(StoryNum, address);
		this.choice = choice;
		this.choiceSentence = choiceSentence;
	}
	
	public void start() {
		System.out.println();
		System.out.println("< " + StoryNum.get(choice + 1) + " >");
		List<String> Lines = this.storage(address[choice]);
		this.base(Lines);
	}
	
	// 지문을 1줄씩 암기하는 핵심 메서드
	public void base(List<String> that) {
		Scanner sc = new Scanner(System.in);
		List<String> Lines = that;

		// 지문전체 암기 시작
		for (int h = 0; h < choiceSentence.length; h += 1) {
			while (true) {
				// 띄어쓰기를 기준으로 정답과 학생의 답안을 문자열 배열로 저장함
				System.out.println((h + 1) + "번째 문장 : " + Lines.get(choiceSentence[h]-1));
				System.out.print((h + 1) + "번째 입력 : ");
				String write = sc.nextLine();
				String[] answers = Lines.get(choiceSentence[h]-1).split(" ");
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
