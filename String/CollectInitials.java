package StringAssignment;

public class CollectInitials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Pheonix software labs";
		
		StringBuilder acronymBuilder = new StringBuilder();

        String[] words = input.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                acronymBuilder.append(word.charAt(0));
            }
        }
        
        System.out.println(acronymBuilder.toString().toUpperCase());

	}

}
