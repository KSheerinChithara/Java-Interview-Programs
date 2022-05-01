package occurancecount;

import java.util.Scanner;

public class swapwithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number a and b ");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("before:"+x +" and "+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		
		System.out.println("after:"+x +" and "+y);

	}

}
