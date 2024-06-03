package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Total {
	protected Map<Integer, String> StoryNum;
	protected String[] address;
	
	public Total(Map<Integer, String> StoryNum, String[] address) {
		this.StoryNum = StoryNum;
		this.address = address;
	}
	
	// 지문을 1개씩 반복해주는 start메서드
	public void start() {
		for (int i = 0; i < StoryNum.size(); i += 1) {
			System.out.println("< " + StoryNum.get(i + 1) + " >");
			List<String> Lines = this.storage(address[i]);
			this.base(Lines);
			System.out.println();
		}
	}
	
	// 지문을 1줄씩 저장하는 메서드
	public List<String> storage(String address) {
		List<String> Lines = new ArrayList<String>();	// 1줄씩 저장하는 리스트	( 리스트 : 크기가 정해져 있지 않은 배열 )
		try (BufferedReader bufReader = new BufferedReader(new FileReader(address))) {
			String line = "";	// buf로 1줄씩 읽은 것을 저장하는 문자열 변수
			while ((line = bufReader.readLine()) != null) Lines.add(line);
		}
		catch (FileNotFoundException e1) e1.printStackTrace();
  		catch (IOException e)  		 e.printStackTrace();
       		}
		
		/*
  		try {
			FileReader fileReader = new FileReader(address);
			BufferedReader bufReader = new BufferedReader(fileReader);
			
			String line = "";	// buf로 1줄씩 읽은 것을 저장하는 문자열 변수
			try { 	while ((line = bufReader.readLine()) != null) Lines.add(line);	}
			catch (IOException e1) { e1.printStackTrace(); }
			try { bufReader.close(); }
			catch (IOException e1) { e1.printStackTrace(); }
		}
		catch (FileNotFoundException e1) { e1.printStackTrace(); }
		*/ 
		return Lines;
	}
	
	// 지문을 1줄씩 암기하는 핵심 메서드
	public void base(List<String> that) {
		Scanner sc = new Scanner(System.in);
		List<String> Lines = that;

		// 지문전체 암기 시작
		for (int h = 0; h < Lines.size(); h += 1) {
			while (true) {
				// 띄어쓰기를 기준으로 정답과 학생의 답안을 문자열 배열로 저장함
				System.out.println((h + 1) + "번째 문장 : " + Lines.get(h));
				System.out.print((h + 1) + "번째 입력 : ");
				String write = sc.nextLine();
				String[] answers = Lines.get(h).split(" ");
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
