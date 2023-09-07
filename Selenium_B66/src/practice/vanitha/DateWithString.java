package practice.vanitha;
public class DateWithString 
{
	public static void main(String[] args) 
	{
		
		String date = "10/2/2022";
		date.toCharArray();
		for(int i=0 ; i<date.length() ; i++)
		{
			System.out.println(date.charAt(i));
			if(date.charAt(i) == '/')
			{
				date.replace('/', ' ');
			}
		}
		for(int i=0 ; i<date.length() ; i++)
		{
			System.out.println(date.charAt(i));
		}
	}
}
