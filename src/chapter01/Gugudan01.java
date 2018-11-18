package chapter01;

public class Gugudan01 {

	public static void main(String[] args) {
		int i = 1;
		while( i <= 9) {
//			System.out.println(i);
			int j = 1; //안에서만 존재하는 지역변
			while(j <= 9) {
				System.out.print(i+"*"+j+"="+(i*j));
				j++;
			}
//			System.out.println("=================");
			i++;
		}
	}

}
