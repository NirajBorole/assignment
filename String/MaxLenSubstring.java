package StringAssignment;

public class MaxLenSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi How are you";
		String[] words = input.split("\\s+");
        String maxLengthSubstring = "";

        for (String word : words) {
            if (word.length() > maxLengthSubstring.length()) {
                maxLengthSubstring = word;
            }
        }
        
        System.out.println(maxLengthSubstring);

	}

}
