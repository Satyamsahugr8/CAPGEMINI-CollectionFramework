package com.java.afterCapgeminiTrainingQuestion;

import java.util.Scanner;

class UserMainCode{
	
	static int sumOfSquaresOfEvenDigits(int a) {
		
		
		int number = a ,n1 = 0,n2 = 0;
		while (number != 0) {
            n1 = number % 10;
            
            if((n1 % 2) == 0){
            	n2 += n1 * n1;
            	}
            
            number /= 10;
            }
		return n2;
    }
}

public class O8_sumOfTheSquareOfTheEvenDigit {

	public static void main(String[] args) {
		
		System.out.println("Enter number :");
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        
        UserMainCode u = new UserMainCode();
        
        int result = u.sumOfSquaresOfEvenDigits(number);
        
        System.out.println(result);
       
        
}
	}


	