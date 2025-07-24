package com.wipro.test;

import com.wipro.exception.InvalidVoterException;

public class CustomExceptionTest {

	public static void main(String[] args)  {
	 
		try {
			checkVotingAge(16);
		} catch (InvalidVoterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	static void checkVotingAge(int age) throws InvalidVoterException
	{
		if(age<18)
		{
			throw new InvalidVoterException("Invalid Voting Age");
		}
		else
		{
			System.out.println("Eligible to Vote");
		}
			
	}

}
