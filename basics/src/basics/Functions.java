/**
 * 
 */
package basics;

import java.util.Scanner;

/**
 * @author rohikn
 *
 */
public class Functions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X");
		x=sc.nextInt();
		System.out.println("Enter the value of Y");
		y=sc.nextInt();
		
		z=add(x,y);
		System.out.println("Z= "+z);

	}
	
	public static int add(int a,int b) {
		int results=a+b;
		return results;
	}
	

}
