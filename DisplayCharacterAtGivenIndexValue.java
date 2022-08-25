//Program to display the character on the given index number in a string.

package stringprblms;

import java.util.Scanner;

public class DisplayCharacterAtGivenIndexValue 
{
	public static void main(String[] args)
	{
		String str;
		System.out.print("Enter a 10 letter word : ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		DisplayCharacterAtGivenIndexValue(str);
	}

	private static void DisplayCharacterAtGivenIndexValue(String str) 
	{
		// TODO Auto-generated method stub
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				i++;
				break;
			}
		}
		System.out.println("The character displayed at index value 5 = " + str.charAt(5));
	}
}

/*
OUTPUT :

Enter a 10 letter word : qwertyuiop
The character displayed at index value 5 = y

*/
