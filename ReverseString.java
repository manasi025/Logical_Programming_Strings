package stringprblms;

import java.util.Scanner;

public class ReverseString 
{
	private static char rev = 0;

	public static void main(String[] args) 
	{
		String str; 
		String revstr = " ";
		System.out.print("Enter a word : ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		ReverseString(str);
	}

	private static void ReverseString(String str) {
		// TODO Auto-generated method stub
		String revstr = " ";
		for(int i = str.length() - 1; i >= 0; i--)
		{
			revstr = revstr + str.charAt(i);
		}
		System.out.println("Reversed String is = " + revstr);
		return;
	}
}

/*

OUTPUT:

Enter a word : abc
Reversed String is =  cba

*/
