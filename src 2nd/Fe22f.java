
public class Fe22f {

//	피보나치
	public static int Fibo(int num) {

		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 2;
		} else {
			return Fibo(num - 1) + Fibo(num - 2);
		}
	}

	public static void main(String[] args) {

//		피보나치임

//		An-1+An-2=An

//		4면 1,2,3,5
//		6이면 1,2,3,5,8,13
//		안배웠지만 셀프참조 만들어야할듯
		int num = 4;

		System.out.println(Fibo(num));

	}
}
