package ControlFlow;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input1 = 1, input2 = 100;

        while (input1 < input2) {
            boolean flag = false;
            
            for(int i = 2; i <= input1/2; ++i) {
                if(input1 % i == 0) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag && input1 != 0 && input1 != 1)
                System.out.print(input1 + " ");
            ++input1;
        }

	}

}
