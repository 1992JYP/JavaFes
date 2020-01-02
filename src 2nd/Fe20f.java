
public class Fe20f {

	//재귀 안배워서 설명하기 힘들겠다..
//	콜라츠의 주장에 의하면
//	짝수는 2로 나누고 홀수는 (*3)(+1)을 반복하면 1에 도달함
	
	public static int collatz(int num) {

		int count = 0;
		if (num > 2) {
			if (num % 2 == 0) {

				count = count + collatz(num / 2);
			} else
				count = count + collatz(num * 3 + 1);
		}
		if (count == 500) {
			return -1;
		}

		return count + 1;

	}

	public static void main(String[] args) {

		System.out.println(collatz(9));
	}
}
