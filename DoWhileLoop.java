package ControlFlow;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1, n = 10, var1 = 0, var2 = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	     do {
	    	System.out.print(var1 + ", ");
	    	int temp = var1 + var2;
	    	var1 = var2;
	    	var2 = temp;
	    	i++;
	    } while (i <= n);
	}

}
