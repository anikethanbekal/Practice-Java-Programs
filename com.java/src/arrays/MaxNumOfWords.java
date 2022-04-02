package arrays;
/*Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.*/

public class MaxNumOfWords {
	// m1
	public static int method1(String[] sentences) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < sentences.length; i++) {
			String[] str = sentences[i].split("\\s");
			int senlen = str.length;
			if (senlen > max) {
				max = senlen;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
		method1(sentences);
	}

}
