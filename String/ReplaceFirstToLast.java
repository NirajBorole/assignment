package StringAssignment;

public class ReplaceFirstToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World";
        
		 char firstChar = input.charAt(0);
         char lastChar = input.charAt(input.length() - 1);
         
         StringBuilder result = new StringBuilder(input);
         result.setCharAt(0, lastChar);
         result.setCharAt(result.length() - 1, firstChar);
         
         System.out.println(result.toString());

	}

}
