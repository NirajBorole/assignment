package ControlFlow;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

	}

}
