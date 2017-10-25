package lab9;

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		
		Stack stack1= new Stack();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string with delimeters such as ( , } , ] ");
		String x = input.nextLine();
		input.close();
		String str;
		
		for(int i =0;i<x.length();i++)
		{
			if(x.charAt(i)=='(' || x.charAt(i)=='{'|| x.charAt(i)=='[')
			{
				stack1.push(x.charAt(i));
			}
				
			if(x.charAt(i)==')' || x.charAt(i)=='}'|| x.charAt(i)==']')
			{	
				try
				{
					str=stack1.pop().toString();
					
					if(x.charAt(i)==')' && !str.equals("(") || x.charAt(i)=='}' && !str.equals("{") ||x.charAt(i)==']' && !str.equals("["))
					{
						System.out.println("Matching error");
					}
				}
				catch(EmptyStackException e)
				{
					e.getMessage();
				}
					
			}
		}
		
		if(stack1.isEmpty())
			System.out.println("Error due to missing LEFT delimiter");
		else
			System.out.println("Error due to missing RIGHT delimiter");			

	}
}
