//Program to count no. of characters in a string.

package stringprblms;

import java.util.Scanner;

public class CountCharactersInString {

	public static void main(String[] args)
	{
		String str;
		System.out.print("Enter a word = ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		//int size = str.length();
		CountCharactersInString(str);
	}

	private static void CountCharactersInString(String str) {
		// TODO Auto-generated method stub
		for(int i = 0; i < str.length(); i++)
		{
			System.out.println("No. of characters in the given string are = " + str.length());
			i++;
			break;
		}
	}

}

