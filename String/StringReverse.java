package StringAssignment;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "computer";
        
        char[] ch = input.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = ch.length - 1; i >= 0; i--) {
            result.append(ch[i]);
            if (i != 0) {
                result.append("-");
            }
        }
        
        System.out.println(result.toString());
		
	}
	

}
