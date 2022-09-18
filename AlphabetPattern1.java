package alphabet.pattern.com;

public class AlphabetPattern1 
{
	public static void main(String[] args)
	{
		int i, j, n =5;
		char ch = 65;
		
		for(i = 0; i < n; i++)
		{
			for(j = 0; j <= i; j++)
			{
				System.out.print((char) (ch+j));
			}
			System.out.println();
		}
	}
}
