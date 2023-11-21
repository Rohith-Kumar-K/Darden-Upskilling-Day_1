/**
 * 
 */
package basics;

import java.util.Scanner;

/**
 * @author rohikn
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	
	public static void fibo(int n){
		int num1=0,num2=1,num3;
		
		System.out.print(num1+" "+num2);
		
		for(int i=2;i<n;i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			
			num1=num2;
			num2=num3;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of count");
		int count=sc.nextInt();
		
		fibo(count);

	}

}
