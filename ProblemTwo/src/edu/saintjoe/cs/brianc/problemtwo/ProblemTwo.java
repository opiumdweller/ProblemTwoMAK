package edu.saintjoe.cs.brianc.problemtwo;

public class ProblemTwo {
	int first;
	int second;
	int michaelKeisling;
	String one = "Here we go!!";
	String two;
	String michaelKeisling = "I'm going to get an A!!";
	
	public int getFirst() {
		return first;
	}
	
	public void setFirst(int newValue) {
		first = newValue;
	}
	
	public String gettwo() {
		return two;
	}

	public static void main(String[] args) {
		// Creat a new ProblemTwo object, reference it with myProblem
		ProblemTwo myProblem = new ProblemTwo();
		
		// Assign something to the data member named "two"
		myProblem.two = "This is the best part; the part I really like";
		
		// Prove that it worked by printing the value back out
		System.out.println("We have '" + myProblem.gettwo() + "' for variable two");

	}

}
