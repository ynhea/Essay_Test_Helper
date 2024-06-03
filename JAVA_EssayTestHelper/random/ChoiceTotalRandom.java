package random;

import java.util.List;
import java.util.Map;

public class ChoiceTotalRandom extends TotalRandom{
	private int[] choices;
	public ChoiceTotalRandom (Map<Integer, String> StoryNum, String[] address, String[] korAddress, int[] choices) {
		super(StoryNum, address, korAddress);
		this.choices = choices;
	}
	public void start() {
		for (int i = 0; i < this.choices.length; i += 1) {
			System.out.println();
			System.out.println("< " + StoryNum.get(choices[i]) + " >");
			List<String> Lines = this.storage(address[choices[i]-1]);
			List<String> korLines = this.storage(korAddress[choices[i]-1]);
			this.newbase(Lines, korLines);
			System.out.println();
		}
	}
}
