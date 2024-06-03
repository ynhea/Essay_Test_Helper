package service;

import java.util.List;
import java.util.Map;

public class ChoiceTotal extends Total{
	private int[] choices;
	public ChoiceTotal(Map<Integer, String> StoryNum, String[] address, int[] choices) {
		super(StoryNum, address);
		this.choices = choices;
	}
	
	public void start() {
		for (int i = 0; i < this.choices.length; i += 1) {
			System.out.println();
			System.out.println("< " + StoryNum.get(choices[i]) + " >");
			List<String> Lines = this.storage(address[choices[i]-1]);
			this.base(Lines);
		}
	}

}
