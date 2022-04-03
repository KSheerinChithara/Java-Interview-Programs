package extractnumber;

public class extractnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given = "hai12314123";
		char eachchar;
		
		
		for(int i= 0; i< given.length(); i++)
		{
			eachchar = given.charAt(i);
			if(Character.isDigit(eachchar))
			{
	         System.out.print(eachchar);
		}
		
	}
}
}
