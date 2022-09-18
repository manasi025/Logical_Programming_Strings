package bridgelabz;

public class ReplaceCharacter {

	public static void main(String[] args) {
		 String str = "madam";
		String res = " ";
		
		for(int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a')
			{
				res+= 'e';
			}
			else
			{
				res+= str.charAt(i);
			}
		}
		System.out.print("Edited string is = " +res);
	}
}
