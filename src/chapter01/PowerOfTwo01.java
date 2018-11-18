package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);{
			
			//입력받
//			System.out.println("승수>");//println 계행문자라 \n쓴거랑 같다
			System.out.print("승수>");//println 계행문자라
			int power = scanner.nextInt();//숫자 받는 
//			System.out.println(power);
			//2의 power승을 출력(처리)
			int result = 1;
			int count = 0;
			while(count < power) {
				result = result *2;
				count++;
			}
			//출력하기
			System.out.println("2에 "+power+"승은"+result+"입니다.");//println 계행문자라
			
			
			
			
			scanner.close();
		}
	
	}

}
