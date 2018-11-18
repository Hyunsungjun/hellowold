package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		// implicity(암시적) type casting
		int i = 10;
		long l = i;
		System.out.println(i + ":" + l);
		//explicity (명시적) type casting
		long l2 = 123456789L;
//		int i2 = l2;//는 안되지만
		int i2 = (int)l2;//명시적으로 캐스팅하면 값이 된다
	}

}
