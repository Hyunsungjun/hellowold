package chapter01;

public class Arith {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 7;
		//산술
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(a % b);
		
		System.out.println(10 / 3);//int op(산술) int -> int
		System.out.println(10 / 3.);//int op(산술) int -> int
		// 증감
		a = 1;
		System.out.println(a);
		a++; // a = a+1;과 a += 1 완전히 같다  단 ++는 1씩 증가할때 쓴다
		System.out.println(a);
		
		a--;//a = a -1 , a -= 1과 같다 
		System.out.println(a);
		++a;
		System.out.println(a);
		--a;
		System.out.println(a);
		a = 1;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		
		//주의
		System.out.println((double)10/3); // 3.333
		System.out.println((double)(10.3));//10.3
		
	}

}
