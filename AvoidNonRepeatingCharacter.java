package com;

import java.util.Scanner;

public class AvoidNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char[] ch= str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]!=ch[j]) {
				}
				else
					count++;
			}
			if(count==1) {
				System.out.println(ch[i]);
				return;
			}
		}
		System.out.println("$");
	}
}
