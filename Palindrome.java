package bridgelabz;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String str, rev = "";
		System.out.print("Enter a word : ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		Palindrome pal = new Palindrome();
		rev = pal.reverse(str);
		System.out.println("Reversed string = " + rev);
		pal.palindrome(str, rev);
	}

	private String reverse(String str) {
		// TODO Auto-generated method stub
		String revstr = " ";
		for(int i = str.length() - 1; i >= 0; i--)
		{
			revstr = revstr + str.charAt(i);
		}
		return revstr;
	}

	private void palindrome(String str, String revstr) {
		// TODO Auto-generated method stub
		if(revstr.equals(str))
		
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}
