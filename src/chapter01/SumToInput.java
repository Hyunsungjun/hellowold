package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		//입
		Scanner scanner = new Scanner(System.in); //생성자 이므로 () c+sh+o해서 임포트 해줘야된다
		//Scanner를 변수로 할당함으로써 사라지지 않게된
		int input = scanner.nextInt();
		
		//처리 0~input까지의 
		int sum = 0;
		for(int i = 0;i <= input; i++) {
//			sum = sum +i;
			sum += i;
		}
		//출력
		System.out.println(sum);
		
		scanner.close();

	}

}
