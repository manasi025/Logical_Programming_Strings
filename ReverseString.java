package stringprblms;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String str; 
		String rev = " ";
		System.out.print("Enter a word : ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		for(int i = str.length() -1 ; i >= 0; i--)
			rev  = rev + str.charAt(i);
		System.out.println("Reverse string is : " + rev);
	}
}
