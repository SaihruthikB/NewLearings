package javaE2ELearings;

public class MethodPrograming {

	public static void main(String[] args) {
		int Intergaer = sum(20, 30);
		System.out.println(Intergaer);
		prime(30);
		prime(29);
		prime(40);

	}

	// Write a function to calculate the sum of two numbers.
	public static int sum(int a, int b) {
		int sum1 = a + b;
		return sum1;
	}
      //Write a method that takes a number as input and checks if it is prime.
	public static void prime(int a) {
       if (a%2==0)
       {
    	   System.out.println("Is a prime number in main branchgit ");
       }else 
       {
    	   System.out.println("not a prime number");
       }
	}
}
