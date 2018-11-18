//package chapter01; //조
//
//public class SwitchTest {
//
//	public static void main(String[] args) {
//		
//		int month =12;
//		int days =0;
//		if(month ==1) {
//			days = 31;
//		} else if (month == 2){ 
//			days = 28;
//		} else if(month == 3) {
//			days = 31;
//		} else if(month == 4) {
//			days = 30;
//		} else if(month == 5) {
//			days = 31;
//		} else if(month == 6) {
//			days = 30;
//		} else if(month == 7) {
//			days = 31;
//		} else if(month == 8) {
//			days = 31;
//		} else if(month == 9) {
//			days = 30;
//		} else if(month == 10) {
//			days = 31;
//		} else if(month == 11) {
//			days = 30;
//		} else if(month == 12) {
//			days = 31;
//		}
//		System.out.println(month + "월은"+ days +"일까지 있습니다.");
//			
//	}
//
//}

//논리연산자

//package chapter01;
//
//public class SwitchTest {
//
//	public static void main(String[] args) {
//		
//		int month =12;
//		int days =0;
//		if(month ==1 /*/|| month == 3 노가다지만 아까보단 낫다/*/) {
//			days = 31;
//		} else if (month == 2){ 
//			days = 28;
//		} else if(month == 3) {
//			days = 31;
//		} else if(month == 4) {
//			days = 30;
//		} else if(month == 5) {
//			days = 31;
//		} else if(month == 6) {
//			days = 30;
//		} else if(month == 7) {
//			days = 31;
//		} else if(month == 8) {
//			days = 31;
//		} else if(month == 9) {
//			days = 30;
//		} else if(month == 10) {
//			days = 31;
//		} else if(month == 11) {
//			days = 30;
//		} else if(month == 12) {
//			days = 31;
//		}
//		System.out.println(month + "월은"+ days +"일까지 있습니다.");
//			
//	}
//
//}
// 스위치

package chapter01;

public class SwitchTest {

	public static void main(String[] args) {

		int month = 12;
		int days = 0; // 왜안되

		switch (month) { // 모으는건 브레이크를 안쓰고 모을수있다 예를들어 케이스만 이으고 맨아래만 작성
		case 1: {
			days = 31;
			break;
		}
		case 2: {
			days = 28;
			break;
		}
		case 3: {
			days = 31;
			break;
		}
		case 4: {
			days = 30;
			break;
		}
		case 5: {
			days = 31;
			break;
		}
		case 6: {
			days = 30;
			break;
		}
		case 7: {
			days = 31;
			break;
		}
		case 8: {
			days = 31;
			break;
		}
		case 9: {
			days = 31;
			break;
		}
		case 10: {
			days = 31;
			break;
		}
		case 11: {
			days = 30;
			break;
		}
		case 12: {
			days = 31;
			break;
		}
		default: {
			days = 0;
			break;
		}
		
		}
		System.out.println(month + "월은"+ days +"일까지 있습니다.");
	}

}
