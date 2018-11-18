//package chapter01;
//
//import java.util.Scanner;
//
//public class PrimeDetect {
//
//	public static void main(String[] args) {
//		
//		//입	력
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("판별 할 수:");
//		int number = scanner.nextInt();
//		//처리 (소수인지 판별)
//		boolean isPrime = true;
//		
//		
//		//출력
//		if(isPrime) {
//			System.out.println("소수가 맞습니다.");
//		}else {
//				System.out.println("소수가 아닙니다.");
//			}
//		}
//	}
//
//
package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		
		//입	력
		Scanner scanner = new Scanner(System.in);
		System.out.print("판별 할 수:");
		int number = scanner.nextInt();
		//처리 (소수인지 판별)
		boolean isPrime = true;
		int i = 2;
		while(i <number) {
			System.out.println(i);
			if(number %i==0) {
				isPrime = false;
				break;
			}
			i++;
		}
//		출력
		if(isPrime) {
			System.out.println("소수가 맞습니다.");
		}else {
				System.out.println("소수가 아닙니다.");
			}
		}
	}