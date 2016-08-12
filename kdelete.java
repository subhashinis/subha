import java.util.Scanner;


public class kdelete {
	public static void main(String[] args) {
		int number=0;
		String str="";
		System.out.println("enter the number:");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		int k=0;
		System.out.println("enter the  number of digit to be deleted:");
		k=s.nextInt();
		int len=String.valueOf(number).length();
		System.out.println("length of the given number is:"+len);
		int arr[]=new int[len];
		int x=len-k;
		for(int i=len-1;i>=0;i--){
			arr[i]=number%10;
			number=number/10;
			str=str+arr[i];
			}System.out.println(str);
		String l=str.substring(0,x);
		int del=Integer.parseInt(l);
		System.out.println(del);

	}
	
}
