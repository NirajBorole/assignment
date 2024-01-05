package StringAssignment;

public class NextChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello java";
		StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char nextChar = (char) (c + 1);
                result.append(nextChar);
            } else {
                result.append(c);
            }
        }
        
        System.out.println(result.toString());

	}

}
