package test;

import java.util.Scanner;

public class DiguiDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		f(i,j);
		sc.close();
	}
	public static void f(int i ,int j) {
		if(i>j) {
			return ;
		}
		System.out.print(i);
		f(i+1,j);
	}
}
