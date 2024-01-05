package StringAssignment;

public class RemoveAppendX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcxXXcxerxxXXwer";
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c != 'x') {
                result.append(c);
            }
        }

        for (char c : input.toCharArray()) {
            if (c == 'x') {
                result.append(c);
            }
        }

        System.out.println(result.toString());
	}

}
