package chapter01;

public class VariableTest {
	public static void main(String[] args) {
		byte b = 1;
		short s = 10;
		int i = 2000;
		long l = 1234567;
		long i2 = 1234567890L;
		float f = 3.14f; //처음에 double로 인식해서 그
		double d = 3.14;
		char c = 'A';
		boolean bool = true;
		
		
		
		
		String str = "Hello"; //클래스
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		
		//(지역)변수는 초기화가 되어야 한다.
		//안되어 있는 상태로 사용하면 오류가 난
		
//		int j;
//		System.out.println(j); //에러 나는 구문 쓰래기값 (의도하지 않은 값 이클립스가 막아줌)
		
		//상수 설명 초기화 가능하
		i = 30;
//		int number = 12345;
//		number = 54321; //이러면 변수
		final int NUMBER = 12345; //이러면 상수 변하지 않아서 관례로 대문자로 써
		//오류
//		number = 54321; // final이 붙어있는 값은 초기화가 안되서
		System.out.println("NUMVER");
		System.out.println(Math.PI);
//		String str = new String("Hello"); 숨어있는 클라스
	}

}
