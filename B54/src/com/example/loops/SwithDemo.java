/**

 * 
 */

package com.example.loops;
import java.util.Scanner;
/**
 * @author SAi
 *
 */
public class SwithDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		char x = input.next().charAt(0);
		//char x = '1';
		switch(x)
		{
		case 'l':
		case 'L':
		System.out.println(x+" is a Letter");
		break;
		case 'd':
		case 'D':
		System.out.println(x+" is a Digit");
		break;
		case 'w':
		case 'W':
		System.out.println(x+" is White Space");
		break;
		case 's':
		case 'S':
		System.out.println(x+" is Special Symbol");
		default:
		System.out.println(x+" is other than letter, digit, space or special symbol ");
		break;

		}

	}

}
