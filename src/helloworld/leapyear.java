package helloworld;

import java.util.*;
public class leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if(k%4==0) {
			if(k%100==0) {
				if(k%400==0) {
					System.out.println("leap year");
				}
				else {
					System.out.println("not leap year");
				}
			}
			else {
				System.out.println("leap year");
			}
		}
		else {
			System.out.println("not leap year");
		}
		
		
		
	}

}
