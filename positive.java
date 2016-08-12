import java.util.Scanner;


public class positive {
	public static void main(String[] args) {
		int number=0;
		System.out.println("enter the number:");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
if(number>0)
		System.out.println("the given number is positive!");
else if(number<0)
	System.out.println("The given number is negative!");
else
	System.out.println("THe given number is zero");
		
	}

}
