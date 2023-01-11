package OperatorTest;

public class TestIncrement {

	public static void main(String[] args) {
		int i = 3; //Declaration the variable i and assign a value
		int iInc; //Declaration the variable iInc
		
		iInc = i++; //Postfix operator
		System.out.println("The result of i = " + i); //Print the postfix value of i
		System.out.println("The result of iInc = " + iInc); //Print the postfix value of iInc
		
		i = 3;
		iInc = ++i; //Prefix operator
		System.out.println("The result of i = " + i); //Print the prefix value of i
		System.out.println("The result of iInc = " + iInc); //Print the prefix value of iInc
	}

}
