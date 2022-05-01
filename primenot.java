package occurancecount;

import java.util.Scanner;

public class primenot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");

		int n = sc.nextInt();
	
		int count = 0;
		if(n>1)
		{
			for(int i =1; i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
				if(count == 2)
				
					System.out.println("prime");
				
				else
					System.out.println("no prime");
				
		}
		
		else
		{
			System.out.println("not prime");
		}
			

	}

}
